package com.user.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.spring.dto.User;
import com.user.spring.service.UserService;

/**
 * The Class UserController.
 */
@RestController
public class UserController {

	/** The user service. */
	@Autowired
	UserService userService;

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	@RequestMapping(path = "/listusers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userService.getAllUsers();
	}

	/**
	 * Save.
	 *
	 * @param user the user
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@RequestBody User user) {
		userService.save(user);
	}

}
