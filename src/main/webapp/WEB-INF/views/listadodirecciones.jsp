<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>LISTADO DE DIRECCIONES</title>
</head>
<body>
	<jsp:include page="../component/header.jsp" />

	<c:if test="${empty admin}">
		<c:redirect url="/" />
	</c:if>

	<div class="container contenedorprincipal">
		<div class="row">
		<div class="col-md-offset-5 col-md-2 center"><a href="newDireccion">
						<button>Nueva Dirección</button>
					</a></div>
		</div>
		
		
		<div class="row">
			<div class="col-md-offset-2 col-md-1">
				<h3>Id Persona</h3>
			</div>
			<div class="col-md-2">
				<h3>Dirección</h3>
			</div>
			<div class="col-md-1">
				<h3>Código Postal</h3>
			</div>
			<div class="col-md-1">
				<h3>Localidad</h3>
			</div>
			<div class="col-md-1">
				<h3>Provincia</h3>
			</div>

		</div>

		<c:forEach var="direccion" items="${listaDirecciones}">

			<div class="row">

				<div class="col-md-offset-2 col-md-1">
					<p>${direccion.persona.nombre }${direccion.persona.apellido1 }</p>
				</div>

				<div class="col-md-2">
					<p>${direccion.direccion }</p>
				</div>
				<div class="col-md-1">
					<p>${direccion.codPostal }</p>
				</div>
				<div class="col-md-1">
					<p>${direccion.localidad }</p>
				</div>
				<div class="col-md-1">
					<p>${direccion.provincia }</p>
				</div>

				<div class="col-md-2">
					<a href="editDireccion?id=${direccion.idDirecciones }">
						<button>Modificar</button>
					</a>
				</div>

				<div class="col-md-2">
					<a href="deleteDireccion?id=${direccion.idDirecciones }">
						<button>Eliminar</button>
					</a>
				</div>

			</div>

		</c:forEach>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>