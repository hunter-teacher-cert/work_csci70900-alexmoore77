/*
Hunter Java Work - Folder 1
Nim Game
Creator:  Alex Moore
Date:  6-30-21
Initial draft created collaboratively by 
*/

import java.io.*;
import java.util.*;

public class Nim{
public static void main(String[] args){
  int bag=12;
  int turn = 0;
  
  System.out.println("*********************");
	
  System.out.println("Welcome to the Game of Nim!");
  System.out.println("*********************");
  
  for(int counter=0;counter<bag;counter++)
	{
		System.out.print(" ["+(counter+1)+ "] ");
	};
  
  while(bag>0){
    turn++;//turn=turn+1
    if (turn % 2 == 1){
    System.out.println("\n*********************");
	System.out.println("Turn:  Player");

    System.out.println("Current Stones: "+bag);
	System.out.println("*********************");
      bag-=playerRound(bag);

    } else {
    System.out.println("\n*********************");
    System.out.println("Turn:  AI");

    System.out.println("Current Stones: "+bag);

System.out.println("*********************");
      bag-=aiRound(bag);


    }//else
for(int counter=0;counter<bag;counter++)
	{
		System.out.print(" ["+(counter+1)+ "] ");
	};


	
  }//while

  if (turn%2 ==1) {
    System.out.println("Congratulations!  You won!"); 
  }//if
  else {
    System.out.println("The AI won.  Sorry- try again!");
  }//else


} //end main

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

public static int aiRound(int bag){

int aiPull=0;

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



