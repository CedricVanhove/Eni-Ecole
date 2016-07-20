<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerManager.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des commandes (Manager)</title>
		
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
										
								<h1>Gestion des commandes</h1>
								
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>Numéro de la commande</th>
							                <th>Etat de la commande</th>
							                <th>Nom du preparateur</th>
							                <th></th>
							            </tr>
							        </thead>
							        <tbody>
							            <tr>
							                <th>5454789</th>
							                <th>En cours de traitement</th>
							                <th>Kevin</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>9768486</th>
							                <th>En cours de traitement</th>
							                <th>Cédric</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>9458754</th>
							                <th>En cours de traitement</th>
							                <th>Mehdi</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>9545484</th>
							                <th>En attente</th>
							                <th>???</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>8784848</th>
							                <th>En attente</th>
							                <th>???</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
									</tbody>
    							</table>
    															
								<h1>Etat des commandes</h1>
								
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>Nom du preparateur</th>
							                <th>Nombre de commandes traitées</th>
							            </tr>
							        </thead>
							        <tbody>
							            <tr>
							                <th>Mehdi</th>
							                <th>130</th>
							            </tr>
							            <tr>
							                <th>Paul</th>
							                <th>111</th>
							            </tr>
							            <tr>
							                <th>Kevin</th>
							                <th>-2 Va taff batard!</th>
							            </tr>
							            <tr>
							                <th>Cédric</th>
							                <th>144</th>
							            </tr>
									</tbody>
    							</table>
								<script type="text/javascript">
									$(document).ready(function() {
									    $('#example').DataTable();
									} );
								</script>		
							</div>
						</div>						
					</div>				
				</div>
			</div>
		</div>
	</body>
</html>