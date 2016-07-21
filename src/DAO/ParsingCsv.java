/**
 * 
 */
package DAO;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import metier.Commande;
import com.opencsv.CSVReader;



/**
 * @author achilla2016
 *
 */
public class ParsingCsv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {ArrayList<Commande> commandes = null;
	Commande commande= new Commande();
	CSVReader reader = null;
	Statement state = null;
	ResultSet result = null;
	String[] adpo=null;
	String [] po=null;
	try 
	{
		//Get the CSVReader instance with specifying the delimiter to be used
		reader = new CSVReader(new FileReader("d:\\csvexpeditor.csv"),';');
		String [] nextLine;
		String []mat;
		//Read one line at a time
	    while ((nextLine = reader.readNext()) != null) 
	    {	
	    	for(String token : nextLine)
	    	
			{commande.setDate(nextLine[0]);
	    	commandes.add(commande);
	    	System.out.println(commandes);
	    		if(token.contains(";")){
				mat=token.split(";");
				for (String item : mat) {
				
				}
			}if(token.contains("-")){
				adpo=token.split("-");
				for (String addr :adpo) {
					po=adpo[1].toString().split(" ");
					
				//	System.out.println();
					
				}
			}
				
			
			
			
			//Print all tokens				
			}
	    //	System.out.println(nextLine[2]);
	    	
	    	
	    }
	}
    catch (Exception e) {
		e.printStackTrace();
	}
	finally	{
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	}

}
