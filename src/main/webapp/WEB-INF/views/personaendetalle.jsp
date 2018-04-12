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
			<div class="col-md-12">
				<h3>${persona.nombre }${persona.apellido1 }${persona.apellido2 }</h3>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12 titulo">
				<span class="glyphicon glyphicon-sunglasses">Empleado:</span>
			</div>

			<div class="col-offset-2 col-md-1 ">
				<span>Codigo Empleado:</span>
			</div>
			<div class="col-md-3 ">
				<span>${persona.empleado.codEmpleado }</span>
			</div>
			<div class="col-offset-2 col-md-1 ">
				<span>Salario:</span>
			</div>
			<div class="col-md-3 ">
				<span>${persona.empleado.salario }</span>
			</div>

		</div>

		<div class="row">
			<div class="col-md-12 titulo">
				<span>Telefonos del usuario:</span>
			</div>
			<c:forEach var="telefono" items="${persona.telefonosCollection }">
				<div class="col-md-12 titulo">
					<span class="glyphicon glyphicon-earphone">${telefono.telefono }</span>
				</div>
			</c:forEach>
		</div>

		<div class="row">
			<div class="col-md-12 titulo">
				<span>Direcciones del usuario:</span>
			</div>
			<c:forEach var="direccion" items="${persona.direccionesCollection }">
				<div class="col-md-2titulo">
					<span class="glyphicon  glyphicon-home">Direccion: ${direccion.direccion }</span>
				</div>
				<div class="col-md-2titulo">
					<span class="glyphicon  glyphicon-home">Codigo Postal: ${direccion.codPostal }</span>
				</div>
				<div class="col-md-2titulo">
					<span class="glyphicon  glyphicon-home">Localidad: ${direccion.localidad }</span>
				</div>
				<div class="col-md-2titulo">
					<span class="glyphicon  glyphicon-home">Provincia: ${direccion.provincia }</span>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>