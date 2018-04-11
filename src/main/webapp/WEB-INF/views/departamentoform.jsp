<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>Formulario  departamento</title>
</head>
<body>

	<c:if test="${empty admin}">
		<c:redirect url="/" />
	</c:if>

	<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">

			<div align="center">
				<h1>FORMULARIO DE DEPARTAMENTO</h1>
				<table>
					<form:form action="saveDepartamento" method="post" modelAttribute="departamento">
						<form:hidden path="iddepartamento" />
						<tr>
							<td>Nombre:</td>
							<td><form:input path="nombre" /></td>
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
