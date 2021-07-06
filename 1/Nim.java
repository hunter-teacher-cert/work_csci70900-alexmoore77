/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
Game of Nim - Day[1]
Team:  Alex Moore, Mamudu Wally, Marina Moschenko
Objective:  Create a Game of Nim with a working AI.  
Skills:  Input/output, procedures, collaboration
Comments:  I enjoyed making this game, and I think I made the AI unbeatable, which was a point of pride.  I have done a lot of programming over the years in Java and other languages, but this was my first true experience with programming in a group.  It can save a lot of time, but it also requires a different skillset!

*/

import java.io.*;
import java.util.*;

public class Nim{
public static void main(String[] args){
  int bag=12;
  int turn = 0;
  
  //welcome message
  System.out.println("*********************");
	
  System.out.println("Welcome to the Game of Nim!");
  System.out.println("*********************");
  
  //draw bags
  for(int counter=0;counter<bag;counter++)
	{
		System.out.print(" ["+(counter+1)+ "] ");
	};
  
  //loop - as long as bags>0
  while(bag>0){
    turn++;//turn=turn+1
//alternate between player and AI
    if (turn % 2 == 1){
    System.out.println("\n*********************");
	System.out.println("Turn:  Player");

    System.out.println("Current Stones: "+bag);
	System.out.println("*********************");
//subtract from total bags number of bags selected by player, chosen through playerRound method.
      bag-=playerRound(bag);

    } else {
    System.out.println("\n*********************");
    System.out.println("Turn:  AI");

    System.out.println("Current Stones: "+bag);

System.out.println("*********************");
//subtract from total bags number of bags selected by AI, chosen through aiRound method.
      bag-=aiRound(bag);
    }//else

//display remaining bags on screen
for(int counter=0;counter<bag;counter++)
	{
		System.out.print(" ["+(counter+1)+ "] ");
	};
	
  }//while

//the player who removes the last stone wins the game
  if (turn%2 ==1) {
    System.out.println("Congratulations!  You won!"); 
  }//if
  else {
    System.out.println("The AI won.  Sorry- try again!");
  }//else


} //end main

//get input from player - return # stones
public static int playerRound(int bag){
  Scanner in = new Scanner(System.in);
  System.out.println("\nPull 1, 2, or 3 stones: ");
  int youPull = in.nextInt();
System.out.println("You pulled "+youPull+" stones.");

  // if (youPull<1 || youPull>3){
  //   System.out.print()
  // }
return youPull;
  
} //end player
// check also that when pulling, that aiPull or youPull doesnt equal bag

//get input from AI - return # stones
public static int aiRound(int bag){

int aiPull=0;

//The logic is that the AI always wants the stones after it selects to be a multiple of four to set up a win.
if (bag==11)
aiPull=3;
else if (bag==10)
aiPull=2;
else if (bag==9)
aiPull=1;
	else if (bag==7)
	aiPull=3;
	else if (bag==6)
	aiPull=2;
	else if (bag==5)
	aiPull=1;
	else if (bag==8 || bag==12 || bag==4)
	{
System.out.println("Random!");
Random rn = new Random();
aiPull= rn.nextInt(3 - 1 + 1) + 1;

	}
	else aiPull=bag;

if (bag==11 || bag==10 || bag==9 || bag==7 || bag==6 || bag==5) System.out.println("Ha! I've already won!");

Scanner in = new Scanner(System.in);

 System.out.println("I pulled "+ aiPull+ " stones!");

return aiPull;  
} //end ai
// check also that when pulling, that aiPull or youPull doesnt equal bag

} //end of class
