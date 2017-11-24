/*A program to obtain first and last names from user and display a greeting.
 * A console is used for interaction with the user.
 * Author: Lauren Ruddocks - 19th Sep 2017
 */

import FormatIO.*;

public class iiEx1 {

	public static void main (String[] arg)
    {
		//obtain user's first name
		Console con = new Console();                  
    	
    	con.println("Please enter your first name");  
    	String firstName = con.readWord();            
    	System.err.println(firstName);                
    	
    	//obtain user's last name
    	con.println("Please enter your last name");
    	String lastName = con.readWord();
    	System.err.println(lastName);
    	
    	//display greeting
    	con.println("Hello " + firstName + " " + lastName + ". Welcome to Glasgow");
    }
}
