<%@page pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


	<div class="row" id="item">
		<span class="col-md-4 col-sm-12"></span>
		<article class="col-md-8 col-sm-12">
		<h2><c:out value="${ logement.rue }"/>, <strong><c:out value="${ logement.ville }"/></strong></h2>
		<p><c:out value="${ logement.description }"/></p>
		<ul class="list-inline">
			<li class="list-inline-item"><button class="btn btn-outline-success">Louer</button></li>
			<li class="list-inline-item" id="prix"><c:out value="${ logement.montant }"/>€</li>
		</ul>
		</article>
	</div>
	<hr>