package net.kanozo.domain;

public class PaymentVO {
	private Integer userId;
	private Integer productId;
	private Integer numbers;
	private String address;
	private String contact;
	private String creditcardnumber;
	private String creditcardpassword;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	public String getCreditcardpassword() {
		return creditcardpassword;
	}

	public void setCreditcardpassword(String creditcardpassword) {
		this.creditcardpassword = creditcardpassword;
	}

	@Override
	public String toString() {
		return "PaymentVO [userId=" + userId + ", productId=" + productId + ", numbers=" + numbers + ", address="
				+ address + ", contact=" + contact + ", creditcardnumber=" + creditcardnumber + ", creditcardpassword="
				+ creditcardpassword + "]";
	}

}
