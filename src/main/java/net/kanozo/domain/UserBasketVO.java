package net.kanozo.domain;

public class UserBasketVO {
	private Integer numbers;
	private Integer price;
	private String productName;
	private String productImgUrl;
	

	public final Integer getNumbers() {
		return numbers;
	}

	public final void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public final Integer getPrice() {
		return price;
	}

	public final void setPrice(Integer price) {
		this.price = price;
	}

	public final String getProductName() {
		return productName;
	}

	public final void setProductName(String productName) {
		this.productName = productName;
	}

	public final String getProductImgUrl() {
		return productImgUrl;
	}

	public final void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}

	@Override
	public String toString() {
		return "UserBasketVO [numbers=" + numbers + ", price=" + price + ", productName=" + productName
				+ ", productImgUrl=" + productImgUrl + "]";
	}

}
