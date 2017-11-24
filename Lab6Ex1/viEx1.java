import FormatIO.*;

public class viEx1 {

	public static void main (String[] arg) 
	{
		Console con = new Console();
		int delivery = 450;
		
		con.println("Please enter the number of items");
		int num = con.readInt();
				
		con.println("Please enter the cost of one item");
		double costOne = con.readDouble();
		int cost1 = (int)(costOne*100);
				
		con.println("Please enter the name of the item");
		String itemName = con.readWord();
		
		int totalCost = num*cost1 + delivery;
		int costPerson1 = totalCost/3;
		int costPerson2 = totalCost/3;
		int costPerson3 = totalCost/3;
		int numPerson1 = num / 3;
		int numPerson2 = num / 3;
		int numPerson3 = num / 3;
				
		
	    String messOut = String.format("£%-7.2f per person, ", (double)costPerson1/100);
	   	String messOut2 = String.format("%d "+ itemName + "s " + "per person", numPerson1);
	   	
	 	int remainder = totalCost % 3;	 	
	 	String messOut3 = String.format("£%-7.2f owed by Persons 2 and 3\n", (double)costPerson1/100);
	 	
	 	if (remainder == 0) {
	   	
	  		con.println(messOut + messOut2);
	  		 		
	 	}
	 	
	 		
	 	else {
	 		
	 	    int costPerson1new = costPerson1 + remainder;
	 	    //double costPerson1newPound = (double)costPerson1 + remainder;/
	   		String newMess = String.format("£%-7.2f owed by Person1", (double)costPerson1new/100);
	   		
	   		con.println(newMess);
	   	}
	 	
	
	 	int leftOver = num % 3;
	 			
	 	if (leftOver > 0) {
	 	
	   	int numPerson1new = numPerson1 + leftOver;
	   	String messOut4 = String.format("%d " + itemName + "s " + "for person1\n", numPerson1new);
	   	String messOut5 = String.format("%d " +itemName + "s " + "for persons2 and 3\n", numPerson1);
	   			
	   		con.println(messOut4 + messOut3 + messOut5);
	 		 		 	
	 	}
	   		
	   			   	
	}	}
     