<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<div class="container">
		<div class="product">
			<c:forEach items="${products}" var="products"> 
				<div class="product-item">
					<div class="item-box">
						<img src="images/item1.png" alt="" />
						<div class="item-name">
							<p>${products.productName}</p>
						</div>
						<div class="grade">
							<div class="star-point">
								<span class="fa fa-star checked"></span> 
								<span class="fa fa-star checked"></span> 
								<span class="fa fa-star checked"></span> 
								<span class="fa fa-star checked"></span> 
								<span class="fa fa-star checked"></span>
							</div>
						</div>
						<p>From $ ${products.price }</p>
						<form action="/take" method="post">
							<div class="take">
								<input type="hidden" name="userid" value="${user.userId}">
								<input type="hidden" name="productid" value="${products.productId }"> 
								<input type="submit" value="Take" class="btn">
							</div>
						</form>
					</div>
				</div>
			 </c:forEach>
		</div>
	</div>
</body>

