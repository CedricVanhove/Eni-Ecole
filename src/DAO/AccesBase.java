package DAO;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class AccesBase {	
	public static Connection getConnection() throws SQLException{
		Connection cnx=null;

		//Utiliser le pool de connexion défini dans le fichier web.xml
		InitialContext jndi = null;
		try {
			jndi = new InitialContext();
		} catch (NamingException ne) {
			ne.printStackTrace();
			throw new SQLException("Impossible d'atteindre l'arbre JNDI");
		}
		
		DataSource ds = null;
		
		//récuperer les caractéristiques dans le fichier context.xml
		try {
			ds=(DataSource) jndi.lookup("java:comp/env/jdbc/ds1");
		} catch (NamingException ne) {
			ne.printStackTrace();
			throw new SQLException("Pool de connexion introuvable dans l'arbre jndi");
		}
		
		//activer une connexion du pool
		cnx=ds.getConnection();
		
		return cnx;
	}
}
