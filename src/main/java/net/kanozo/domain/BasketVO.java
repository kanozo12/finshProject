package net.kanozo.domain;

public class BasketVO {
	private Integer basketId;
	private Integer userId;
	private Integer productId;
	private Integer numbers;
	private Integer validity;

	public Integer getBasketId() {
		return basketId;
	}

	public void setBasketId(Integer basketId) {
		this.basketId = basketId;
	}

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

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "BasketVO [basketId=" + basketId + ", userId=" + userId + ", productId=" + productId + ", numbers="
				+ numbers + ", validity=" + validity + "]";
	}

}
