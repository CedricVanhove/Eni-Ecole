<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerManager.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Importation de commandes</title>
		
		<!-- Bootstrap sources -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/IHM/ressources/bootstrap-3.3.6-dist/css/bootstrap.min.css" />

		<!-- CSS sources -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/IHM/ressources/app.css" />

	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-xs-12">					
					<div class="main">							
						<div class="row" >
							<div class="col-xs-12 col-sm-6 col-sm-offset-1">
										
								<h1>Importation de commandes</h1>									
								<form action="Login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">					
									<div class="form-group">
										<div class="col-md-offset-0 col-md-8">
											<input name="filesImport" placeholder="Sélectionner un fichier" class="form-control" type="text" id="filesImport"/>
											<input  class="btn btn-success btn btn-success" type="submit" value="Parcourir"/>
										</div>
									</div> 
									
									<div class="form-group">
										<div class="col-md-offset-0 col-md-8">
											<input  class="btn btn-success btn btn-success" type="submit" value="Valider"/>
											<input  class="btn btn-success btn btn-success" type="submit" value="Annuler"/>
										</div>
									</div>								
								</form>				
							</div>
						</div>						
					</div>				
				</div>
			</div>
		</div>
	</body>
</html>