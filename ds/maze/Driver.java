import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	boolean solved;
	/*
	  Maze m = new Maze("maze.dat");
	solved = m.solve(1,1);

	
	  Knights k = new Knights(5);
	  solved = k.solve(1,1);
		*/
	
  System.out.println("*********************************");
  System.out.println("          Knight's Tour");
  System.out.println("          By Alex Moore");
  System.out.println("          Summer 2021");
  System.out.println("*********************************\n\n");

  
System.out.println("Please select a chess board size for The Knight's Tour.");
  Scanner myInput = new Scanner(System.in);
  //what user types in is assigned to user
  int choice=myInput.nextInt();

Knights k = new Knights(choice);
k.solve(2,2,1);
/*
  Knights k = new Knights(5);
	k.solve(2,2,1);
*/
//System.out.println(k);
  
/*  
  Knights k6 = new Knights(6);
	k6.solve(2,2,1);
 */ 
    }
}