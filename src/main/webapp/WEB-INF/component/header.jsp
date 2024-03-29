<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header class="container header-menu">

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="./">Agenda4You</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse"
				aria-expanded="false" style="height: 1px;">
				<ul class="nav navbar-nav">
					<li><a href="listPersonas">Personas</a></li>					
					<c:if test="${not empty admin }">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Opciones <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="listCategorias">Categorias</a></li>
								<li><a href="listDepartamentos">Departamentos</a></li>
								<li><a href="listTelefonos">Telefonos</a></li>
								<li><a href="listDirecciones">Direcciones</a></li>
							</ul>
						</li>
					</c:if>				
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<c:choose>
						<c:when test="${empty admin}">
							<li><a href="login"><span
									class="glyphicon glyphicon-user"></span> Acceso</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="logout"><span
									class="glyphicon glyphicon-user"></span> Desconectar</a></li>

							<li class="usuario_logeado_header">${admin.usuario}</li>
						</c:otherwise>
					</c:choose>
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</nav>

</header>