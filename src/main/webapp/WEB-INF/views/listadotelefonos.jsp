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
		<div class="col-md-offset-5 col-md-2 center"><a href="newTelefono">
						<button>Nueva Teléfono</button>
					</a></div>
		</div>
		
		
		<div class="row">
			<div class=" col-md-offset-2 col-md-3">
				<h3>Nombre</h3>
			</div>
			<div class="col-md-3">
				<h3>Teléfono</h3>
			</div>
			

		</div>

		<c:forEach var="telefono" items="${listaTelefonos}">

			<div class="row">

				<div class="col-md-offset-2 col-md-3">
					<p>${telefono.persona.nombre } ${telefono.persona.apellido1 }</p>
				</div>

				<div class="col-md-3">
					<p>${telefono.telefono }</p>
				</div>
				

				<div class="col-md-2">
					<a href="editTelefono?id=${telefono.idtelefonos }">
						<button>Modificar</button>
					</a>
				</div>

				<div class="col-md-2">
					<a href="deleteTelefono?id=${telefono.idtelefonos }">
						<button>Eliminar</button>
					</a>
				</div>

			</div>

		</c:forEach>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>