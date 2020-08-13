<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
	<div class="container">

		<div class="order">
			<div class="order-form">
				<div class="security-msg">

					<h3 style="margin: 3rem 0 3rem;">Create An Account</h3>
				</div>
				<div class="checkout">
					<div class="checkout-form">

						<div class="addressform">

							<form action="/user/register" method="POST">
								<input type="hidden" value="C" name="userType"> <input
									type="text" class="checkout-form-control"
									placeholder="UserName" name="userName"> <input
									type="text" class="checkout-form-control"
									placeholder="Password" name="password"> <input
									type="date" class="checkout-form-control"
									placeholder="BirthDay" name="BirthDate"> <input
									type="text" class="checkout-form-control" placeholder="Address"
									name="address"> <input type="text"
									class="checkout-form-control" placeholder="Email" name="Email">

								<button type="submit" class="product-buy-btn">
									<i class="fas fa-lock"></i>
									<p style="margin-left: 10px;">Secure Checkout</p>
								</button>
							</form>
						</div>

					</div>
				</div>
			</div>

			<div class="order-page-summery"></div>
		</div>

	</div>
</body>
