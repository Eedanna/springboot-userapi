package com.user.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.user.spring.dto.User;

/**
 * The Class UserDao.
 */
@Repository
public class UserDao {

	/** The jdbc template. */
	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Creates the user table.
	 */
	public void createUserTable() {
		jdbcTemplate.update("CREATE TABLE user (\r\n" + "   firstname VARCHAR(50) NOT NULL, \r\n"
				+ "   lastname VARCHAR(50) NOT NULL,\r\n" + "   address VARCHAR(200) NOT NULL,\r\n"
				+ "   phone VARCHAR(25) NOT NULL,\r\n" + ");");
	}

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	public List<User> getAllUsers() {
		return jdbcTemplate.query("select * from user", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rownumber) throws SQLException {
				User user = new User();
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getString("phone"));
				return user;
			}
		});
	}

	/**
	 * Save.
	 *
	 * @param user the user
	 * @return the int
	 */
	public int save(User user) {
		return jdbcTemplate.update("insert into user ( firstname, lastname, address, phone) " + "values( ?, ?, ? ,?)",
				new Object[] { user.getFirstname(), user.getLastname(), user.getAddress(), user.getPhone() });
	}
}
