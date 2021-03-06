<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

	<div class="container">
		<form action="/prod/take" method="POST">
			<input type="hidden" name="productId" value="${products.productId }">
			<input type="hidden" name="userId" value="${sessionScope.user.userId }">
			<input type="hidden" name="numbers" value="1">

			<div class="product-content">
				<div class="product-img-container">

					<div class="product-img">
						<img src="${products.productImgUrl }" alt="">
					</div>
				</div>

				<div class="product-head">

					<div class="category-breadcrumbs">
						<a href="/prod/${products.productType}" style="color: #a0a0a0;">${products.productType}/</a>
					</div>
					<h1>${products.productName}</h1>

					<div class="price-rating">
						<div class="product-price-range">
							<p class="product-price">$${products.price}</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span>
							</div>
						</div>
					</div>
					<p class="product-promotion">
						As low as $12 APR with Affirm <a href="#">Prequalify now</a>
					</p>

					<div class="why-buy-container">
						<div class="why-buy-item">
							<img
								src="https://www.callawaygolfpreowned.com/on/demandware.static/-/Sites-CGPO5-Library/default/v1597167131144/homepage/why-buy-icons/12-month.svg"
								alt="" class="why-buy-icons"> 12 Month Warranty
						</div>
						<div class="wb-divider"></div>
						<div class="why-buy-item">
							<img
								src="https://www.callawaygolfpreowned.com/on/demandware.static/-/Sites-CGPO5-Library/default/v1597167131144/homepage/why-buy-icons/headcover.svg"
								alt="" class="why-buy-icons"> Free Headcover Included
						</div>
						<div class="wb-divider"></div>
						<div class="why-buy-item">
							<img
								src="https://www.callawaygolfpreowned.com/on/demandware.static/-/Sites-CGPO5-Library/default/v1597167131144/homepage/why-buy-icons/90days.svg"
								alt="" class="why-buy-icons"> 90 Day Buy-Back Policy
						</div>
						<div class="wb-divider"></div>
						<div class="why-buy-item">
							<img
								src="https://www.callawaygolfpreowned.com/on/demandware.static/-/Sites-CGPO5-Library/default/v1597167131144/homepage/why-buy-icons/certificate.svg"
								alt="" class="why-buy-icons"> Certificate of Authenticity
						</div>
					</div>

					<p class="product-intro">
						<!--DB 작업 필요 -->
						${products.productIntro }
					</p>

					<div class="promotion-btn">
						<i style="padding-right: 5px;" class="fas fa-tag"></i>
						<p>30% OFF!</p>
					</div>
					<input type="submit" class="product-buy-btn" value="select & buy" style="width: 100%;">
				</div>
			</div>
		</form>
	</div>
</body>

