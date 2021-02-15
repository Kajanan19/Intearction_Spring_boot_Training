package com.company.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.company.dto.TaskDTO;
import com.company.exception.ServiceException;
import com.company.models.Task;
import com.company.models.User;
import com.company.service.TaskService;
import com.company.service.UserService;

@RestController
@RequestMapping("/api/v1.0.0/")
public class TaskController {
	
	@Autowired
	UserService userService;
 
	@Autowired
	TaskService taskService;

	@PostMapping("/task/{userId}")
	public ResponseEntity<Task> createTask(@PathVariable int userId, @RequestBody TaskDTO taskDTO) {
		User user = userService.viewUserbyId(userId);
		
		Task task = new Task();
		
		task.setProgress(taskDTO.getProgress());
		task.setTaskName(taskDTO.getTaskName());
		task.setActive(taskDTO.isActive());
		task.setUser(user);
		
		Task taskReceived= new Task();
		HttpHeaders httpHeaders=new HttpHeaders();
		taskReceived=taskService.create(task);
        httpHeaders.add("Desc", "Add User");
		
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(taskReceived); 
		
	}
	
	@RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public List<Task> getAllTasks() throws ServiceException{
		return taskService.getAllTasks();
	}
	
	@RequestMapping(value = "/tasks/user/{userId}", method = RequestMethod.GET)
	public List<Task> getAllTasksByUserId(@PathVariable int userId){
		return taskService.getAllTasksByUserId(userId);
	}
	
	@RequestMapping(value = "/task/{id}", method = RequestMethod.GET)
	public Task getTaskById(@PathVariable int id) {
		return taskService.getTaskById(id);
	}
	
	@RequestMapping(value = "/task/{userId}/{id}", method = RequestMethod.PUT)
	public void updateTaskById(@PathVariable int userId, @PathVariable int id,  @RequestBody TaskDTO taskDTO) {
		User user = userService.viewUserbyId(userId);
		Task task = taskService.getTaskById(id);
		
		task.setProgress(taskDTO.getProgress());
		task.setTaskName(taskDTO.getTaskName());
		task.setActive(taskDTO.isActive());
		task.setUser(user);
		
		taskService.updateTaskbyId(task);
	}
	
	@RequestMapping(value = "/task/{id}", method = RequestMethod.DELETE)
	public void deleteTaskById(@PathVariable int id) {
		taskService.deleteTaskById(id);
	}
	
}
