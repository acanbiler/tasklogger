package com.acb.tasklogger.service;

import com.acb.tasklogger.model.Task;
import com.acb.tasklogger.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTaskList() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTask(Long id) {
        return taskRepository.findById(id);
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
