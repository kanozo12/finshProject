<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

	<div class="container">
		<div class="my-basket">
			<div class="page-head">
				<div class="page-title">
					<h1>Your Cart</h1>
				</div>
			</div>
			<div class="basket-content">
				<div class="basket-list">
					<c:forEach items="${basket}" var="basket">
						<div class="basket-items">
							<div class="basket-product-img">
								<img src="${basket.productImgUrl}" alt="">
							</div>
							<div class="basket-product-info">
								<p class="basket-title-p">
									<a href="#">${basket.productName}</a>
								</p>
								<div class="availability">
									<p>In Stock</p>
								</div>
								<ul>
									<li>
										<p>Item No: yhk5287776</p>
									</li>
									<li>
										<p>Gender: Mens</p>
									</li>
									<li>
										<p>Hand: Right</p>
									</li>
								</ul>
							</div>
							<div class="itemAction">
								<input type="text" value="${basket.numbers}" readonly
									class="form-control">

								<button class="remove-btn" type="submit">Remove Item</button>
							</div>

							<div class="priceTotal">
								<p>${basket.price}</p>
							</div>
						</div>
					</c:forEach>
				</div>

				<div class="order-summery">
					<div class="basket-summary-title">
						<h3>Order Summary</h3>
						<div class="basket-order-summary">
							<div class="order-discount flex-justify-between mt-10"
								style="color: #DE1818;">
								<span>Discounts: </span> <span>-$ ${summery.totalDiscount }</span>
							</div>
							<div class="order-tax flex-justify-between mt-10">
								<span>Tax:</span> <span>N/A</span>
							</div>
							<div class="basket-total flex-justify-between mt-10"
								style="font-weight: bold;">
								<span>Order Total (US Dollars):</span> <span>$ ${summery.totalPrice }</span>
							</div>


							<a href="/prod/payment" class="product-buy-btn"
								style="width: 100%;">select & buy</a>

							<p class="product-promotion"
								style="text-align: center; margin: 10px 0 10px 0;">
								As low as $12 APR with Affirm <a href="#">Prequalify now</a>
							</p>

							<p style="text-align: center; margin: 20px 0 20px 0;">-Or-</p>

							<div class="paypalBtn flex-justify-center">
								<img
									src="https://www.callawaygolfpreowned.com/on/demandware.static/Sites-CGPO5-Site/-/default/v1597206719508/images/paypal/checkout_paypal.png"
									alt="">
							</div>
						</div>
					</div>

				</div>
			</div>

		</div>
	</div>
</body>