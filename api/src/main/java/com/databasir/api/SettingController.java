package com.databasir.api;

import com.databasir.common.JsonData;
import com.databasir.core.domain.log.annotation.Operation;
import com.databasir.core.domain.system.data.SystemEmailResponse;
import com.databasir.core.domain.system.data.SystemEmailUpdateRequest;
import com.databasir.core.domain.system.service.SystemService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Validated
@PreAuthorize("hasAnyAuthority('SYS_OWNER')")
public class SettingController {

    private final SystemService systemService;

    @GetMapping(Routes.Setting.GET_SYS_EMAIL)
    public JsonData<SystemEmailResponse> getSystemEmailSetting() {
        return systemService.getEmailSetting()
                .map(JsonData::ok)
                .orElseGet(JsonData::ok);
    }

    @DeleteMapping(Routes.Setting.DELETE_SYS_EMAIL)
    @Operation(module = Operation.Modules.SETTING, name = "重置系统邮箱")
    public JsonData<Void> deleteSysEmail() {
        systemService.deleteSystemEmail();
        return JsonData.ok();
    }

    @PostMapping(Routes.Setting.UPDATE_SYS_EMAIL)
    @Operation(module = Operation.Modules.SETTING, name = "更新邮件配置")
    public JsonData<Void> updateSystemEmailSetting(@RequestBody @Valid SystemEmailUpdateRequest request) {
        systemService.updateEmailSetting(request);
        return JsonData.ok();
    }
}
