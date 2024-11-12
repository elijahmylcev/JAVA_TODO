package com.example.TODO.service.impl;

import com.example.TODO.domain.task.Task;
import com.example.TODO.service.TaskService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getTaskById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(Long Id) {
        return null;
    }

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
