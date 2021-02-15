package com.company.service;

import java.util.List;

import com.company.models.Task;

public interface TaskService {
	Task create(Task task);
	List<Task> getAllTasks();
	List<Task> getAllTasksByUserId(int userId);
	Task getTaskById(int id);
	void updateTaskbyId(Task task);
	void deleteTaskById(int id);
}
