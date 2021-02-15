package com.company.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.exception.ServiceException;
import com.company.models.Task;
import com.company.repository.TaskRepository;
import com.company.service.TaskService;


@Service
public class TaskServiceImplementation implements TaskService {
     
	@Autowired
	TaskRepository taskRepository;
	
	@Override
	public Task create(Task task) {
		return taskRepository.save(task);
	}
	
	@Override
	public List<Task> getAllTasks() throws ServiceException {
		List<Task> taskList=new ArrayList<>();
		try {
			taskList=taskRepository.findAll();
		} catch (Exception e) {
			throw new ServiceException("task not found");
		}
		return taskList;
	}

	@Override
	public Task getTaskById(int id) {
		return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not exist."));
	}

	@Override
	public void updateTaskbyId(Task task) {
		taskRepository.save(task);
	}

	@Override
	public void deleteTaskById(int id) {
		taskRepository.deleteById(id);
	}

	@Override
	public List<Task> getAllTasksByUserId(int userId) {
		return taskRepository.findByUserUserId(userId);
	}

}
