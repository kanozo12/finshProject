package net.kanozo.domain;

import java.sql.Date;

public class RegisterVO {
	private String userType;
	private String userName;
	private String password;
	private String Email;
	private Date BirthDate;
	private String Address;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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
		return BirthDate;
	}

	public final void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public final String getAddress() {
		return Address;
	}

	public final void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "RegisterVO [userType=" + userType + ", userName=" + userName + ", password=" + password + ", BirthDate="
				+ BirthDate + ", Address=" + Address + "]";
	}

}
