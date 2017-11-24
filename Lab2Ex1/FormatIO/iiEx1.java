package FormatIO;
import FormatIO.*;

public class iiEx1 {

	public static void main (String[] arg)
    {
    	Console con = new Console();
    	
    	con.println("Please enter your first name");
    	String firstName = con.readWord();
    	
    	con.println("Please enter your last name");
    	String lastName = con.readWord();
    	
    	con.println("Hello" + firstName + lastName + "Welcome to Glasgow");
    }
}
