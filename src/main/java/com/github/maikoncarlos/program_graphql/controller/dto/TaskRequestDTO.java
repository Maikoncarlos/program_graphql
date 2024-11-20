package com.github.maikoncarlos.program_graphql.controller.dto;

import com.github.maikoncarlos.program_graphql.service.StatusType;

public record TaskRequestDTO(String description,
                             StatusType status_type) {
}
