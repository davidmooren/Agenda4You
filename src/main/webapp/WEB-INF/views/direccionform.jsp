<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">


		<spring:url value="/resources/css/bootstrap.css" var="estilos1" />
		<link href="${estilos1}" rel="stylesheet" />
		
		<spring:url value="/resources/css/custom.css" var="estilos3" />
		<link href="${estilos3}" rel="stylesheet" />		
	
		<spring:url value="css/bootstrap.css" var="estilos2" />
		<link href="${estilos2}" rel="stylesheet" />	
		
        <link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
<title>FORMULARIO DE DIRECCIONES</title>
</head>
<body>
	<div align="center">
		<h1>FORMULARIO DE DIRECCIONES</h1>
		<table>
			<form:form action="saveDireccion" method="post" modelAttribute="direccion">
				<form:hidden path="iddirecciones" />
				<tr>
					<td>Direccion:</td>
					<td><form:input path="direccion" /></td>
				</tr>
				<tr>
					<td>Código Postal:</td>
					<td><form:input path="codPostal" /></td>
				</tr>
				<tr>
					<td>Localidad:</td>
					<td><form:input path="localidad" /></td>
				</tr>
				<tr>
				<tr>
					<td>Provincia:</td>
					<td><form:input path="provincia" /></td>
				</tr>
				<tr>
				<tr>
					<td>id Persona</td>
					<td><form:input path="personas.idPersonas" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Registro"></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>