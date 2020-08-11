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
			<li><a href="/prod/clubs">GOLF CLUBS</a></li>
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

			<div id="joinTabToggle" class="icon">
				<a href="#"><i class="far fa-user"></i></a>
			</div>

			<div class="icon">
				<a href="basket"><i class="fas fa-shopping-cart"></i></a>
			</div>
		</div>
	</div>

	<c:if test="${empty sessionScope.user}">
		<div id="sign-in-menu" class="visiable">
			<h4>Sign In To Your Account</h4>
			<form action="/user/login" class="sign-in-form" method="post">
				<input type="hidden" name="userType" value="C">
				<div class="join_form-group">
					<input type="text" class="join_form-control" name="userName">
				</div>
				<div class="join_form-group">
					<input type="text" class="join_form-control" name="password">
				</div>
				<button class="sign-btn sign-btn">Sign In</button>
				<a href="#" class="resetPaswordLink"> Forgot Your Password? </a> <span>Or
					Sign In With:</span>
				<div class="join_sns">
					<a href="#"></a>
				</div>

				<p class="join_text">
					Need an Account? <a href="/user/register" class="join_btn">Join
						Today!</a>
				</p>
			</form>
		</div>
	</c:if>

	<c:if test="${not empty sessionScope.user}">
		<div id="sign-in-menu">
			<div class="signin-header">
				<div class="welcome-signed-in">
					<h4>Welcome Back User!</h4>
				</div>
			</div>
			<div class="welcome-points">
				<span>Your Reward Points</span>
				<h4 class="gigyaPointsBalanceHeader">0.00</h4>
			</div>
			<ul class="header-my-account">
				<li><a href="#">Your Account</a></li>
				<li><a href="#">Address Book</a></li>
				<li><a href="#">Payment Info</a></li>
				<li><a href="#">Order History</a></li>
			</ul>

			<div class="logout-user">
				<p>
					Logout? <a href="/user/logout">Log Out</a>
				</p>
			</div>
		</div>
	</c:if>


</header>

<!-- header area end-->