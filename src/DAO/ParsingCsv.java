/**
 * 
 */
package DAO;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.opencsv.CSVReader;



/**
 * @author achilla2016
 *
 */
public class ParsingCsv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CSVReader reader = null;
		try 
		{
			//Get the CSVReader instance with specifying the delimiter to be used
			reader = new CSVReader(new FileReader("d:\\csvexpeditor.csv"),';');
			String [] nextLine;
			//Read one line at a time
		    while ((nextLine = reader.readNext()) != null) 
		    {
		    	for(String token : nextLine)
				{if(token.contains(";")){
					String []mat=token.split(";");
					for (String item : mat) {
					
					}
				}if(token.contains("-")){
					String[] adpo=token.split("-");
					for (String addr :adpo) {
						String [] po=adpo[1].toString().split(" ");
						
						System.out.println();
						
						
					}
				}
					
				
				
				
				//Print all tokens
					//System.out.println(token);
				}
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
