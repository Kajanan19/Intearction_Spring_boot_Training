package com.company.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.converter.UserdtoConverter;
import com.company.dto.UserDTO;
import com.company.exception.ServiceException;
import com.company.models.User;
import com.company.service.UserService;

@RestController
@RequestMapping("/api/v1.0.0/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> viewAllUsers() throws ServiceException{
		
		List<User> user=new ArrayList<>();
		user = userService.viewAllUsers();
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Desc", "viewAllUsers");
		return ResponseEntity.status(HttpStatus.FOUND).headers(httpHeaders).body(user);
	}
	
	@RequestMapping(value = "users/{id}", method=RequestMethod.GET)
	public ResponseEntity<User> viewUserbyId(@PathVariable int id) {
		
		User user=new User();
		user= userService.viewUserbyId(id);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Desc", "view User by Id");
		return ResponseEntity.status(HttpStatus.FOUND).headers(httpHeaders).body(user); 
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {
		
		UserdtoConverter userdtoConverter=new UserdtoConverter();
		User user= new User();
		
		HttpHeaders httpHeaders=new HttpHeaders();
		user=userService.addUser(userdtoConverter.dtoToModel(userDTO));
		httpHeaders.add("Desc", "view User by Id");
		
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(user); 
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUserById(@PathVariable int id, @RequestBody UserDTO userDTO) {
		
		UserdtoConverter userdtoConverter=new UserdtoConverter();
		User user= new User();
	
		HttpHeaders httpHeaders=new HttpHeaders();
		user=userService.updateUserById(id,userdtoConverter.dtoToModel(userDTO));
		httpHeaders.add("Desc", "update User By Id");
		
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(user);
		
		
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void deleteUserById(@PathVariable int id) {
		userService.deleteUserById(id);
	}

}
