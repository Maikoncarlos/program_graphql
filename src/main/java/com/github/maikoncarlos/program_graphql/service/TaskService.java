package com.github.maikoncarlos.program_graphql.service;

import com.github.maikoncarlos.program_graphql.controller.dto.TaskRequestDTO;
import com.github.maikoncarlos.program_graphql.repository.TaskRepository;
import com.github.maikoncarlos.program_graphql.repository.entity.TaskEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskEntity createdTask(TaskRequestDTO taskRequestDTO){
        return taskRepository.save(TaskEntity.fromEntity(taskRequestDTO));
    }

    public List<TaskEntity> getAllTask(){
        return taskRepository.findAll();
    }
}
