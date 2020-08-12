<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

	<div class="container">
		<form action="/prod/payment" method="POST">
			<div class="order">
				<div class="order-form">
					<div class="security-msg">
						<i class="fas fa-lock"></i>
						<h3>Secure Checkout</h3>
					</div>
					<div class="checkout">
						<div class="checkout-form">
							<h4 style="font-weight: 300; margin-top: 30px;">Shipping
								Information</h4>
							<div class="addressform">

								<c:forEach items="${paymentInfo}" var="paymentInfo">
									<input type="hidden" value="${sessionScope.user.userId}"
										name="userId">
									<input type="hidden" value="${paymentInfo.productId}"
										name="productId">
									<input type="hidden" value="${paymentInfo.numbers}"
										name="numbers">
								</c:forEach>
								<input type="text" class="checkout-form-control"
									placeholder="Address" name="address"> <input
									type="text" class="checkout-form-control" placeholder="Concat"
									name="contact"> <input type="text"
									class="checkout-form-control" placeholder="Creadit Card Number"
									name="creditcardnumber"> <input type="text"
									class="checkout-form-control"
									placeholder="Creadit Card Password" name="creditcardpassword">
								<button type="submit" class="product-buy-btn">
									<i class="fas fa-lock"></i>
									<p style="margin-left: 10px;">Secure Checkout</p>
								</button>
							</div>

						</div>
					</div>
				</div>

				<div class="order-page-summery">
					<div class="security-msg">
						<p>order Summery</p>
					</div>

					<div class="summaryproduct">
						<c:forEach items="${basket}" var="basket">
							<p>${basket.productName }</p>
						</c:forEach>

						<div class="promo">
							<div class="promo-discount">
								<p>Special Offer: Now 20% Off</p>
								<p>$${summery.totalPrice + summery.totalDiscount }</p>
							</div>
							<p
								style="text-align: right; font-size: 0.85rem; font-weight: 400;">$${summery.totalPrice
								}</p>

						</div>
					</div>



					<div class="order-page-summery-price">
						<p>Subtotal:</p>
						<p>${summery.totalPrice}</p>
					</div>
					<div class="order-page-summery-price">
						<p>Est. Sales Tax:</p>
						<p>$0.00</p>
					</div>

					<div class="order-page-summery-price f-bold">
						<p>Order Total (US Dollars):</p>
						<p>$${summery.totalPrice}</p>
					</div>
				</div>
			</div>
		</form>
	</div>

</body>

