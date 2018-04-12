<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>LISTADO DE USUARIOS</title>
</head>
<body>
	<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">
			<div class="col-md-12 centrar">
				<h3>${persona.nombre } ${persona.apellido1 } ${persona.apellido2 }</h3>
			</div>
		</div>
				
		<div class="row">
			<div class="col-md-12 titulo">
				<h4>Telefonos del usuario:</h4>
			</div>
			<c:forEach var="telefono" items="${persona.telefonosCollection }">
				<div class="col-md-12 centrar">
					<p class="glyphicon glyphicon-earphone">${telefono.telefono }</p>
				</div>
			</c:forEach>
		</div>

		<div class="row">
			<div class="col-md-12 titulo">
				<h4 class="glyphicon glyphicon-sunglasses">Empleado:</h4>
			</div>

			<div class="col-md-offset-1 col-md-2 centrar">
				<p>Codigo Empleado:</p>
			</div>
			<div class="col-md-3 ">
				<p>${persona.empleado.codEmpleado }</p>
			</div>
			<div class="col-md-offset-1 col-md-2 centrar">
				<p>Salario:</p>
			</div>
			<div class="col-md-3 ">
				<p>${persona.empleado.salario }</p>
			</div>

		</div>


		<div class="row fin_formulario" >
			<div class="col-md-12 titulo">
				<h4>Direcciones del usuario:</h4>
			</div>
			<c:forEach var="direccion" items="${persona.direccionesCollection }">
				<div class="col-md-3 centrar">
					<p class="glyphicon  glyphicon-home"> Direccion: ${direccion.direccion }</p>
				</div>
				<div class="col-md-3 centrar">
					<p class="glyphicon  glyphicon-home"> Codigo Postal: ${direccion.codPostal }</p>
				</div>
				<div class="col-md-3 centrar">
					<p class="glyphicon  glyphicon-home"> Localidad: ${direccion.localidad }</p>
				</div>
				<div class="col-md-3 centrar">
					<p class="glyphicon  glyphicon-home"> Provincia: ${direccion.provincia }</p>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>