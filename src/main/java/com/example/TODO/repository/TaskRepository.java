package com.example.TODO.repository;

import com.example.TODO.domain.task.Task;

import java.util.Optional;
import java.util.List;

public interface TaskRepository {

    Optional<Task> findByID(Long id);

    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long taskId, Long userId);

    void update(Task task);

    void create(Task task);

    void delete(Long id);
}
