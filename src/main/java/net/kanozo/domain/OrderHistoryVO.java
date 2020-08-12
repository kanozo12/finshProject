package net.kanozo.domain;

public class OrderHistoryVO {
	private String productType;
	private String productName;
	private Integer price;

	public final String getProductType() {
		return productType;
	}

	public final void setProductType(String productType) {
		this.productType = productType;
	}

	public final String getProductName() {
		return productName;
	}

	public final void setProductName(String productName) {
		this.productName = productName;
	}

	public final Integer getPrice() {
		return price;
	}

	public final void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderHistoryVO [productType=" + productType + ", productName=" + productName + ", price=" + price + "]";
	}

}
