package net.kanozo.domain;

import java.sql.Date;

public class UserVO {
	private int userId;
	private String userType;
	private String userName;
	private String password;
	private Date birthDate;
	private String gender;
	private String email;
	private String contact;
	private String address;

	public final int getUserId() {
		return userId;
	}

	public final void setUserId(int userId) {
		this.userId = userId;
	}

	public final String getUserType() {
		return userType;
	}

	public final void setUserType(String userType) {
		this.userType = userType;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	public final Date getBirthDate() {
		return birthDate;
	}

	public final void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public final String getGender() {
		return gender;
	}

	public final void setGender(String gender) {
		this.gender = gender;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final String getContact() {
		return contact;
	}

	public final void setContact(String contact) {
		this.contact = contact;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", password="
				+ password + ", gender=" + gender + ", email=" + email + ", contact=" + contact + ", address=" + address
				+ "]";
	}

}
