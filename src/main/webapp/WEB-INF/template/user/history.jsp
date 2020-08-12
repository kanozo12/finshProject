<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
	<div class="container">
		<div class="history">
			<div class="left">
				<div class="page-title">
					<h1>Your Account</h1>
				</div>

				<div class="row">
					<div class="my-account">
						<h4>My Account</h4>
						<ul>
							<li><a href="#"> Order History</a></li>
							<li><a href="#">logout</a></li>
						</ul>
					</div>
					<div class="order-history"></div>
				</div>
			</div>

			<div class="right">
				<h3>Your Order History</h3>
				<c:forEach items="${list}" var="list">
					${list.productName }<br>
				</c:forEach>
			</div>
		</div>
	</div>

</body>

