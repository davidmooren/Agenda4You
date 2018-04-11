<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

        <spring:url value="static/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="static/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  

<title>LISTADO DE USUARIOS</title>
</head>
<body>
	<div align="center">
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
<<<<<<< HEAD
=======
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

>>>>>>> parent of 73da74a... commit
	</div>
</body>
</html>