package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import metier.Article;

public class ArticleDAO 
{
 public ArrayList<Article> getLesArticles() throws SQLException
 {
	 
	 ArrayList<Article> lesArticles = new ArrayList<Article>();
	Statement state = null;
	ResultSet result = null;
	try {
		lesArticles = new ArrayList<Article>();
		 Article lArticle = new Article();
		 
		 Connection conn = AccesBase.getConnection();
		 state = conn.createStatement();
		    
		 result = state.executeQuery("SELECT * FROM article");
		 ResultSetMetaData resultMeta = result.getMetaData();   
		   
		 while(result.next())
		 {
			 lArticle.setNum(result.getInt("idArticle"));
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
}
