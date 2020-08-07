<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- header area -->
<header>
	<div class="head-nav">
		<div class="logo">
			<a href="/"></a>
		</div>
		<div class="nav-list">
			<li><a href="product">GOLF CLUBS</a></li>
			<li><a href="product">ACCESSORIES</a></li>
			<li><a href="product">WOMEN'S</a></li>
			<li><a href="product">MEN'S</a></li>
			<li><a href="product">OTHER BEANDS</a></li>
			<li><a href="product">CLEARANCE</a></li>
			<li><a href="product">TRADE-IN</a></li>
		</div>
		<div class="sub-icon">
			<div class="icon">
				<a href="#"><i class="fas fa-search"></i></a>
			</div>

			<c:if test="${sessionScope.user != null}">
				<div class="icon">
					<a href="#"><i class="far fa-user"></i></a>
				</div>
			</c:if>

			<c:if test="${sessionScope.user == null}">
				<div class="icon">
					<a href="/user/login"><i class="far fa-user"></i></a>
				</div>
			</c:if>

			<div class="icon">
				<a href="basket"><i class="fas fa-shopping-cart"></i></a>
			</div>
		</div>
	</div>
</header>

<!-- header area end-->