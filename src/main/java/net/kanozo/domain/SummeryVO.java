package net.kanozo.domain;

public class SummeryVO {
	private double totalPrice;
	private double totalDiscount;


	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	@Override
	public String toString() {
		return "SummeryVO [totalPrice=" + totalPrice + ", totalDiscount=" + totalDiscount + "]";
	}

}
