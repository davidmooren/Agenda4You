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
				<a class="navbar-brand" href="./">AGENDA</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse"
				aria-expanded="false" style="height: 1px;">
				<ul class="nav navbar-nav">
					<li><a href="#">a</a></li>
					<li><a href="#">b</a></li>
					<li><a href="#">c</a></li>
					<li><a href="#">d</a></li>
					<c:if test="${not empty admin }">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Opciones <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="listCategorias"></a></li>
								<li><a href="#"></a></li>
								<li><a href="#"></a></li>
							</ul>
						</li>
					</c:if>
					<!--  	<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Dropdown <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li class="dropdown-header">Nav header</li>
								<li><a href="#">Separated link</a></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>-->
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<c:choose>
						<c:when test="${empty admin}">
							<li><a href="login"><span
									class="glyphicon glyphicon-user"></span> Acceso</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="DesconectarUsuario"><span
									class="glyphicon glyphicon-user"></span> Desconectar</a></li>

							<li class="usuario_logeado_header">${cliente_logeado.nombre}</li>
						</c:otherwise>
					</c:choose>
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</nav>

</header>