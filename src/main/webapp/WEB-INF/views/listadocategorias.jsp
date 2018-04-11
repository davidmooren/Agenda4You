<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>LISTADO DE CATEGORIAS</title>
</head>
<body>
<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">

			<div class="col-md-offset-2 col-md-3">
				<h3>Nombre</h3>
			</div>
			<div class="col-md-3">
				<h3>Descripcion</h3>
			</div>

		</div>

		<c:forEach var="categoria" items="${listaCategorias }">

			<div class="row">

				<div class="col-md-offset-2 col-md-3">
					<p>${categoria.nombre }</p>
				</div>

				<div class="col-md-3">
					<p>${categoria.descripcion }</p>
				</div>

				<div class="col-md-2">
<a href="editCategoria?id=${categoria.id }">
					<button>Modificar</button>
</a>
				</div>
				
				<div class="col-md-2">
<a href="deleteCategoria?id=${categoria.id }">
					<button>Eliminar</button>
</a>
				</div>

			</div>

		</c:forEach>

	</div>
	<jsp:include page="../component/footer.jsp" /></body>
</html>