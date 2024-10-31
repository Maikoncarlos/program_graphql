package com.github.maikoncarlos.program_graphql.controller;

import com.github.maikoncarlos.program_graphql.controller.dto.TaskRequestDTO;
import com.github.maikoncarlos.program_graphql.controller.dto.TaskResponseDTO;
import com.github.maikoncarlos.program_graphql.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskService service;

    @MutationMapping
    public TaskResponseDTO addTask(@Argument TaskRequestDTO taskRequestDTO){
        return TaskResponseDTO.fromResponse(service.createdTask(taskRequestDTO));
    }

    @QueryMapping
    public List<TaskResponseDTO> findAllTask(){
        return TaskResponseDTO.fromResponseList(service.getAllTask());
    }
}
