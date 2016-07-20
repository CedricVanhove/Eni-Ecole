package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sun.text.CodePointIterator;
import metier.Client;

public class ClientDAO {
	
	public static void addClient(Client client) throws SQLException{
		PreparedStatement rqt=null;
		Connection cnx=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("insert into client(nom, adresse, codepostal, ville, tel, mail) values (?,?,?,?,?)");
			rqt.setString(1, client.getNom());
			rqt.setString(2, client.getAdresse());
			rqt.setString(3, client.getCP());
			rqt.setString(4, client.getVille());
			rqt.setString(5, client.getTel());
			rqt.setString(6, client.getMail());
			rqt.executeUpdate();
		}finally{
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
	}
	
	public static Client getClientById(int idClient) throws SQLException{
		Client client = new Client();
		PreparedStatement rqt=null;
		Connection cnx=null;
		ResultSet rs=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("select * from client where idclient = ?");
			rqt.setInt(1, idClient);
			rs=rqt.executeQuery();
			while (rs.next()){
				client.setId(idClient);
				client.setNom(rs.getString("nom"));				
				client.setAdresse(rs.getString("adresse"));
				client.setCP(rs.getString("cp"));
				client.setVille(rs.getString("ville"));
				
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return client;
	}

	public static Client getClientByNom(String nom,String cp) throws SQLException{
		Client client = new Client();
		PreparedStatement rqt=null;
		Connection cnx=null;
		ResultSet rs=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("select * from client where nom = ? and codePostal=?");
			rqt.setString(1,nom);
			rqt.setString(2, cp);
			rs=rqt.executeQuery();
			while (rs.next()){
				client.setId(rs.getInt("idClient"));
				client.setNom(nom);				
				client.setAdresse(rs.getString("adresse"));
				client.setCP(cp);
				client.setVille(rs.getString("ville"));	
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return client;
	}
	
	public static Client getClient() throws SQLException{
		Client client = new Client();
		PreparedStatement rqt=null;
		Connection cnx=null;
		ResultSet rs=null;
		try{
			cnx=AccesBase.getConnection();
			rqt=cnx.prepareStatement("select * from client ");
			rs=rqt.executeQuery();
			while (rs.next()){
				client.setId(rs.getInt("idClient"));
				client.setNom(rs.getString("nom"));				
				client.setAdresse(rs.getString("adresse"));
				client.setCP(rs.getString("cp"));
				client.setVille(rs.getString("ville"));	
				client.setMail(rs.getString("mail"));
			}
		}finally{
			if (rs!=null) rs.close();
			if (rqt!=null) rqt.close();
			if (cnx!=null) cnx.close();
		}
		return client;
	}

	
	
	
}
