package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metier.Personnel;

public class PersonnelDAO {

	public static ArrayList<Personnel> getLePersonnel() throws SQLException
	 {
		 
		 ArrayList<Personnel> lePersonnel = new ArrayList<Personnel>();
		Statement state = null;
		ResultSet result = null;
		try {
			
			 Personnel unePersonne = new Personnel();
			 
			 Connection conn = AccesBase.getConnection();
			 state = conn.createStatement();
			    
			 result = state.executeQuery("SELECT * FROM utilisateur");
			 ResultSetMetaData resultMeta = result.getMetaData();   
			   
			 while(result.next())
			 {
				 unePersonne.setNum(result.getInt("idUtilisateur")); // verif nom des colonnes
				 unePersonne.setNom(result.getString("nom"));
				 unePersonne.setPrenom(result.getString("prenom"));
				 unePersonne.setLogin(result.getString("login"));
				lePersonnel.add(unePersonne);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			  result.close();
			     state.close();
		}   
		return lePersonnel;
		 
	 }
	public static Personnel UtilisateurExiste(String login ,String leMdp ) throws SQLException{
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		metier.Personnel Pepito = new metier.Personnel();

		try{
			cnx = AccesBase.getConnection();
		
			rqt = cnx.prepareStatement("SELECT * FROM utilisateur where login =? AND motDePasse=?");
			rqt.setString( 1,login );
			rqt.setString( 2, leMdp);
			rs=rqt.executeQuery();
			// SI on trouve au moins 1 résultat, on prend le 1er pour mettre à jour les informations de l'Utilisateur utilisé pour la recherche.
			if (rs.next()){
				Pepito.setNum(rs.getInt("idUtilisateur"));
				Pepito.setNom(rs.getString("nom"));
				Pepito.setPrenom(rs.getString("prenom"));
				Pepito.setLogin(rs.getString("login"));
				Pepito.setMdp(rs.getString("motDePasse"));
				Pepito.setEstManager(rs.getBoolean("estManager")) ; 
				
			}
			// ...sinon on renvoie null
			else 
			{
				Pepito = null;
			}
			
		}		
		 catch (SQLException sqle) 
		{
			 Pepito = null;
		}				
		finally
		{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		
	
		
		return Pepito;
	}
	
	 public static boolean Insert(Personnel item)throws SQLException
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "INSERT INTO utilisateur (nom, prenom, login,motDePasse,estManager) VALUES(?, ?, ?,?,?);" );

			 state.setString( 1, item.getNom());
			  state.setString( 2, item.getPrenom());
			  state.setString( 3, item.getLogin() );
			  state.setString( 4, item.getMdp());
			  state.setBoolean(5, item.isEstManager() );

			 /* Exécution de la requête */
			 int statut = state.executeUpdate();
			 if(statut > 0 ) izOkay = true;
		}
		catch( Exception ex)
		{
			izOkay = false;
		}
		
		 return izOkay;
	 }
	 public static boolean Delete(int id) throws SQLException
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "Delete from utilisateur where idUtilisateur = ?" );

			state.setInt(  1, id);
			 

			 /* Exécution de la requête */
			 int statut = state.executeUpdate();
			 if(statut > 0 ) izOkay = true;
		}
		catch( Exception ex)
		{
			izOkay = false;
		}
		
		 return izOkay;
	 }
	 public static boolean Update(Personnel item) throws SQLException
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "Update utilisateur set nom=?,prenom=?,login=?,motDePasse=?,estManager=?" );
			 state.setString( 1, item.getNom());
			  state.setString( 2, item.getPrenom());
			  state.setString( 3, item.getLogin() );
			  state.setString( 4, item.getMdp());
			  state.setBoolean(5, item.isEstManager() );

			 

			 /* Exécution de la requête */
			 int statut = state.executeUpdate();
			 if(statut > 0 ) izOkay = true;
		}
		catch( Exception ex)
		{
			izOkay = false;
		}
		
		 return izOkay;
	 }
	
	 public static Personnel getUtilisateurId(int id ) throws SQLException{
			Connection cnx = null;
			PreparedStatement rqt = null;
			ResultSet rs = null;
			metier.Personnel Pepito = new metier.Personnel();

			try{
				cnx = AccesBase.getConnection();
			
				rqt = cnx.prepareStatement("SELECT * FROM utilisateur where idUtilisateur =? ");
				rqt.setInt( 1,id );
				
				rs=rqt.executeQuery();
				// SI on trouve au moins 1 résultat, on prend le 1er pour mettre à jour les informations de l'Utilisateur utilisé pour la recherche.
				if (rs.next()){
					Pepito.setNum(rs.getInt("idUtilisateur"));
					Pepito.setNom(rs.getString("nom"));
					Pepito.setPrenom(rs.getString("prenom"));
					Pepito.setLogin(rs.getString("login"));
					Pepito.setMdp(rs.getString("motDePasse"));
					Pepito.setEstManager(rs.getBoolean("estManager")) ; 
					
				}
				// ...sinon on renvoie null
				else 
				{
					Pepito = null;
				}
				
			}		
			 catch (SQLException sqle) 
			{
				 Pepito = null;
			}				
			finally
			{
				if (rs!=null) rs.close();
				if (rqt!=null) rqt.close();
				if (cnx!=null) cnx.close();
			}
			
		
			
			return Pepito;
		}
}
