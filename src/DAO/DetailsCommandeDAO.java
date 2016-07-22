package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metier.Article;
import metier.Commande;
import metier.DetailsCommande;

public class DetailsCommandeDAO 
{
	public static ArrayList<DetailsCommande> getLesLignes(int id) throws SQLException
	 {
		 
		 ArrayList<DetailsCommande> lesLignes = new ArrayList<DetailsCommande>();
		Statement state = null;
		ResultSet result = null;
		try {
		
			DetailsCommande ligne = new DetailsCommande();
			 
			 Connection conn = AccesBase.getConnection();
			 state = conn.createStatement();
			    
			 result = state.executeQuery("SELECT * FROM detailsCommande where idcommande="+id);
			
			
			 while(result.next())
			 {
				 Commande laCommande = new Commande();
				 Article lArticle = new Article();
				 laCommande.setNum(result.getInt("commande"));
				 ligne.setNumLigne(result.getInt("numLigne")); 
				 lArticle = ArticleDAO.getLArticleId(result.getInt("article"));
				 ligne.setlArticle(lArticle);
				 ligne.setLaCommande(laCommande);
				 ligne.setQte(result.getInt("quantite"));
				
				 lesLignes.add(ligne);
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
		return lesLignes;
		 
	 }
	 public static boolean Insert(DetailsCommande item)
	 {
		 boolean izOkay = false;
		 PreparedStatement state = null;
		ResultSet result = null;
		try
		{
			 Connection conn = AccesBase.getConnection();
			 state = conn.prepareStatement( "INSERT INTO detailsCommande (commande, article, quantite) VALUES(?, ?, ?);" );

			 state.setInt( 1, item.getLaCommande().getNum());
			  state.setInt( 2, item.getlArticle().getNum());
			  state.setInt( 3, item.getQte() );

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
	
}
