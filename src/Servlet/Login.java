package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personnel;
import DAO.PersonnelDAO;;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
		// TODO gggtgtggtgggAuto-generated method stub
		valider(request,response);

	}

	protected void valider(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher;

		boolean isManager=false;
		boolean isEmploye=false;
		String accessPage = null;
		String menuJsp=null;
		String utilisateurConnecteAttName=null;
		Personnel utilisateurConnecte = null;



		// Si l'utilisateur est déjà connecté, on redirige vers son menu
		utilisateurConnecte = (Personnel)request.getSession().getAttribute(utilisateurConnecteAttName);	
		if (utilisateurConnecte!=null) {
			response.sendRedirect(request.getContextPath()+menuJsp);
			return;
		}		


		// Récupération des informations saisies dans le formulaire
		String login = request.getParameter("username");
		String motdepasse = request.getParameter("password");

		// Controle des informations :
		// si tous les champs ne sont pas renseignés, revenir sur la page du formulaire
		if (   (login == null) || (login.length() == 0) 
				|| (motdepasse == null) || (motdepasse.length() == 0)) {

			String message = "Les champs Identifiant et Mot de passe sont obligatoires";
			request.setAttribute("erreur", message);
			dispatcher = getServletContext().getRequestDispatcher("/erreur/erreur.jsp");
			dispatcher.forward(request, response);
			return;
		}

		try 
		{
			// Valider l'identification par rapport aux informations de la base			
			utilisateurConnecte = PersonnelDAO.UtilisateurExiste(login, motdepasse) ;
			if(utilisateurConnecte != null)
			{

				if (utilisateurConnecte.isEstManager())
				{
					isManager=true;				
					utilisateurConnecteAttName="Utilisateur";
					menuJsp="/IHM/Manager/gestionCommandeManager.jsp";
				}
				else 
				{
					isEmploye=true;			
					utilisateurConnecteAttName="Utilisateur";
					menuJsp="/candidat/accueilCandidat.jsp";
				}
			}
			else
			{
				String message = "Erreurs identifiant ou mdp";
				request.setAttribute("erreur", message);
				// Passer la main à la page de présentation des erreurs
				dispatcher = getServletContext().getRequestDispatcher("/erreur/erreur.jsp");
				dispatcher.forward(request, response);
				return;
			}

		} catch (SQLException sqle) {
			// Placer l'objet représentant l'exception dans le contexte de requete
			request.setAttribute("erreur", sqle.getMessage().toString());
			// Passer la main à la page de présentation des erreurs
			dispatcher = getServletContext().getRequestDispatcher("/erreur/erreur.jsp");
			dispatcher.forward(request, response);
			return;
		}		

		// Si l'authenification est réussie...
		if (utilisateurConnecte != null) {
			// Invalider la session en cours dans le cas où c'est un autre profil qui est déjà connecté
			request.getSession().invalidate();

			// Placer le bean dans le contexte de session
			request.getSession().setAttribute("nomUtilisateur", utilisateurConnecte.getNom());
			request.getSession().setAttribute("prenomUtilisateur", utilisateurConnecte.getPrenom());
			request.getSession().setAttribute("idUtilisateur", utilisateurConnecte.getNum());
			request.getSession().setAttribute("typeUtilisateur",utilisateurConnecteAttName);
			// Présenter la réponse
			response.sendRedirect(request.getContextPath()+menuJsp);
			return;
		}
		// ...sinon

	}

}
