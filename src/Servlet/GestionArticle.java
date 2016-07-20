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
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void valider(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     	RequestDispatcher dispatcher;
     	String ajouterParam = request.getParameter("bAjouter"); 
		String modifParam = request.getParameter("bModifier");
		String supprimeParam = request.getParameter("bSupprimer");
		
		String libArt = request.getParameter("libelleArticle");
		String stkArt = request.getParameter("stockArticle");
		String pdsArt =  request.getParameter("poidsArticle");
		String desc = request.getParameter("description");
		Article article = new Article();
		
		if(ajouterParam != null)
		{
			article.setLibelle(libArt);
			article.setDescription(desc);
			article.setMdp(mdp);
			if(estManager != null) 
			{
				article.setEstManager(true);
			}
			else
			{
				article.setEstManager(false);
			}
			
			try {
				PersonnelDAO.Insert(article);
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(modifParam != null)
		{
			
		}		
		
		if(supprimeParam != null)
		{
			
		}
}
}
