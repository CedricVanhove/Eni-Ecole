package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ArticleDAO;
import DAO.PersonnelDAO;
import metier.Article;
import metier.Personnel;

/**
 * Servlet implementation class GestionArticle
 */
public class GestionArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			valider(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		valider(request, response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	protected void valider(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

     	RequestDispatcher dispatcher;
     	String ajouterParam = request.getParameter("bAjouter"); 
		String modifParam = request.getParameter("bModifier");
		String supprimeParam = request.getParameter("bSupprimer");
		
		String libArt = request.getParameter("libelleArticle");
		String pdsArt =  request.getParameter("poidsArticle");
		String desc = request.getParameter("descriptionArticle");
		String id = request.getParameter("idArticle");
		Article article = new Article();
		
		if(ajouterParam != null)
		{
			article.setLibelle(libArt);
			article.setDescription(desc);
			article.setPoids(pdsArt);		
			ArticleDAO.Insert(article);
		}
		if(modifParam != null)
		{
			article.setLibelle(libArt);
			article.setDescription(desc);
			article.setPoids(pdsArt);		
			ArticleDAO.Update(article);
		}if(modifParam != null)
		{
			article.setLibelle(libArt);
			article.setDescription(desc);
			article.setPoids(pdsArt);		
			ArticleDAO.Delete(Integer.parseInt(id));
		}
		response.sendRedirect("IHM/Manager/gestionEmploye.jsp");
}
}
