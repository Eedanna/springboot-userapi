package com.user.spring.dto;

/**
 * The Class User.
 */
public class User {

	/** The firstname. */
	private String firstname;
	
	/** The lastname. */
	private String lastname;
	
	/** The address. */
	private String address;
	
	/** The phone. */
	private String phone;
	
	/**
	 * Instantiates a new user.
	 */
	public User() {};

	/**
	 * Instantiates a new user.
	 *
	 * @param firstname the firstname
	 * @param lastname the lastname
	 * @param address the address
	 * @param phone the phone
	 */
	public User(String firstname, String lastname, String address, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
	}

	/**
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the firstname.
	 *
	 * @param firstname the new firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the lastname.
	 *
	 * @param lastname the new lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", phone=" + phone
				+ "]";
	}

}
