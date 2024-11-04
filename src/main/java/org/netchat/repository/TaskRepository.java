package org.netchat.repository;

import org.netchat.model.Task;
import org.netchat.model.User;
import org.netchat.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
    List<Task> findByUserAndStatus(User user, TaskStatus status);
}
