package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personnel;

/**
 * Servlet implementation class GestionEmploye
 */
public class GestionEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		valider(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		valider(request,response);
	}

	protected void valider(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     	RequestDispatcher dispatcher;
     	String ajouterParam = request.getParameter("bAjouter"); 
		String modifParam = request.getParameter("bModifier");
		String supprimeParam = request.getParameter("bSupprimer");
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String login =  request.getParameter("login");
		String mdp =  request.getParameter("mdp");
		
		Personnel unePersonne = new Personnel();
		
		if(ajouterParam != null)
		{
			unePersonne.setEnonce(enonce);
			if(taRace != null) laQuestion.setMarque(1);
			
			try {
				QuestionDAO.QuestionAjouter(laQuestion);
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
