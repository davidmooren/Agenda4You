<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<spring:url value="static/css/custom.css" var="custom" />
<link href="${custom}" rel="stylesheet" />

<title>LISTADO DE USUARIOS</title>
</head>
<body>


	<!--	<div align="center">
		<h1>LISTADO DE CONTACTOS</h1>

		<table border="1">
		<tr>
			<th>Nº</th>
			<th>Nombre</th>
			<th>Teléfono</th>
			<th>Tipo</th>
			<th>Opciones</th>
			</tr>

			<c:forEach var="contact" items="${contactList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${contact.nombre}</td>
					<td>${contact.telefono}</td>
					<td>${contact.tipo }</td>
					<td><a href="edit?id=${contact.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${contact.id}">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>-->


	<div class="container contenedorprincipal">

		<div class="col-md-12">

			<div class="row">

				<div class="col-md-offset-2 col-md-3">
					<h3>Empleado</h3>
				</div>
				<div class="col-md-3">
					<h3>Nombre departamento</h3>
				</div>

			</div>

			<c:forEach var="empleado" items="${listaEmpleados }">

				<div class="row">
				
					<div class="col-md-offset-2 col-md-3">
						<p>${empleado.idempleado }</p>
					</div>
					
					<div class="col-md-3">
						<p>${empleado.nombre }</p>
					</div>
					
					<div class="col-md-2">
					
						<button>Ver detalle</button>
					
					</div>
				
				</div>

			</c:forEach>

		</div>

	</div>


</body>
</html>