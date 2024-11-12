package com.example.TODO.service;

import com.example.TODO.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getTaskById(Long id);

    List<Task> getAllByUserId(Long Id);

    Task create(Task task);

    Task update(Task task);

    void delete(Long id);
}
