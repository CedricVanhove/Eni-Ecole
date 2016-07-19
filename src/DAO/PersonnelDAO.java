package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PersonnelDAO {

	public static metier.Personnel UtilisateurExiste(String leId ,String leMdp ) throws SQLException{
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		metier.Personnel Pepito = new metier.Personnel();
		try{
			cnx = AccesBase.getConnection();
			byte[] uniqueKey = leMdp.getBytes();
			try {
				leMdp=MessageDigest.getInstance("MD5").digest(uniqueKey).toString();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rqt = cnx.prepareStatement("SELECT * FROM utilisateur where login ='" + leId + "' AND motDePasse='" + leMdp + "'");			
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
