package com.company.dto;

import com.company.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class TaskDTO {
	
	private String taskName;
	private float progress;
	private boolean isActive;
	@JsonIgnore
	private User user;
	
	public TaskDTO() {
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public float getProgress() {
		return progress;
	}
	public void setProgress(float progress) {
		this.progress = progress;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
