package com.github.maikoncarlos.program_graphql.repository.entity;

import com.github.maikoncarlos.program_graphql.controller.dto.TaskRequestDTO;
import com.github.maikoncarlos.program_graphql.service.StatusType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "db_task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_task")
    private UUID id;
    @Column(name = "description")
    private String description;
    @Column(name = "status_type")
    @Enumerated(EnumType.STRING)
    private StatusType statusType;
    @Column(name = "date_update")
    private Instant dateCreated;
    @Column(name = "data_update")
    private Instant dataUpdate;

    public static TaskEntity fromEntity(TaskRequestDTO task) {
        return new TaskEntity(null, task.description(), task.status_type(), Instant.now(), null );
    }
}
