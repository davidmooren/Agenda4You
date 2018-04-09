<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Admin</title>


<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>

	<div class="Container">
		<div class="row">

			<div class="main">

				<form action="login" method="POST">
					
					<div class="form-group">
						<label for="usuario">Indique su nombre de usuario:</label> <input
							type="text" class="form-control" name="usuario" id="usuario">
					</div>
					<div class="form-group">
						<a class="pull-right" href="#">Olvidaste la contraseña?</a> <label
							for="password">Contraseña</label> <input type="password"
							class="form-control" name="password" id="password">
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
