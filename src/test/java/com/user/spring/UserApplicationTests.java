package com.user.spring;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.user.spring.dao.UserDao;
import com.user.spring.dto.User;
import com.user.spring.service.UserService;

/**
 * The Class UserApplicationTests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {

	/** The user service. */
	@Autowired
	UserService userService;

	/** The user dao. */
	@Autowired
	UserDao userDao;

	/**
	 * Context loads.
	 */
	@Test
	public void contextLoads() {
		UserApplication.main(new String[] {});
	}

	/**
	 * Save user.
	 */
	@Test
	public void saveUser() {
		userDao.createUserTable();
		User user = new User();
		user.setFirstname("Test");
		user.setLastname("User");
		user.setAddress("USA");
		user.setPhone("123457890");

		userService.save(user);
	}

	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	@Test
	public void getUserList() {
		List<User> userList = userService.getAllUsers();
		assertNotNull(userList);
	}

}
