package com.company.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.exception.ServiceException;
import com.company.models.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> viewAllUsers() throws ServiceException {
		List<User> userList=new ArrayList<>();
		try {
			userList= userRepository.findAll();
		} catch (Exception e) {
			throw new ServiceException("user not found");
		}
		return userList;
	}
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User viewUserbyId(int id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("user id not exist"));
	}

	@Override
	public User updateUserById(int id, User user) {
		user.setUserId(id);
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}

}
