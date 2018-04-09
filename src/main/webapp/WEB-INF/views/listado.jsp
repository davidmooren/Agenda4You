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
	</div>
</body>
</html>