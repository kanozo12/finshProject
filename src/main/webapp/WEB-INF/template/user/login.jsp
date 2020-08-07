<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<form action="/user/login" method="post">
		<div class="container">
			<div class="account">

				<div class="login">
					<h2>Log in to start earning</h2>
					<p>Sign in to your existing Callaway account below:</p>
					<select class="custom-select" name="userType">
						<option selected>Open this select menu</option>
						<option value="A">Admin</option>
						<option value="C" selected="selected">Customer</option>
					</select>
					<input type="text" class="form-group" placeholder="Name" name="userName" required /> 
					<input type="password" class="form-group" placeholder="Password" name="password" required /> 
					<input type="submit" value="SIGN IN" class="btn" />
				</div>

				<div class="join">
					<h2>Join the Team</h2>
					<p>Get the most from your Callaway Golf Pre-Owned experience by creating your free account today.</p>

					<a href="/user/register" class="btn">Join</a>
				</div>
			</div>
		</div>
	</form>
</body>