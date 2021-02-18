package com.company.converter;
import org.springframework.stereotype.Component;
import com.company.dto.TaskDTO;
import com.company.models.Task;


@Component
public class TaskdtoConverter {
	
	public TaskDTO modelToDto(Task task) {
		
		    TaskDTO taskDTO=new TaskDTO();
			
		    taskDTO.setTaskName(task.getTaskName());
			taskDTO.setActive(task.isActive());
			taskDTO.setProgress(task.getProgress());
			taskDTO.setUser(task.getUser());
			
			return taskDTO;
			
		}
	

	
	public Task dtoToModel(TaskDTO taskDTO){

		Task task=new Task();
	
		task.setTaskName(taskDTO.getTaskName());
		task.setActive(taskDTO.isActive());
		task.setProgress(taskDTO.getProgress());
		task.setUser(taskDTO.getUser());
		
		return task;
		
	
	}
}
