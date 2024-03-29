<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../component/imports.jsp" />

<title>Agenda4You</title>
</head>
<body>

	<jsp:include page="../component/header.jsp" />

	<div class="container contenedorprincipal">
		<div class="row">
			<div class="col-md-12 centrar">
				<h1 class="titulo">BIENVENIDO A LA AGENDA4YOU</h1>
			</div>

		</div>

		<div class="row">
			<form action="verPersonaPorCodEmpleado">
				<div class="col-md-offset-2 col-md-4">
					<h3>N� Empleado</h3>
				</div>

				<div class="col-md-4">
					<select name="idempleado" class="form-control">
						<c:forEach var="empleadito" items="${listaEmpleaditos}">
							<option value="${empleadito.codEmpleado }">${empleadito.codEmpleado }</option>
						</c:forEach>

					</select>
				</div>
				<div class="col-md-2">
					<button type="submit" class="btn button">Buscar</button>
				</div>
			</form>
		</div>

		<div class="row">
			<form action="verPersonaPorDepartamento">
				<div class="col-md-offset-2 col-md-4">
					<h3>Departamento</h3>
				</div>

				<div class="col-md-4">
					<select name="iddepartamento" class="form-control">
						<c:forEach var="departamentito" items="${listaDepartamentitos}">
							<option value="${departamentito.iddepartamento }">${departamentito.nombre }</option>
						</c:forEach>

					</select>
				</div>
				<div class="col-md-2">
					<button type="submit" class="btn button">Buscar</button>
				</div>
			</form>
		</div>



		<div class="row">
			<form action="verPersonaPorCategoria">
				<div class="col-md-offset-2 col-md-4">
					<h3>Categor�a</h3>
				</div>

				<div class="col-md-4">
					<select name="idcategoria" class="form-control">
						<c:forEach var="categories" items="${listaCategories}">
							<option value="${categories.idCategorias }">${categories.nombre }</option>
						</c:forEach>

					</select>
				</div>
				<div class="col-md-2">
					<button type="submit" class="btn button">Buscar</button>
				</div>
			</form>
		</div>
	</div>



	<jsp:include page="../component/footer.jsp" /></body>
</html>
