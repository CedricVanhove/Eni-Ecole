<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerManager.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des employés</title>
		
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
										
								<h1>Liste des employés</h1>
								
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>ID Employes</th>
							                <th>Nom</th>
							                <th>Prenom</th>
							                <th>Login</th>
							                <th>Manager</th>
							                <th></th>
							            </tr>
							        </thead>
							        <tbody>
							            <tr>
							                <th>002</th>
							                <th>FEVRE</th>
							                <th>Kevin</th>
							                <th>kfevre</th>
							                <th><INPUT type="checkbox" name="managerCheckbox" value="1"></th>
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							            <tr>
							                <th>001</th>
							                <th>VANHOVE</th>
							                <th>Cédric</th>
							                <th>cvanhove</th>
							                <th><INPUT type="checkbox" name="managerCheckbox" value="2" checked ></th>
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
								      	
								      	<h1>Ajout d'un employé</h1>	
								      	
								      	<form class="form-horizontal col-md-12" action="">
											<div class="form-group">
											  	<input name="nomEmp" placeholder="Nom" class="form-control input-md" type="text" id="nomEmp"/>
											</div>
											<div class="form-group">
												<input name="prenomEmp" placeholder="Prenom" class="form-control input-md" type="text" id="prenomEmp"/>
											</div>
											<div class="form-group">
												<input name="loginEmp" placeholder="Login" class="form-control input-md" type="text" id="loginEmp"/>
											</div>
											<div class="form-group">
												<input name="mdpEmp" placeholder="Mdp" class="form-control input-md" type="text" id="Mdp"/>
											</div>
											<div class="form-group">
												<INPUT type="checkbox" name="managerCheckbox" value="3" >
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
								
								<!--  <script type="text/javascript">
									$(document).ready(function() {
									    $('#example').DataTable();
									} );
								</script>-->		
							</div>
						</div>						
					</div>				
				</div>
			</div>
		</div>
	</body>
</html>