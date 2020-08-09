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

	<div id="sign-in-menu" class="visiable">
		<h4>Sign In To Your Account</h4>
		<form action="" class="sign-in-form">
			<div class="join_form-group">
				<input type="text" class="join_form-control">
			</div>
			<div class="join_form-group">
				<input type="text" class="join_form-control">
			</div>
			<button class="sign-btn sign-btn">Sign In</button>
			<a href="#" class="resetPaswordLink"> Forgot Your Password? </a> 
			<span>Or Sign In With:</span>
			<div class="join_sns">
				<a href="#"></a>
			</div>

			<p class="join_text">
				Need an Account? <a href="/user/register" class="join_btn">Join Today!</a>
			</p>

		</form>
	</div>
</header>

<!-- header area end-->