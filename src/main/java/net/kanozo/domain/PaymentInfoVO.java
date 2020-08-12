package net.kanozo.domain;

public class PaymentInfoVO {
	private String productId;
	private String numbers;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "PaymentInfoVO [productId=" + productId + ", numbers=" + numbers + "]";
	}

}
