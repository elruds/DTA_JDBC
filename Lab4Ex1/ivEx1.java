import FormatIO.*;

public class ivEx1 {

	public static void main (String[] arg) 
	{
		Console con = new Console();
		int delivery = 450;
		
		con.println("Please enter the number of items");
		int num = con.readInt();
				
		con.println("Please enter the cost of one item in pence");
		int costOne = con.readInt();
		
		con.println("Please enter the name of the item");
		String itemName = con.readWord();
		
		int totalCost = num*costOne + delivery;
		int costPerson1 = totalCost/3;
		int costPerson2 = totalCost/3;
		int costPerson3 = totalCost/3;
		int numPerson1 = num / 3;
		int numPerson2 = num / 3;
		int numPerson3 = num / 3;
		
	    String messOut = String.format("%d pence per person, ", costPerson1);
	   	String messOut2 = String.format("%d "+ itemName + "s " + "per person", numPerson1);
	   	
	 	int remainder = totalCost % 3;	 	
	 	
	 	if (remainder == 0);{
	   	
	  		con.println(messOut + messOut2);
	  	
	 	}	
	 
	 	else ;{
	 		
	 		int costPerson1new = costPerson1 + remainder;
	        String messOut3 = String.format("%d pence owed by Persons 2 and 3, ", costPerson1);
	   		String newMess = String.format("%d pence owed by Person1", costPerson1new);
	   		
	   		con.println(newMess);
	   	}
	 	
	 	int leftOver = num % 3;
	 			
	 	if (leftOver > 0); {
	 	
	   	int numPerson1new = numPerson1 + leftOver;
	   	String messOut4 = String.format("%d " + itemName + "s " + "for person1 ", numPerson1new);
	   	String messOut5 = String.format("%d " +itemName + "s " + "for persons2 and 3", numPerson1);
	   			
	   		con.println(messOut4 + messOut5);
	 		 		 	
	 	}
	   		
	   			   	
	}	}
     
