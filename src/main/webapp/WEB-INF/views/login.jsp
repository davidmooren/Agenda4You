<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Admin</title>
</head>
<body>

	<div class="container">
		<div class="row">

			<div class="main">

				<h3>
					Please Log In, or <a href="#">Sign Up</a>
				</h3>
				<div class="row">
					<div class="col-xs-6 col-sm-6 col-md-6">
						<a href="#" class="btn btn-lg btn-primary btn-block">Facebook</a>
					</div>
					<div class="col-xs-6 col-sm-6 col-md-6">
						<a href="#" class="btn btn-lg btn-info btn-block">Google</a>
					</div>
				</div>
				<div class="login-or">
					<hr class="hr-or">
					<span class="span-or">or</span>
				</div>

				<form name="form">
					<div class="form-group">
						<label for="inputUsernameEmail">Username or email</label> <input
							type="text" class="form-control" id="inputUsernameEmail">
					</div>
					<div class="form-group">
						<a class="pull-right" href="#">Forgot password?</a> <label
							for="inputPassword">Password</label> <input type="password"
							class="form-control" id="inputPassword">
					</div>
					<div class="checkbox pull-right">
						<label> <input type="checkbox"> Remember me
						</label>
					</div>
					<button type="submit" class="btn btn btn-primary">Log In</button>
				</form>

			</div>

		</div>
	</div>
</body>
</html>
