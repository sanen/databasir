package com.databasir.core.domain.project.converter;

import com.databasir.core.domain.project.data.task.ProjectSimpleTaskResponse;
import com.databasir.dao.tables.pojos.ProjectSyncTaskPojo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectSimpleTaskResponseConverter {

    List<ProjectSimpleTaskResponse> of(List<ProjectSyncTaskPojo> pojos);

    @Mapping(target = "taskId", source = "id")
    ProjectSimpleTaskResponse of(ProjectSyncTaskPojo pojo);
}
