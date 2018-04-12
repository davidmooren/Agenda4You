<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>Formulario Empleado</title>
</head>
<body>

	<c:if test="${empty admin}">
		<c:redirect url="/" />
	</c:if>

	<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">

			<div align="center">
				<h1>FORMULARIO DE EMPLEADOS</h1>
				<table>
					<form:form action="saveEmpleado" method="post"
						modelAttribute="empleado">
						<form:hidden path="idempleados" />
						<tr>
							<td>Código empleado:</td>
							<td><form:input path="codEmpleado" /></td>
						</tr>
						<tr>
							<td>Salario:</td>
							<td><form:input path="salario" /></td>
						</tr>
						<tr>
							<td>Fecha alta:</td>
							<td><form:input path="fechaAlta" /></td>
						</tr>
						<tr>
						<tr>
							<td>id Departamento:</td>
							<td><form:input path="departamento.iddepartamento" /></td>
						</tr>
						<tr>
						<tr>
							<td>id Categoría:</td>
							<td><form:input path="categorias.idCategorias" /></td>
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
