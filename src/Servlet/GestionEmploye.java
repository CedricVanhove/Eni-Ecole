package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PersonnelDAO;
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
		
		String nom = request.getParameter("nomEmp");
		String prenom = request.getParameter("prenomEmp");
		String login =  request.getParameter("loginEmp");
		String mdp =  request.getParameter("mdpEmp");
		String estManager =  request.getParameter("managerCheckbox");
		Personnel unePersonne = new Personnel();
		
		if(ajouterParam != null)
		{
			unePersonne.setNom(nom);
			unePersonne.setPrenom(prenom);
			unePersonne.setLogin(login);
			unePersonne.setMdp(mdp);
			if(estManager != null) 
			{
				unePersonne.setEstManager(true);
			}
			else
			{
				unePersonne.setEstManager(false);
			}
			
			try {
				PersonnelDAO.Insert(unePersonne);
				//ajouter unePersonne dans lister emplouyé
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(modifParam != null)
		{
			unePersonne.setNom(nom);
			unePersonne.setPrenom(prenom);
			unePersonne.setLogin(login);
			
			if(estManager != null) 
			{
				unePersonne.setEstManager(true);
			}
			else
			{
				unePersonne.setEstManager(false);
			}
			
			try {
				PersonnelDAO.Update(unePersonne);
				//ajouter unePersonne dans lister emplouyé
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
		if(supprimeParam != null)
		{
			
		}
		response.sendRedirect("IHM/Manager/gestionEmploye.jsp");
}
}
