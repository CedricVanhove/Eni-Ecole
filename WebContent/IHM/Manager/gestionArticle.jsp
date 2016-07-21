<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="../include/headerManager.jsp"%> 
<%@ page  import ="metier.*, java.util.*, java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gestion des articles</title>
		
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
							<div >
										
								<h1>Gestion des articles</h1>
								<%
										ArrayList<Article> listeArticle=(ArrayList<Article>)request.getSession().getAttribute("ListerArticle");
										int i=0;
									%>
								<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
							        <thead>
							            <tr>
							                <th>ID Article</th>
							                <th>Libelle</th>
							                <th>Stock</th>
							                <th>Poids Unitaire</th>
							                <th></th>
							                <th></th>
							            </tr>
							        </thead>
							        <tbody>
							          <% 							        
									int connard;
									for(Article unArticle : listeArticle) {
										i=i+1;
										
									%>
							            <tr>
							            	<td><%=unArticle.getNum()%></td>
											<td><%=unArticle.getLibelle()%></td>
											<td><%=unArticle.getDescription()%></td>
											<td><%=unArticle.getPoids()%></td>			
											<td><button type="button" class="btn btn-warning" data-toggle="modal" data-target="#myModalModif" id="ouvreModal" style="display:none"></button>
											<button type="button" class="btn btn-warning" onclick="ModifArticle(<%=unArticle.getNum() %>, '<%=unArticle.getLibelle() %>', '<%=unArticle.getDescription() %>', <%=unArticle.getPoids() %>);" >Modifier</button></td>
							                <td><input  class="btn btn-danger" type="submit" value="Supprimer"/></td>							                
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
								        <h4 class="modal-title">Ajout d'un article</h4>
								      </div>
								      <div class="modal-body">
								      	
								      	<h1>Ajout d'un article</h1>	
								      	
								      	<form class="form-horizontal col-md-12" method="post" accept-charset="utf-8" action="<%=request.getContextPath()%>/GestionArticle">
											<div class="form-group">
												<input name="libelleArticle" placeholder="libelle" class="form-control input-md" type="text" id="libelleArticleAdd"/>
											</div> 
											
											<div class="form-group">
												<input name="descriptionArticle" placeholder="description" class="form-control input-md" type="text" id="descriptionArticleAss"/>
											</div>
											
											<div class="form-group">
												<input name="poidsArticle" placeholder="Poids" class="form-control input-md" type="text" id="poidsArticleAdd"/>
											</div>
											<div class="form-group">
												<div class="col-md-offset-0 col-md-8"><input  class="btn btn-success btn btn-success" name="bAjouter" type="submit" value="Ajouter"/>
												</div>
											</div>
						      			</form>
						      			
								      </div>
								      <div class="modal-footer">
								       
								      </div>
								    </div>
								  </div>
								</div>
								
								<div id="myModalModif" class="modal fade" role="dialog">
								  <div class="modal-dialog">	
								  							
								    <!-- Modal content-->
								    <div class="modal-content" id="modal">
								      <div class="modal-header">
								        <button type="button" class="close" data-dismiss="modal">&times;</button>
								        <h4 class="modal-title">Modification d'un article</h4>
								      </div>
								      <div class="modal-body">
								      	
								      	<h1>Modification d'un article</h1>	
								      	
										
								      	<form class="form-horizontal col-md-12" method="post" accept-charset="utf-8" action="<%=request.getContextPath()%>/GestionArticle">
											<input type="hidden" name="idArticle" id="idArticle"/>
											<div class="form-group">
												<input name="libelleArticle" placeholder="libelle"  class="form-control input-md" type="text" id="libelleArticle"/>
											</div> 
											
											<div class="form-group">
												<input name="descriptionArticle" placeholder="description"  class="form-control input-md" type="text" id="descriptionArticle"/>
											</div>
											
											<div class="form-group">
												<input name="poidsArticle" placeholder="Poids"  class="form-control input-md" type="text" id="poidsArticle"/>
											</div>
											<div class="form-group">
												<div class="col-md-offset-0 col-md-8"><input  class="btn btn-success btn btn-success" name="bModifier" type="submit" value="Modifier"/>
												</div>
											</div>
						      			</form>
						      			
								      </div>
								      <div class="modal-footer">
								       
								      </div>
								    </div>
								  </div>
								</div>
    								
								<script type="text/javascript">
								
									function ModifArticle(id,libelle, description,poids)
									{
										console.log(id);
										
										document.getElementById('ouvreModal').click();
										document.getElementById("idArticle").value=id;
										document.getElementById("libelleArticle").value=libelle;
										document.getElementById('descriptionArticle').value=description;
										document.getElementById('poidsArticle').value=poids;
										
									}
								</script>		
							</div>
						</div>						
					</div>				
				</div>
			</div>
		</div>
	</body>
</html>