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
import metier.Article;

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
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException, SQLException{
		RequestDispatcher dispatcher; 
		String ajouterArticle = request.getParameter("ajouter");
		ArrayList<Article> listeArticle= new ArrayList<Article>();
		Article article = null; 
		if(ajouterArticle == null){
			listeArticle = ArticleDAO.getLesArticles();
			request.setAttribute("listeArticle", listeArticle);
			dispatcher = request.getRequestDispatcher("/Manager/gestionArticle.jsp");
			dispatcher.forward(request, response);
		}
		

	}
}
