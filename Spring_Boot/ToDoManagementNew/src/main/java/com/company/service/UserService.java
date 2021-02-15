package com.company.service;

import java.util.List;
import com.company.models.User;

public interface UserService {

	List<User> viewAllUsers();
	User addUser(User user);
	User viewUserbyId(int id);
	User updateUserById(int id, User user);
	void deleteUserById(int id);
}
