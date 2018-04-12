<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Admin</title>

<jsp:include page="../component/imports.jsp" />
</head>
<body>

	<jsp:include page="../component/header.jsp" />

	<div class="container">
		<div class="row">

			<div class="main">

				<form action="logear" method="POST">
					<div class="form-group">
						<label for="usuario">Indique su nombre de usuario:</label> <input
							type="text" class="form-control" name="usuario" id="usuario">
					</div>
					<div class="form-group">
						<label for="password">Contraseña</label> <input type="password"
							class="form-control" name="password" id="password">
					</div>
					<div class="col-md-12 centrar fin_formulario">
						<button type="submit" class="btn btn btn-primary">Acceder</button>
					</div>
				</form>

			</div>

		</div>
	</div>


	<jsp:include page="../component/footer.jsp" />

</body>
</html>
