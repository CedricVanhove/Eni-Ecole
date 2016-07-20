<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/Librairies/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
	
    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/css/navbar.css" rel="stylesheet">
<title>ENI - ECF</title>
</head>
<body>
 <div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">ENI - ECF</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav"> 
            <li><a href="<%=request.getContextPath()%>/formateur/accueilFormateur.jsp">Accueil</a></li>            
              <li><a href="<%=request.getContextPath()%>/InscriptionTest">Inscription</a></li>
               <li><a href="#">Voir les r�sultats</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Gestionnaire<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="<%=request.getContextPath()%>/ListerThemeQuestions">Questions</a></li>
                  <li><a href="<%=request.getContextPath()%>/ListerTheme">Th�mes</a></li>
 				  <li><a href="<%=request.getContextPath()%>/ListerTest">Test</a></li>
              </li>              
            </ul>
            </ul>
            <ul class="nav navbar-nav navbar-right">
				<li><a href="<%=request.getContextPath()%>/deconnexion">D�connexion</a></li>
			</ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
      
    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="<%=request.getContextPath()%>/Librairies/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
</body>
</html>
