<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

	<div class="container">
		<h1 class="content-main-title" style="font-size: xx-large;">${category}</h1>
		<div class="content">
			<div class="side-menu">
				<h3>Category</h3>
				<div class="sub-category">
					<h4>
						Gender/Hand
						</h5>
						<ul>
							<li><p>Mens/Right</p></li>
							<li><p>Mens/left</p></li>
							<li><p>Ladies/Right</p></li>
							<li><p>Ladies/Left</p></li>
							<li><p>Junior/Right</p></li>
							<li><p>Junior/Left</p></li>
						</ul>
				</div>

				<div class="sub-category">
					<h4>
						Clubs
						</h5>
						<ul>
							<li><p>2 Wood</p></li>
							<li><p>3 Wood</p></li>
							<li><p>4 Wood</p></li>
							<li><p>5 Wood</p></li>
							<li><p>7 Wood</p></li>
							<li><p>11 Wood</p></li>
							<li><p>Strong 4 Wood</p></li>
							<li><p>Tour 13.5° Wood</p></li>
						</ul>
				</div>

				<div class="sub-category">
					<h4>
						Clubs
						</h5>
						<ul>
							<li><p>Regular</p></li>
							<li><p>Firm</p></li>
							<li><p>Stiff</p></li>
							<li><p>X-Stiff</p></li>
							<li><p>Senior/Light</p></li>
							<li><p>Uniflex</p></li>
							<li><p>Ladies</p></li>
							<li><p>Junior</p></li>
						</ul>
				</div>
			</div>
			<div class="product">
				<c:forEach items="${products}" var="products">
					<div class="item-box">
						<div class="item-img">
							<a href="/prod/detail/${products.productId}"> <img
								src="${products.productImgUrl}" alt="${products.productName}" /></a>
						</div>

						<div class="item-name">${products.productName}</div>

						<div class="product-pricing">
							<p class="p-price">From $${products.price }</p>
							<p class="p-promotion">
								As low as $12 APR with Affirm <a href="#">Prequalify now</a>
							</p>
						</div>
						<div class="mt-10"></div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span>
							</div>
						</div>

						<div class="div"
							style="padding: 10px; font-size: 12px; color: #2979ff; display: flex; justify-content: center; align-items: center;">
							<i style="padding-right: 5px;" class="fas fa-tag"></i>
							<p>33% OFF!</p>
						</div>

						<div class="mt-10"></div>

						<form action="/take" method="post">
							<div class="take">
								<input type="hidden" name="userid" value="${user1.userId}" /> <input
									type="hidden" name="productid" value="${product.productId }" />
							</div>
						</form>
					</div>

				</c:forEach>
			</div>
		</div>
	</div>
</body>

