package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metier.Article;

public class ArticleDAO 
{
 public static ArrayList<Article> getLesArticles() throws SQLException
 {
	 
	 ArrayList<Article> lesArticles = new ArrayList<Article>();
	Statement state = null;
	ResultSet result = null;
	try {
		
		 Article lArticle;
		 
		 Connection conn = AccesBase.getConnection();
		 state = conn.createStatement();
		    
		 result = state.executeQuery("SELECT * FROM article");
		 ResultSetMetaData resultMeta = result.getMetaData();   
		   
		 while(result.next())
		 {
			 lArticle = new Article();
			 lArticle.setNum(result.getInt("idArticle")); // verif nom des colonnes
			 lArticle.setLibelle(result.getString("libelle"));
			 lArticle.setDescription(result.getString("description"));
			 lArticle.setPoids(result.getString("poids"));
			lesArticles.add(lArticle);
			 
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
	return lesArticles;
	 
 }
 public static boolean Insert(Article item)
 {
	 boolean izOkay = false;
	 PreparedStatement state = null;
	ResultSet result = null;
	try
	{
		 Connection conn = AccesBase.getConnection();
		 state = conn.prepareStatement( "INSERT INTO article (libelle, description, poids) VALUES(?, ?, ?);" );

		 state.setString( 1, item.getLibelle());
		  state.setString( 2, item.getDescription());
		  state.setString( 3, item.getPoids() );

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
 public static boolean Delete(int id)
 {
	 boolean izOkay = false;
	 PreparedStatement state = null;
	ResultSet result = null;
	try
	{
		 Connection conn = AccesBase.getConnection();
		 state = conn.prepareStatement( "Delete from article where idArticle = ?" );

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
 public static boolean Update(Article item)
 {
	 boolean izOkay = false;
	 PreparedStatement state = null;
	ResultSet result = null;
	try
	{
		 Connection conn = AccesBase.getConnection();
		 state = conn.prepareStatement( "Update article set libelle=?,description=?,poids=? where idArticle=?" );

		 state.setString( 1, item.getLibelle());
		  state.setString( 2, item.getDescription());
		  state.setString( 3, item.getPoids() );
		  state.setInt( 4, item.getNum() );
		 

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
 
 public static Article getLArticleId(int id) throws SQLException
 {
	 
	 Article lArticle = new Article();
	Statement state = null;
	ResultSet result = null;
	try {
		
		 
		 
		 Connection conn = AccesBase.getConnection();
		 state = conn.createStatement();
		    
		 result = state.executeQuery("SELECT * FROM article where idArticle=" + id);
		 ResultSetMetaData resultMeta = result.getMetaData();   
		   
		 while(result.next())
		 {
			 lArticle.setNum(result.getInt("idArticle")); // verif nom des colonnes
			 lArticle.setLibelle(result.getString("libelle"));
			 lArticle.setDescription(result.getString("description"));
			 lArticle.setPoids(result.getString("poids"));
			
			 
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
	return lArticle;
	 
 }
}
