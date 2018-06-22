package com.user.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.spring.dao.UserDao;
import com.user.spring.dto.User;

/**
 * The Class UserService.
 */
@Service
public class UserService {

	/** The user dao. */
	@Autowired
	UserDao userDao;

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	public List<User> getAllUsers() {

		return userDao.getAllUsers();
	}

	/**
	 * Save.
	 *
	 * @param user the user
	 */
	public void save(User user) {
		userDao.save(user);
	}

}
