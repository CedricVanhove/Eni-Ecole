package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metier.Article;
import metier.Client;
import metier.Commande;
import metier.DetailsCommande;
import metier.Personnel;

public class CommandeDAO 
{
	public static ArrayList<Commande> getLesCommandes() throws SQLException
	 {
		 
		 ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
		Statement state = null;
		ResultSet result = null;
		try {
		
			Commande laCommande = new Commande();
			 
			 Connection conn = AccesBase.getConnection();
			 state = conn.createStatement();
			    
			 result = state.executeQuery("SELECT * FROM Commande ORDER BY DATE");
			 ResultSetMetaData resultMeta = result.getMetaData();   
			   
			 while(result.next())
			 {				
				 laCommande.setNum(result.getInt("numCommande"));	
				 laCommande.setEtats(result.getString("etat"));
				 laCommande.setDate(result.getDate("dateCommande"));
				 Personnel SBIREMAN = PersonnelDAO.getUtilisateurId(result.getInt("utilisateur"));
				 Client ALL_HAIL_PEPITO  = ClientDAO.getClientById(result.getInt("client"));
				 laCommande.setPepito(ALL_HAIL_PEPITO);
				 laCommande.setLeSbire(SBIREMAN);
				
				 lesCommandes.add(laCommande);
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
		return lesCommandes;
		 
	 }
	 public static boolean Insert(Commande item)
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "INSERT INTO commande (etat, dateCommande, client,utilisateur) VALUES(?, ?, ?,?);" );

			 state.setString( 1, "ECS");
			 state.setDate( 2, item.getDate());
			 state.setInt( 3, item.getPepito().getId() );
			 state.setInt( 4, item.getLeSbire().getNum() );
			 int statut = state.executeUpdate();
			 if(statut > 0 ) izOkay = true;
		}
		catch( Exception ex)
		{
			izOkay = false;
		}
		
		 return izOkay;
	 }
	 
	 public static boolean UpdateEtat(String etat)
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		String newEtat="FIN";
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "Update  commande set etat = ?" );

			 if(etat=="ECS") newEtat="ATT";
			 
			 state.setString( 1, newEtat);
			 
			 int statut = state.executeUpdate();
			 if(statut > 0 ) izOkay = true;
		}
		catch( Exception ex)
		{
			izOkay = false;
		}
		
		 return izOkay;
	 }
	 
	 public static boolean ComptonsLesMoutons(int idLarbin)
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "Select count(*)  commande where utilisateur = ? AND ETAT LIKE ? OR ?" );

			 state.setInt( 1, idLarbin);
			 state.setString( 2, "ECS");
			 state.setString( 3, "ATT");
			 
			 int statut = state.executeUpdate();
			 if(statut > 0 ) izOkay = true;
		}
		catch( Exception ex)
		{
			izOkay = false;
		}
		
		 return izOkay;
	 }
}
