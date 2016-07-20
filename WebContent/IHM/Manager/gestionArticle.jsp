<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des articles</title>
		<div w3-include-html="../include/headerManager.html"></div> 
		
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
							            </tr>
							        </thead>
							        <tbody>
							            <tr>
							                <th>001</th>
							                <th>Disque dur 2'5</th>
							                <th>99999</th>
							                <th>150</th>
							            </tr>
							            <tr>
							                <th>002</th>
							                <th>Carte graphique</th>
							                <th>99999</th>
							                <th>150</th>
							            </tr>
							            <tr>
							                <th>003</th>
							                <th>Carte Mére</th>
							                <th>99999</th>
							                <th>200</th>
							            </tr>
							            <tr>
							                <th>004</th>
							                <th>Alimentation</th>
							                <th>99999</th>
							                <th>300</th>
							            </tr>
									</tbody>
    							</table>
    							
    							<h1>Ajout d'un article</h1>										
								<form action="Login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">					
									<div class="form-group">
										<div class="col-md-8"><input name="libelleArticle" placeholder="libelle" class="form-control" type="text" id="libelleArticle"/></div>
									</div> 
									
									<div class="form-group">
										<div class="col-md-8"><input name="stockArticle" placeholder="Stock" class="form-control" type="password" id="stockArticle"/></div>
									</div>
									
									<div class="form-group">
										<div class="col-md-8"><input name="poidsArticle" placeholder="Poids" class="form-control" type="password" id="poidsArticle"/></div>
									</div>
									
									<div class="form-group">
										<div class="col-md-offset-0 col-md-8">
											<input  class="btn btn-success btn btn-success" type="submit" value="Enregistrer"/>
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