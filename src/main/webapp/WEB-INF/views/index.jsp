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
				<h1 class="centrar">BIENVENIDO A LA AGENDA4YOU</h1>
			</div>

		</div>

		<div class="row">
			<div class="col-md-offset-2 col-md-4">
				<h3>Nº Empleado</h3>
			</div>
			<form action="listEmpleadosBusqueda">
				<div class="col-md-4">
					<select name="idempleado">
						<c:forEach var="empleadito" items="${listaEmpleaditos}">
							<option value="${empleadito.codEmpleado }">${empleadito.codEmpleado }</option>
						</c:forEach>

					</select>
				</div>
				<div class="col-md-2">
					<button type="submit">Buscar</button>
				</div>
			</form>
		</div>

		<div class="row">
			<div class="col-md-offset-2 col-md-4">
				<h3>Departamento</h3>
			</div>
			<form action="listDepartamentosBusqueda">
				<div class="col-md-4">
					<select name="iddepartamento">
						<c:forEach var="departamentito" items="${listaDepartamentitos}">
							<option value="${departamentito.iddepartamento }">${departamentito.nombre }</option>
						</c:forEach>

					</select>
				</div>
				<div class="col-md-2">
					<button type="submit">Buscar</button>
				</div>
			</form>
		</div>

	

	<div class="row">
		<div class="col-md-offset-2 col-md-4">
			<h3>Categoría</h3>
		</div>
		<form>
			<div class="col-md-4">
				<select name="idcategoria">
					<c:forEach var="categories" items="${listaCategories}">
						<option value="${categories.idCategorias }">${categories.nombre }</option>
					</c:forEach>

				</select>
			</div>
			<div class="col-md-2">
				<button type="submit">Buscar</button>
			</div>
		</form>
	</div>
</div>
	

	
	<jsp:include page="../component/footer.jsp" /></body>
</html>
