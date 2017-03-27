<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html	>
<html>
<head>
<meta charset="utf-8" />
<title>Add</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.3/css/bootstrap.min.css" integrity="sha384-MIwDKRSSImVFAZCVLtU0LMDdON6KVCrZHyVQQj6e8wIEJkW4tvwqXrbMIya1vriY" crossorigin="anonymous">
<link href="css/custom.css" rel="stylesheet">
</head>
<body>

<nav id="topNav" class="navbar navbar-full navbar-static-top  bg-inverse m-b-1">  
        <a class="navbar-brand" href="<c:url value="Accueil"/>"><img src="img/Logo.png"/></a>
        <ul class="nav navbar-nav">
        <li class="nav-item">
        <a class="nav-link" id="user" href=""> <c:out value="${ sessionScope.sessionProprio.username }"/></a>
        </li>
        </ul>
</nav>            
	<div>
		<form method="post">
			<fieldset>
				<legend>Création Annonce</legend>

				<label for="rue">Entrer la rue</label> 
					<input
					type="text" id="rue" name="rue" size="20" maxlength="60" />
					<br /> 
				<label
					for="ville">Entrer la ville</label> 
					<input
					type="text" id="ville" name="ville" size="20" maxlength="40" /> 
					<br />
					
				<label for="description">Description du logement</label> 
					<textarea  id="desc" name="desc"  rows=6 cols=27></textarea>
					<br /> 
				<label for="file" >Envoyer une photo</label>
					<input type="file" id="photo" name="photo">
					<br />
				<label for="montant">Entrer un prix</label> 
					<input
					type="text" id="montant" name="montant" size="20" maxlength="60" />
					<br /> 
			</fieldset>
			<button class="btn btn-secondary" type="submit">Valider </button>  
			<br />
		</form>
	</div>
</body>
</html>