<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Connexion</title>
		
		<!-- Bootstrap sources -->
		<link rel="stylesheet" type="text/css" href="ressources/bootstrap-3.3.6-dist/css/bootstrap.min.css" />

		<!-- CSS sources -->
		<link rel="stylesheet" type="text/css" href="ressources/app.css" />

	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-xs-12">					
					<div class="main">							
						<div class="row" >
							<div class="col-xs-12 col-sm-6 col-sm-offset-1">
										
								<h1>Connexion</h1>
								<h2>Veuillez saisir vos identifiants</h2>										
								<form action="Login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">					
									<div class="form-group">
										<div class="col-md-8"><input name="username" placeholder="Idenfiant" class="form-control" type="text" id="UserUsername"/></div>
									</div> 
									
									<div class="form-group">
										<div class="col-md-8"><input name="password" placeholder="Mot de passe" class="form-control" type="password" id="UserPassword"/></div>
									</div>
									
									<div class="form-group">
										<div class="col-md-offset-0 col-md-8"><input  class="btn btn-success btn btn-success" type="submit" value="Connexion"/></div>
									</div>								
								</form>					
								<p class="credits">Mehdi - Paul - Kevin - Cédric</p>					
							</div>
						</div>						
					</div>				
				</div>
			</div>
		</div>
	</body>
</html>