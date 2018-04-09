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

				<form name="form">
					<div class="form-group">
						<label for="inputUsernameEmail">Indique su nombre de usuario:</label> <input
							type="text" class="form-control" id="inputUsernameEmail">
					</div>
					<div class="form-group">
						<a class="pull-right" href="#">Olvidaste la contraseña?</a> <label
							for="inputPassword">Password</label> <input type="password"
							class="form-control" id="inputPassword">
					</div>
					<div class="checkbox pull-right">
						<label> <input type="checkbox"> Recordarme
						</label>
					</div>
					<button type="submit" class="btn btn btn-primary">Acceder</button>
				</form>

			</div>

		</div>
	</div>
</body>
</html>
