<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page  import ="metier.*, java.util.*, java.text.*" %>

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
								<input  class="btn btn-warning" type="submit" value="Import"/>
								<%
										ArrayList<Commande> listeCommande=(ArrayList<Commande>)request.getSession().getAttribute("ListerCommande");
										int i=0;
									%>
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>Numéro de la commande</th>
							                <th>Etat de la commande</th>
							                <th>Nom du preparateur</th>
							            </tr>
							        </thead>
							        <tbody>
							            <% 							        
									
									for(Commande uneCommande : listeCommande) {
										i=i+1;
										
									%>
							            <tr>
							            	<td><%=uneCommande.getNum()%></td>
											<td><%=uneCommande.getEtats()%></td>
											<td><%=uneCommande.getLeSbire()%></td>
											
											<td><button type="button" data-toggle="modal" data-target="#myModalModif" id="ouvreModal" style="display:none"></button>
										
							                						                
							            </tr>
							              <%
							              
									}
									%>
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
									 
							</div>
						</div>						
					</div>				
				</div>
			</div>
		</div>
	</body>
</html>
