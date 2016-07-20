package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonnelDAO {

	public static metier.Personnel UtilisateurExiste(String login ,String leMdp ) throws SQLException{
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
	
	

}
