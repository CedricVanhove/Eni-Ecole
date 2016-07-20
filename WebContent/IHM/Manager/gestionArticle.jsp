<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerManager.jsp"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des articles</title>
		
		<!-- Bootstrap sources -->
		<link rel="stylesheet" type="text/css" href="../ressources/bootstrap-3.3.6-dist/css/bootstrap.min.css" />

		<!-- CSS sources -->
		<link rel="stylesheet" type="text/css" href="../ressources/app.css" />

	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-xs-12">					
					<div class="main">							
						<div class="row" >
							<div class="col-xs-12 col-sm-6 col-sm-offset-1">
										
								<h1>Gestion des articles</h1>
								
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>ID Article</th>
							                <th>Libelle</th>
							                <th>Stock</th>
							                <th>Poids Unitaire</th>
							                <th></th>
							            </tr>
							        </thead>
							        <tbody>
							            <tr>
							                <th>001</th>
							                <th>Disque dur 2'5</th>
							                <th>99999</th>
							                <th>150</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>002</th>
							                <th>Carte graphique</th>
							                <th>99999</th>
							                <th>150</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>003</th>
							                <th>Carte Mére</th>
							                <th>99999</th>
							                <th>200</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>004</th>
							                <th>Alimentation</th>
							                <th>99999</th>
							                <th>300</th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
									</tbody>
    							</table>
    							
    							<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Nouveau</button>
    							
    							<div id="myModal" class="modal fade" role="dialog">
								  <div class="modal-dialog">	
								  							
								    <!-- Modal content-->
								    <div class="modal-content">
								      <div class="modal-header">
								        <button type="button" class="close" data-dismiss="modal">&times;</button>
								        <h4 class="modal-title">Ajout employé</h4>
								      </div>
								      <div class="modal-body">
								      	
								      	<h1>Ajout d'un article</h1>	
								      	
								      	<form class="form-horizontal col-md-12" action="">
											<div class="form-group">
												<input name="libelleArticle" placeholder="libelle" class="form-control" type="text" id="libelleArticle"/>
											</div> 
											
											<div class="form-group">
												<input name="stockArticle" placeholder="Stock" class="form-control" type="password" id="stockArticle"/>
											</div>
											
											<div class="form-group">
												<input name="poidsArticle" placeholder="Poids" class="form-control" type="password" id="poidsArticle"/>
											</div>
						      			</form>
						      			
								      </div>
								      <div class="modal-footer">
								        <button type="button" name="bAjouter" value="bAjouter" class="btn btn-success" data-dismiss="modal">Valider</button>
								        <button type="button" name="bAnnuler" value="bAnnuler" class="btn btn-default" data-dismiss="modal">Annuler</button>
								      </div>
								    </div>
								  </div>
								</div>
    								
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