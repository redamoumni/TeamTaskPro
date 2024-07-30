package com.teamtaskpro.application.service;

import com.teamtaskpro.domain.entity.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);

    Optional<Task> getTaskById(Long id);

    List<Task> getAllTasks();

    Task updateTask(Task task);

    void deleteTask(Long id);

    List<Task> getTasksByAssignee(Long userId);

    List<Task> getTasksByStatus(Task.TaskStatus status);
}