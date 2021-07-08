import java.io.*;
import java.util.*;

//Final Project
public class Craps
{
	
	
/**
Final Project:  displayDice:  Displays ASCII dice depending on what was rolled.
*/
	public static int displayDie (int valueOfDie)
	{

			if (valueOfDie==1)
			{
			
			System.out.println("*********");
			System.out.println("*       *");
			System.out.println("*   *   *");
			System.out.println("*       *");
			System.out.println("*********");
			System.out.println("");
			}
			else if (valueOfDie==2)
			{
			System.out.println("*********");
			System.out.println("* *     *");
			System.out.println("*       *");
			System.out.println("*     * *");
			System.out.println("*********");
				
			}
			else if (valueOfDie==3)
			{
			System.out.println("*********");
			System.out.println("* *     *");
			System.out.println("*   *   *");
			System.out.println("*     * *");
			System.out.println("*********");

			}
			else if (valueOfDie==4)
			{
			System.out.println("*********");
			System.out.println("* *   * *");
			System.out.println("*       *");
			System.out.println("* *   * *");
			System.out.println("*********");

			}
			else if (valueOfDie==5)
			{
			System.out.println("*********");
			System.out.println("* *   * *");
			System.out.println("*   *   *");
			System.out.println("* *   * *");
			System.out.println("*********");

			}
			else if (valueOfDie==6)
			{
			System.out.println("*********");
			System.out.println("* *   * *");
			System.out.println("* *   * *");
			System.out.println("* *   * *");
			System.out.println("*********");
			};
	
return valueOfDie;
		}
	
	/**
Final Project:  roll:  Returns a random number between 1 and highNumber
*/
	
	public static int roll (int highNumber)
	{
	Random myRand=new Random();

	return displayDie(myRand.nextInt(highNumber)+1);
	}//roll
	
	/**
Final Project:  shoot:  Returns a random number between 1 and highNumber
*/
	public static int shoot (int numberOfDice, int maxValueOfDice)
	{
	
	int totalRoll=0;
	
	for (int counter=0;counter<numberOfDice;counter++)
	{
	totalRoll+=roll(maxValueOfDice);
	}//for
	
	return totalRoll;
	}//shoot


	/**
Final Project:  round:  Indicate whether the player wins or loses.
*/	
	public static String round (int wins, int losses)
	{

if (wins>losses) return "You should be proud!";
else if (losses>wins) return "Better luck next time!";
else if (losses==wins) return "You broke even!";
else return "I don't know what to say...";

	}//round
		
	/**
Final Project:  pointRoll:  Keep rolling until the player gets a 7 or the Point.
*/	
		public static int pointRoll(int thePoint)
		{
				int rollThisRound=0;
		return rollThisRound;
		}//pointRoll
	
	/**
Final Project:  printTitle:  Prints the title
*/	
	
	public static void printTitle()
	{
	System.out.println("\n\n\n\n\n\n\n**************************************");		
	
System.out.println("Welcome to 2021 Craps:  Java Edition!");
System.out.println("Developed by Alex Moore, Hunter College Pre-work");
System.out.println("**************************************\n\n\n\n\n\n");		
	
	};//printTitle
	
	public static void main (String[] args)
	{
		//initialize variables
		final int win=1;
		final int loss=0;
		final int rollAgain=2;
		int totalRounds=0;
		int rollThisRound=0;
		int pointsRound=0;
		int wins=0;
		int losses=0;
		int titleScreenRoll=0;
		Scanner scanner=new Scanner(System.in);
		String str;
		
		if (args.length>0)
		totalRounds=Integer.parseInt(args[0]);
		else System.out.println("Error:  Enter the number of rounds to play on the command line after java Craps");		
if (totalRounds!=0) printTitle();	
titleScreenRoll=shoot(2,6);
System.out.println("\n\n\n\n\nHit Enter to begin!");
str=scanner.nextLine();

		for (int currentRound=1;currentRound<=totalRounds;currentRound++)
		
		{
printTitle();
System.out.println("****************************");		
System.out.println("Current Round: "+currentRound);
System.out.println("Wins: "+ wins+" Losses: " + losses);
System.out.println("****************************");		

		
		rollThisRound=shoot(2,6);
		System.out.println("You rolled " + rollThisRound+"!");
		if (rollThisRound==2 || rollThisRound==3 || rollThisRound==12)
		{
			
		System.out.println ("That's Craps!  You lose!!");
		losses++;
		System.out.println ("Hit Enter to continue.");
		str=scanner.nextLine();
		}//if
		else if (rollThisRound==7 || rollThisRound==11)
		{
			System.out.println ("That's a Natural!  You win!!");
		wins++;
		System.out.println ("Hit Enter to continue.");

str=scanner.nextLine();
		}//if
		else {
		
		System.out.println("Now "+rollThisRound+" is the Point!  Keep shooting until you roll a 7 or a "+rollThisRound+".");
		System.out.println ("Hit Enter to continue.");

str=scanner.nextLine();

		while (pointsRound!=7 && pointsRound!=rollThisRound)
		{
			printTitle();
		pointsRound=shoot(2,6);
		System.out.println("You rolled "+ pointsRound+"!");
		if (pointsRound==7)
		{
		System.out.println("Oh no!  You needed to roll a "+rollThisRound+", which was the Point.  You lose!!");	
		losses++;
		System.out.println ("Hit Enter to continue.");

str=scanner.nextLine();
	}//if
	
		else if (pointsRound==rollThisRound)
		{
			System.out.println("That's the Point.  You win!!");
		wins++;
		System.out.println ("Hit Enter to continue.");

str=scanner.nextLine();
		
		}
		else 
		{
System.out.println("That's not "+rollThisRound+", but it's also not a 7!");
		
		System.out.println ("Hit Enter to continue.");

str=scanner.nextLine();
			
		}
		;//else
		};//while
		pointsRound=0;
		}//else
		
		};//for
	
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n****************************");		
System.out.println("Thanks for playing!");
System.out.println("Total Rounds: "+totalRounds);
System.out.println("Wins: "+ wins+" Losses: " + losses);
System.out.println(round(wins,losses));
System.out.println("****************************");		

	
	}//main
}//Hello