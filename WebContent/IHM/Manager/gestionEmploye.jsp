<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerManager.jsp"%>
<%@ page  import ="metier.*, java.util.*, java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des employés</title>
		
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
										
								<h1>Liste des employés</h1>
									<%
										ArrayList<Personnel> listePersonne=(ArrayList<Personnel>)request.getSession().getAttribute("ListerEmploye");
									%>
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
							        <% 
							        int i=0;
									String name="";
									for(Personnel unePersonne : listePersonne) {
										i=i+1;
										
									%>
							            <tr>
								            
											<td><%=unePersonne.getNum()%></td>
											<td><%=unePersonne.getNom()%></td>
											<td><%=unePersonne.getPrenom()%></td>
											<td><%=unePersonne.getLogin()%></td>											
							                <td><input type="checkbox" name="managerCheckbox" id="managerCheckbox" value="<%=i%>"></td>
							                
							                <th><input  class="btn btn-danger" type="submit" value="Supprimer"/></th>
							            </tr>
							        <%
									}
									%>
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
								      	
								      	<form class="form-horizontal col-md-12" method="post" accept-charset="utf-8" action="<%=request.getContextPath()%>/GestionEmploye">
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
											
											<div class="form-group">
										<div class="col-md-offset-0 col-md-8"><input  class="btn btn-success btn btn-success" name="bAjouter" type="submit" value="Connexion"/></div>
										</div>	
						      			</form>
						      			
								      </div>
								      <div class="modal-footer">
								       
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