package com.github.maikoncarlos.program_graphql.controller.dto;

import com.github.maikoncarlos.program_graphql.controller.StatusType;
import com.github.maikoncarlos.program_graphql.repository.entity.TaskEntity;

import java.util.List;
import java.util.UUID;

public record TaskResponseDTO(UUID id,
                              String description,
                              StatusType status_type) {

    public static TaskResponseDTO fromResponse(TaskEntity taskEntity) {
        return new TaskResponseDTO(taskEntity.getId(), taskEntity.getDescription(), taskEntity.getStatusType());
    }

    public static List<TaskResponseDTO> fromResponseList(List<TaskEntity> taskEntities) {
        return taskEntities.stream()
                .map(TaskResponseDTO::fromResponse)
                .toList();
    }
}
