/* a program to locate radius information from a file and use it to calculate and
 * display the area of a circle.  
 * 
 * The file has one line with the form 
 * radius= <actual radius> metres.
 * 
 * The unwanted words are read as strings but not used.
 * 
 * The radius is read as a double.
 * 
 * Area is printed in two consoles and in an output file called Lab2Out.txt
 * 
 * Author: Lauren Ruddocks - 19 Sep 2017
 */

import FormatIO.*;

public class iiEx2 {
	
	public static void main (String[] arg)
	{
		//create a FileIn object and read the data
		FileIn fin = new FileIn("circles.txt");
		String str1 = "";
		str1 = fin.readWord();
		
		String str2 = "";
		str2 = fin.readWord();
		
		double dou1 = 0;
		dou1 = fin.readDouble();
		
		String str3 = "";
		str3 = fin.readWord();
		
		//calculate the area
		double areaCircle = 0;
		areaCircle = 3.14 * dou1 * dou1;
		
		//create consoles and display area message
		Console con1 = new Console();
		Console con2 = new Console();
		con1.println("The area is " + areaCircle);
		con2.println("The area is " + areaCircle);
		
		//create output file and display area message
		FileOut fOut = new FileOut("Lab2Out.txt");
		fOut.println("The area is " + areaCircle);
	}
}
