import java.util.Random;
import javax.swing.*;

/* Level 2, Task 2 (Compulsory Task 1)
Estine van der Berg, 2 April 2020 */

public class rockpaperscissors {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Rock, Paper, Scissors!"); 
		// Welcome the user to your game
		
		System.out.println("\nYou will be playing against the computer\n" + 0 + " = Scissors \n" + 1 + " = Rock\n" + 2 + " = Paper \nScissors beats Paper \nRock beats Scissors \nPaper beats Rock");
		// Give the parameters of the game to your user
		
		Random rand = new Random();
		int compNum = rand.nextInt(3);
		// Generate a random number between 0 and 2 
		
		String response = JOptionPane.showInputDialog("\nEnter " + 0 + " for Scissors " + 1 + " for Rock or " + 2 + " for Paper");
		// Ask user to input their choice
		
		// Display what the User has chosen: 
		if (response.equalsIgnoreCase("0"))
		{	System.out.println("\nYou Played: Scissors");	
		}	// If Response from user is 0, print out Scissors
		
		else if (response.equalsIgnoreCase("1"))
		{	System.out.println("\nYou Played: Rock");
		}	// If Response from user is 1, Print out Rock 
		
		else if (response.equalsIgnoreCase("2"))
		{	System.out.println("\nYou Played: Paper");	
		}	// If response from user is 2, Print out Paper
		
		// Display what the PC has generated
		if (compNum == 0)
		{	System.out.println("\nComputer Played: Scissors");	
		}	// If Response from comp is 0, print out Scissors
		
		else if (compNum == 1)
		{	System.out.println("\nComputer Played: Rock");
		}	// If Response from comp is 1, Print out Rock 
		
		else if (compNum == 2)
		{	System.out.println("\nComputer Played: Paper");	
		}	// If response from comp is 2, Print out Paper
		
		// Display whether you have won, lost or drew using if else statements
		if (response.equalsIgnoreCase("0") && compNum == 0)
		{	System.out.println("\nYOU DRAW!");	
		}
		else if (response.equalsIgnoreCase("1") && compNum == 1)
		{	System.out.println("\nYOU DRAW!");
		}
		else if (response.equalsIgnoreCase("2") && compNum == 2)
		{	System.out.println("\nYOU DRAW!");
		}
		else if (response.equalsIgnoreCase("0") && compNum == 2)
		{	System.out.println("\nYOU WIN! :)");
		}
		else if (response.equalsIgnoreCase("2") && compNum == 0)
		{	System.out.println("\nYOU LOSE! :(");
		}
		else if (response.equalsIgnoreCase("1") && compNum == 0)
		{	System.out.println("\nYOU WIN! :)");
		}
		else if (response.equalsIgnoreCase("0") && compNum == 1)
		{	System.out.println("\nYOU LOSE! :(");
		}
		else if (response.equalsIgnoreCase("2") && compNum == 1)
		{	System.out.println("\nYOU WIN! :)");
		}
		else if (response.equalsIgnoreCase("1") && compNum == 2)
		{	System.out.println("\nYOU LOSE! :(");
		}
			
	}
}
