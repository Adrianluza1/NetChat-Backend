package org.netchat.controller;

import org.springframework.web.bind.annotation.*;

/**
 * TaskController manages task-related endpoints, enabling users to create, update, retrieve, and delete tasks.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public String getTasks() {
        // Implementación para obtener todas las tareas
        return "List of tasks";
    }

    @PostMapping
    public String createTask(@RequestBody String taskDetails) {
        // Implementación para crear una tarea
        return "Task created successfully";
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody String taskDetails) {
        // Implementación para actualizar una tarea existente
        return "Task updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        // Implementación para eliminar una tarea
        return "Task deleted successfully";
    }
}
