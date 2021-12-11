package com.acb.tasklogger.controller;

import com.acb.tasklogger.model.Task;
import com.acb.tasklogger.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {
        Task task = taskService.getTask(id);

        if (task.getId() < 1)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(task);
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Task>> getTaskList() {
        return (taskService.getTaskList() == null || taskService.getTaskList().isEmpty())
                ? new ResponseEntity<>(null, HttpStatus.NOT_FOUND)
                : ResponseEntity.ok(taskService.getTaskList());
    }

    @PostMapping(value = "/add")
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
