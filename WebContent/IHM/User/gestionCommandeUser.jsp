<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerUser.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des commandes</title> 
		
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
								
								<form action="Login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">					
									<div class="form-group">
										<div class="col-md-8"><label>Preparateur : </label></div>
									</div> 
									
									<div class="form-group">
										<div class="col-md-8"><label>Client : </label></div>
									</div>
									
									<div class="form-group">
										<div class="col-md-8"><label>N° Commande : </label></div>
									</div>							
								</form>	
								
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>Article</th>
							                <th>Poids</th>
							                <th>Quantité</th>
							                <th>Stock</th>
							                 <th>Validé</th>
							                 <th></th>
							            </tr>
							        </thead>
							        <tbody>
							            <tr>
							                <th>HDD</th>
							                <th>150</th>
							                <th>4</th>
							                <th>99999</th>
							                <th><input type="number" value="0" min="0" max="300"></th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>Carte Mere</th>
							                <th>200</th>
							                <th>1</th>
							                <th>99999</th>
							                <th><input type="number" value="0" min="0" max="300"></th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>Carte Graphique</th>
							                <th>100</th>
							                <th>2</th>
							                <th>99999</th>
							                <th><input type="number" value="0" min="0" max="300"></th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>Alimentation</th>
							                <th>300</th>
							                <th>1</th>
							                <th>99999</th>
							                <th><input type="number" value="0" min="0" max="300"></th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
									</tbody>
    							</table>
    															
								<form action="Login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">					
									<div class="form-group">
										<div class="col-md-offset-0 col-md-12 col-sm-12">
											<input  class="btn btn-success btn btn-success" type="submit" value="Imprimer bon de livraison"/>
											<input  class="btn btn-success btn btn-success" type="submit" value="Commande suivante"/>
											<input  class="btn btn-success btn btn-success" type="submit" value="Annuler"/>
										</div>
									</div>								
								</form>		
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