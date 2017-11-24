package FormatIO;
import FormatIO.*;

public class ivEx1 {

	public static void main (String[] arg)
    {
		Console con = new Console();
		double delivery = 4.50;
		
		con.println("Please enter the number of items");
		int num = con.readInt();
		double num2 = (double)num;
		
		con.println("Please enter the cost of one item");
		double costOne = con.readDouble();
		
		con.println("Please enter the name of the item");
		String itemName = con.readWord();
		
		double totalCost = num2*costOne + delivery;
		double costPerson1 = totalCost/3;
		double costPerson2 = totalCost/3;
		double costPerson3 = totalCost/3;
		int numPerson1 = (int)num2 / 3;
		int numPerson2 = (int)num2 / 3;
		int numPerson3 = (int)num2 / 3;
		
	    String messOut = String.format("£%7.2f per person, ", costPerson1);
	   	String messOut2 = String.format("%d "+ itemName + "s " + "per person", numPerson1);
	   	
	   	con.println(messOut + messOut2);
    
	   	
	   	
	   	if (totalCost % 3 !=0); 
    }    
}