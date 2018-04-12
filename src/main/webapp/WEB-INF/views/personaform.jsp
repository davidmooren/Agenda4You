<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>Formulario  Persona</title>
</head>
<body>

	<c:if test="${empty admin}">
		<c:redirect url="/" />
	</c:if>

	<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">

			<div align="center">
				<h1>FORMULARIO DE PERSONA</h1>
				<table>
					<form:form action="savePersona" method="post" modelAttribute="persona">
						<form:hidden path="idpersonas" />
						<tr>
							<td>Nombre:</td>
							<td><form:input path="nombre" /></td>
						</tr>
						<tr>
							<td>Apellido 1:</td>
							<td><form:input path="apellido1" /></td>
						</tr>
						<tr>
							<td>Apellido 2:</td>
							<td><form:input path="apellido2" /></td>
						</tr>
						<tr>
							<td>DNI:</td>
							<td><form:input path="dni" /></td>
						</tr>
						
						<tr>
							<td>Empleado:</td>
							<!-- 	<td><form:input path="persona.idpersonas" /></td> -->
							<td><form:select path="empleado">
									<c:forEach var="empleadito" items="${listaEmpleaditos}">
										<option value="${empleadito.idempleados }">${empleadito.codEmpleado }</option>
									</c:forEach>

								</form:select></td>
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
