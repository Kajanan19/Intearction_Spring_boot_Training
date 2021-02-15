package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.company.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	List<Task> findByUserUserId(int userId); 
}
