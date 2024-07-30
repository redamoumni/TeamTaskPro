package com.teamtaskpro;

import org.junit.jupiter.api.Test;

import com.teamtaskpro.domain.entity.Task;
import com.teamtaskpro.domain.entity.User;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskCreation() {
        User assignee = new User("johndoe", "password", "john@example.com");
        LocalDateTime dueDate = LocalDateTime.now().plusDays(1);
        Task task = new Task("Test Task", "This is a test task", dueDate, assignee);

        assertEquals("Test Task", task.getTitle());
        assertEquals("This is a test task", task.getDescription());
        assertEquals(dueDate, task.getDueDate());
        assertEquals(assignee, task.getAssignee());
    }

    @Test
    void testTaskUpdate() {
        Task task = new Task();
        task.setTitle("Updated Task");
        task.setDescription("This is an updated task");
        LocalDateTime newDueDate = LocalDateTime.now().plusDays(2);
        task.setDueDate(newDueDate);

        assertEquals("Updated Task", task.getTitle());
        assertEquals("This is an updated task", task.getDescription());
        assertEquals(newDueDate, task.getDueDate());
    }
}