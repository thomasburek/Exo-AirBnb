<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html	>
<html>
<head>
<meta charset="utf-8" />
<title>Profil</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.3/css/bootstrap.min.css"
	integrity="sha384-MIwDKRSSImVFAZCVLtU0LMDdON6KVCrZHyVQQj6e8wIEJkW4tvwqXrbMIya1vriY"
	crossorigin="anonymous">
<link href="css/custom.css" rel="stylesheet">
</head>
<body>

	<nav id="topNav"
		class="navbar navbar-full navbar-static-top  bg-inverse m-b-1">
		<a class="navbar-brand" href="<c:url value="/Accueil"/>"><img
			src="img/Logo.png" /></a>
		<ul class="nav navbar-nav">
			<li class="nav-item"><a class="nav-link" id="user" href="">
					<c:out value="${ sessionScope.sessionProprio.username }" />
			</a></li>
		</ul>
	</nav>
	<div class="container-fluid">

		<!-- Center Column -->
		<div class="col-md-12">
			<ul id="presentation" class="list-group">
				<c:forEach items="${liste }" var="logU">

					<li>
						<div class="row" id="item">
							<span class="col-md-4 col-sm-12"></span>
							<article class="col-md-8 col-sm-12">
								<h2>
									<c:out value="${ logU.rue }" />
									, <strong><c:out value="${ logU.ville }" /></strong>
								</h2>
								<p>
									<c:out value="${ logU.description }" />
								</p>
								<ul class="list-inline">
									<li class="list-inline-item">
									<form method="post" action="Profil">
									<input value="${logU.id }" name="idLogement">
									<input type="date"  name="dateDebut">
									<input type="date"  name="dateFin">
									<button type="submit" class="btn btn-primary" name="validerDate">
									Valider</button>
									</form>
									</li>	
									<li class="list-inline-item" id="prix"><c:out value="${ logU.montant }" />€</li>
								</ul>
							</article>
						</div>
						<hr>
				</c:forEach>
			</ul>
		</div>
	</div>
	<!--/container-fluid-->
</body>
</html>