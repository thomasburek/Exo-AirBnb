<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>AirBnB</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.3/css/bootstrap.min.css" integrity="sha384-MIwDKRSSImVFAZCVLtU0LMDdON6KVCrZHyVQQj6e8wIEJkW4tvwqXrbMIya1vriY" crossorigin="anonymous">
      
    <!-- Custom CSS -->
    <link href="css/custom.css" rel="stylesheet">
    
    <!-- For icons -->
    <link href="css/font-awesome-4.6.3/css/font-awesome.min.css" rel="stylesheet">

</head>

<body>

    <!-- Navigation -->
    <nav id="topNav" class="navbar navbar-full navbar-static-top  bg-inverse m-b-1">
        <button class="navbar-toggler hidden-md-up pull-right" type="button" data-toggle="collapse" data-target="#navbar">
            &#9776;
        </button>
        <a class="navbar-brand" href="#"><img src="img/Logo.png"/></a>
            <div class="nav navbar-nav">
                <!-- Menu Log In -->
                <div class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Log In
                    </a>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuLink" id="login-content">
                        <form method="post" action="Profil">
						<div class="form-group">
							<input type="text" class="form-control" id="uid" name="uid" 
							placeholder="username">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="pwd" name="pwd" 
							placeholder="password">
						</div>
						<button type="submit" class="btn btn-primary" name="log">
						Log In</button>
						<a href="<c:url value="/creerProprietaire"/>">Sign In</a>
					</form>
                    </div>
                </div>
                 <ul class="nav navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/creerLogement"/>">Add</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="user" href="<c:url value="/Profil"/>"> 
                    <c:out value="${ sessionScope.sessionProprio.username }"/>
                    </a>                  
                </li>
                </ul>
            </div>
            <!-- Search -->
            <div class="collapse navbar-toggleable-sm" id="navbar">
            <form class="form-inline pull-xs-right" id="search">
                <input class="form-control" type="text" placeholder="Search">    
            </form>
        </div>
    </nav>
    

<div class="container-fluid">

		<!-- Center Column -->
	<div class="col-md-12">
		<ul id="presentation" class="list-group">
		<c:forEach  items="${liste }" var="log" >
		
			<li >	
			
			<div class="row" id="item">
		<span class="col-md-4 col-sm-12"></span>
		<article class="col-md-8 col-sm-12">
		<h2><c:out value="${ log.rue }"/>, <strong><c:out value="${ log.ville }"/></strong></h2>
		<p><c:out value="${ log.description }"/></p>
		<ul class="list-inline">
			<li class="list-inline-item"><button class="btn btn-outline-success">Louer</button></li>
			<li class="list-inline-item" id="prix"><c:out value="${ log.montant }"/>€</li>
		</ul>
		</article>
	</div>
	<hr>
		</c:forEach>
				
	
			
       		
       			
       		
        </ul>
    </div>
        
</div><!--/container-fluid-->
	
	<footer>
        <div class="small-print">
        	<div class="container">
        		<p id="copyright">Copyright &copy; Thomas 2017 </p>
        	</div>
        </div>
	</footer>

	
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>

    <!-- Tether -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script>

    <!-- Bootstrap 4 JavaScript. This is for the alpha 3 release of Bootstrap 4. This should be updated when Bootstrap 4 is officially released. -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.3/js/bootstrap.min.js" integrity="sha384-ux8v3A6CPtOTqOzMKiuo3d/DomGaaClxFYdCu2HPMBEkf6x2xiDyJ7gkXU0MWwaD" crossorigin="anonymous"></script>

    <!-- Initialize Bootstrap functionality -->
    <script>
    // Initialize tooltip component
    $(function () {
      $('[data-toggle="tooltip"]').tooltip()
    })

    // Initialize popover component
    $(function () {
      $('[data-toggle="popover"]').popover()
    })
    </script> 
	
</body>

</html>