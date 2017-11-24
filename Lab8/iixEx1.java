
import FormatIO.*;
public class iixEx1 
{

 public static void main(String[]arg) //creates main object
 {
	 Console con = new Console (); //creates console
	 /*String wantBox = "Do you want to draw a box?";
	 con.println(wantBox);
	 String userWants = con.readLine();	//determines if user wants to draw a box
	 while (userWants.equals("yes")) {
		 
		 String howManyRows = "How many rows?"; //finds out from user how many rows they wish
		 con.println(howManyRows);
		 int noRows = con.readInt();
		 String howManyCols = "How many columns?"; //finds out from user how many columns they wish
		 con.println(howManyCols);
		 int noCols = con.readInt();
		 //call helper methods
		 con.println(wantBox); //asks user if they want to draw another box */
	
	 int noCols = 5;
	 int noRows = 5;
	 
	 drawTop(con, noCols);
	 drawSide(con, noRows, noCols);
	 	 	 
 }
	 	 		 	 
	 private static void drawTop(Console con, int noCols) 	 //creates a helper method called drawTop
	 {	con.print("+");
	  	for (noCols = 1; noCols <= 5; noCols++) 
	  	{con.print("-");
	    }
	  	con.print("+\n");
		 	 
	 
     }
	 
	 private static void drawSide (Console con, int noRows, int noCols)
	 {	
		for (noCols = 1; noCols <=5; noCols++);
		con.println("|");
	 	 	
	 		
	 	for (noRows = 1; noRows <=3; noRows++)
	 	{
	 	}
	 	con.println("|");
		
	 	
	 }	
}
		 
	 		 
 
