package com.databasir.api.config.security;

import com.databasir.common.JsonData;
import com.databasir.core.domain.login.data.LoginKeyResponse;
import com.databasir.core.domain.login.data.UserLoginResponse;
import com.databasir.core.domain.login.service.LoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class DatabasirAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private final ObjectMapper objectMapper;

    private final LoginService loginService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        DatabasirUserDetails user = (DatabasirUserDetails) authentication.getPrincipal();
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);

        LoginKeyResponse loginKey = loginService.generate(user.getUserPojo().getId());
        UserLoginResponse data = loginService.getUserLoginData(user.getUserPojo().getId())
                .orElseThrow(() -> new CredentialsExpiredException("请重新登陆"));
        objectMapper.writeValue(response.getWriter(), JsonData.ok(data));
    }
}
