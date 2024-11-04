package org.netchat.service;

import org.netchat.model.Task;
import org.netchat.model.User;
import org.netchat.model.TaskStatus;
import org.netchat.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * TaskService provides business logic for task management operations,
 * such as creating, updating, and retrieving tasks for a specific user.
 */
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasksForUser(User user) {
        return taskRepository.findByUser(user);
    }

    public List<Task> getTasksByStatus(User user, TaskStatus status) {
        return taskRepository.findByUserAndStatus(user, status);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDetails) {
        Optional<Task> existingTask = taskRepository.findById(id);
        if (existingTask.isPresent()) {
            Task taskToUpdate = existingTask.get();
            taskToUpdate.setTitle(taskDetails.getTitle());
            taskToUpdate.setDescription(taskDetails.getDescription());
            taskToUpdate.setStatus(taskDetails.getStatus());
            return taskRepository.save(taskToUpdate);
        }
        return null;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
