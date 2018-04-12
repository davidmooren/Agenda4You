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
						<h3>Nombre</h3>
					</div>
					<div class="col-md-3">
						<h3>Apellido</h3>
					</div>
				</c:when>
				<c:otherwise>
					<div class="col-md-offset-1 col-md-2">
						<h3>Nombre</h3>
					</div>
					<div class="col-md-2">
						<h3>Apellido</h3>
					</div>
				</c:otherwise>
			</c:choose>


		</div>

		<c:forEach var="persona" items="${listaPersonas }">

			<div class="row">

				<c:choose>
					<c:when test="${empty admin}">
						<div class="col-md-offset-2 col-md-3">
							<p>${persona.nombre }</p>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-md-offset-1 col-md-2">
							<p>${persona.nombre }</p>
						</div>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${empty admin}">
						<div class="col-md-3">
							<p>${persona.apellido1 }</p>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-md-2">
						<p>${persona.apellido1 }</p>
						</div>
					</c:otherwise>
				</c:choose>

				<div class="col-md-2">
					<button>Ver Telefonos</button>
				</div>


				<c:if test="${not empty admin}">
					<div class="col-md-2">
					<a href="editPersona?id=${persona.idpersona }">
						<button>Modificar</button>
						</a>
					</div>
				</c:if>
				<c:if test="${not empty admin}">
					<div class="col-md-2">
						<a href="deletePersona?id=${persona.idpersona }">
						<button>Borrar</button>
						</a>
					</div>
				</c:if>
			</div>

		</c:forEach>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>