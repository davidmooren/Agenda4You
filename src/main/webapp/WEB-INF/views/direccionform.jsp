<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>Formulario  categoria</title>
</head>
<body>

	<c:if test="${empty admin}">
		<c:redirect url="/" />
	</c:if>

	<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">

			<div align="center">
				<h1>FORMULARIO DE DIRECCIONES</h1>
				<table>
					<form:form action="saveDireccion" method="post" modelAttribute="direccion">
						<form:hidden path="iddirecciones" />
						<tr>
							<td>Dirección:</td>
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
							<td>Provincia:</td>
							<td><form:input path="provincia" /></td>
						</tr>
						<tr>
							<td>id  Persona:</td>
							<td><form:input path="personas.idPersonas" /></td>
						</tr>
						
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Guardar Registro"></td>
						</tr>
					</form:form>
				</table>
			</div>
		</div>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>
