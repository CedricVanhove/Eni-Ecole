package Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ArticleDAO;
import DAO.PersonnelDAO;
import metier.Article;
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
		
		ArrayList<Personnel> lePersonnel=(ArrayList<Personnel>) request.getSession().getAttribute("ListerEmploye");
		int indexPersonne;
		Personnel unePersonne = new Personnel();
		
		if(ajouterParam != null)
		{
			String nom = request.getParameter("nomEmp");
			String prenom = request.getParameter("prenomEmp");
			String login =  request.getParameter("loginEmp");
			String mdp =  request.getParameter("mdpEmp");
			String estManager =  request.getParameter("managerCheckbox");
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
				
				unePersonne.setNum(lePersonnel.get(lePersonnel.size()-1).getNum() +1);
				lePersonnel.add(unePersonne);
				//request.getSession().setAttribute("ListerPersonne",lePersonnel);
				//ajouter unePersonne dans lister emplouyé
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(modifParam != null)
		{	
			
			String nom = request.getParameter("nomEmpModif");
			String prenom = request.getParameter("prenomEmpModif");
			String login =  request.getParameter("loginEmpModif");
			String idnul =  request.getParameter("idPersonnel");
			String estManager =  request.getParameter("managerCheckboxmodif");
			
			Personnel personnelCourant=PersonnelDAO.rechercherPepitoParId(Integer.parseInt(idnul), lePersonnel);
			indexPersonne=lePersonnel.indexOf(personnelCourant);
			unePersonne.setNom(nom);
			unePersonne.setPrenom(prenom);
			unePersonne.setLogin(login);
			unePersonne.setNum(Integer.parseInt(idnul));
			
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
				lePersonnel.set(indexPersonne, unePersonne);
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
