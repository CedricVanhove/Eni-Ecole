package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personnel;
import DAO.PersonnelDAO;

/**
 * Servlet implementation class ListerEmploye
 */
public class ListerEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListerEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		lister(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		lister(request,response);
	}
	protected void lister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	     RequestDispatcher dispatcher;
			
			ArrayList<Personnel> lePersonnel;
			
			try 
			{
					
				lePersonnel = PersonnelDAO.getLePersonnel() ;			
			}
			catch (SQLException sqle)
			{
				// Placer l'objet représentant l'exception dans le contexte de requete
				request.setAttribute("erreur", sqle.getMessage().toString());
				// Passer la main à la page de présentation des erreurs
				dispatcher = getServletContext().getRequestDispatcher("/erreur/erreur.jsp");
				dispatcher.forward(request, response);
				return;
			}
			
			request.getSession().setAttribute("ListerEmploye",lePersonnel);
			dispatcher = request.getRequestDispatcher("IHM/Manager/gestionEmploye.jsp"); 
			dispatcher.forward(request, response);

			
		}
}
