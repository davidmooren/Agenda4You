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

			<div class="col-md-offset-2 col-md-3">
				<h3>Empleado</h3>
			</div>
			<div class="col-md-3">
				<h3>Departamento</h3>
			</div>

		</div>

		<c:forEach var="empleado" items="${listaEmpleados }">

			<div class="row">

				<div class="col-md-offset-2 col-md-3">
					<p>${empleado.codEmpleado }</p>
				</div>

				<div class="col-md-3">
					<p>${empleado.departamento.nombre }</p>
				</div>

				<div class="col-md-2">

					<button>Ver detalle</button>

				</div>

			</div>

		</c:forEach>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>