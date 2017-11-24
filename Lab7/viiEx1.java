/*A program that generates a random number between 0 and 9 and gives the user one chance to guess it via a console interface. It 
 * then tells them whether they guessed correctly and if not, whether they were too high or too low
 */

import FormatIO.*;
import java.util.*;
import java.lang.*;

public class viiEx1 {

public static void main (String[]arg)

{	Console con = new Console(); //creates a Console window
	Random rand = new Random(); //allows a random number to be generated
	int num = numGame(con,rand);
	
	con.println(num); //prints the the correct number on the console
}



private static int numGame(Console con, Random rand) //creates a helper method called numGame

{ 	int num = Math.abs(rand.nextInt()) % 10; //generates random number between 0 and 9
	System.out.println(num); //for testing
	
	con.println("Let's play a guessing game.  Please enter a number between 0 and 9.");
	int userGuess = con.readInt(); //stores user's guess
	
	if (userGuess == num)
		
	{	con.println("Correct! Well done!");	
		
	}
	
	else if (userGuess > num)
		
	{	con.println("Incorrect. Too high! The correct answer was: ");
		
	}
	
	else if (userGuess < num)
	
	{	con.println("Incorrect. Too low! The correct answer was:");
		
	}
	
	return num; //returns the number to the main method 

	
	
}
	




}