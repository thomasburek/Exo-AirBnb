<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html	>
<html>
<head>
<meta charset="utf-8" />
<title>Sign In</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.3/css/bootstrap.min.css" integrity="sha384-MIwDKRSSImVFAZCVLtU0LMDdON6KVCrZHyVQQj6e8wIEJkW4tvwqXrbMIya1vriY" crossorigin="anonymous">
<link href="css/custom.css" rel="stylesheet">
</head>
<body>

<nav id="topNav" class="navbar navbar-full navbar-static-top  bg-inverse m-b-1">  
        <a class="navbar-brand" href="<c:url value="/Index.jsp"/>"><img src="img/Logo.png"/></a>
        <ul class="nav navbar-nav">
        <li class="nav-item">
        <a class="nav-link" id="user" href=""> <c:out value="${ sessionScope.sessionProprio.username }"/></a>
        </li>
        </ul>
</nav>            
	<div>
		<form method="post" >
			<fieldset>
				<legend>Informations Proprietaire</legend>
					
				<label for="username">Entrer un nom d'utilisateur</label> 
					<input
					type="text" id="username" name="username" value="" size="20"
					maxlength="20" />					
					<br /> 
				<label
					for="password">Choisir un mot de passe</label> 
					<input
					type="password" id="password" name="password" value="" size="20"
					maxlength="20" /> 
					<br />
			</fieldset>
			<button class="btn btn-secondary" type="submit">Valider </button>  
			<br />
		</form>
	</div>
</body>
</html>