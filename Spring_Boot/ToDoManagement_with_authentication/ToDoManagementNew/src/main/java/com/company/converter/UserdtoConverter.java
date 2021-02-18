package com.company.converter;

import org.springframework.stereotype.Component;

import com.company.dto.UserDTO;
import com.company.models.User;

@Component
public class UserdtoConverter {
	
	public UserDTO modelToDto(User user) {
		
		UserDTO userDTO=new UserDTO();
		
		userDTO.setUserId(user.getUserId());
		userDTO.setFirstName(user.getFirstName());
		userDTO.setUsername(user.getUsername());
		userDTO.setPassword(user.getPassword());
		
		return userDTO;
		
	}
	
	public User dtoToModel(UserDTO userDTO){

		User user=new User();
	
		user.setUserId(userDTO.getUserId());
		user.setFirstName(userDTO.getFirstName());
		user.setUsername(userDTO.getUsername());
		user.setPassword(userDTO.getPassword());
		
		return user;
		
	
	}

}
