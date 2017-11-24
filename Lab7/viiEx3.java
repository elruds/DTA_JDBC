import FormatIO.*;
import java.util.*;
import java.lang.*;

public class viiEx3 {

public static void main (String[]arg)
{
	Console con = new Console(); //creates a Console window
	Random rand = new Random(); //allows a random number to be generated
	int numTries = numGame(con,rand);
		
	//con.println("You took " + numTries + " tries.");//prints number of tries until reach correct answer
			
}

private static int numGame(Console con, Random rand) //creates a helper method called numGame

{ 	int num = Math.abs(rand.nextInt()) % 10; //generates random number between 0 and 9
	System.out.println(num); //for testing
	
	int numTries = 0; //variable to count number of attempts
	int totalScore = 0; //variable to count total score
	totalScore += numTries;
	String letsPlay = "\nLet's play a guessing game.  Please enter a number between 0 and 9.";
	
	for (;;) {
	
	con.println(letsPlay);
	int userGuess = con.readInt(); //stores user's guess
	numTries++;
	
	if (userGuess == num)
		
	{	con.println("Correct! Well done!");	
		break;	
	}
	
	else if (userGuess > num)
		
	{	con.println("Incorrect. Too high! Try again.");
		
	}
	
	else if (userGuess < num)
	
	{	con.println("Incorrect. Too low! Try again.");
			
	}
	
	return numTries;
	con.println("Do you want to play again? Type yes or no.");
	String cont = con.readLine();
	
	
	if (cont.equals("No")) {
		break;
	}
	}

	
	
