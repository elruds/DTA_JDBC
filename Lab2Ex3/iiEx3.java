/* A program to locate the radius from a file and use it to calculate
 * and display the area of a circle
 * 
 * The file has one line with the form 
 * radius= <actual radius> metres.
 * 
 * The entire contents of the file are read as a string
 * and then split into four components using a StringIn object
 * 
 * The radius is read as a double
 * 
 * The area is printed in a console
 * 
 * Author: Lauren Ruddocks - 19 Sep 2017 
 * * 
 */

import FormatIO.*;

public class iiEx3 {
	
	public static void main (String[] arg)
	{
		//read line from file
		FileIn fin = new FileIn("H:\\circles.txt");
		
		String strLast = fin.readLine();
		double radius = 0; //keeps compiler happy
		
		//line is split into four components using StringIn
		StringIn sin = new StringIn(strLast);
	    
		String word1, word2, word3;
		
		word1 = sin.readWord();
		word2 = sin.readWord();
		radius = sin.readDouble();
		word3 = sin.readWord();
		
		//area calculated
		double areaCircle = 0;
		areaCircle = 3.14 * radius * radius;
		
		//area printed to console
		Console con = new Console();
		con.println("The area is " + areaCircle);
		
		
	}
}