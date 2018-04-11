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

			<c:choose>
				<c:when test="${empty admin}">
					<div class="col-md-offset-2 col-md-3">
						<h3>Empleado</h3>
					</div>
					<div class="col-md-3">
						<h3>Departamento</h3>
					</div>
				</c:when>
				<c:otherwise>
					<div class="col-md-offset-1 col-md-2">
						<h3>Empleado</h3>
					</div>
					<div class="col-md-2">
						<h3>Departamento</h3>
					</div>
				</c:otherwise>
			</c:choose>


		</div>

		<c:forEach var="empleado" items="${listaEmpleados }">

			<div class="row">

				<c:choose>
					<c:when test="${empty admin}">
						<div class="col-md-offset-2 col-md-3">
							<p>${empleado.codEmpleado }</p>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-md-offset-1 col-md-2">
							<p>${empleado.codEmpleado }</p>
						</div>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${empty admin}">
						<div class="col-md-3">
							<p>${empleado.departamento.nombre }</p>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-md-2">
							<p>${empleado.departamento.nombre }</p>
						</div>
					</c:otherwise>
				</c:choose>

				<div class="col-md-2">
					<button>Ver detalle</button>
				</div>


				<c:if test="${not empty admin}">
					<div class="col-md-2">
						<button>Modificar</button>
					</div>
				</c:if>
				<c:if test="${not empty admin}">
					<div class="col-md-2">
						<button>Borrar</button>
					</div>
				</c:if>





			</div>

		</c:forEach>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>