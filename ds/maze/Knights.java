/******************************************
Knight's Tour 
By Alexander Moore
For Hunter College Summer 2021
Description:  The program calls the solve method recursively until it finds a way for the knight to visit every square on a board of the specified size exactly once.
Accomplishments:  I hope to create a simple chess game at some point in my life, so this has gotten me started.  It has also given me a stronger understanding of recursion in practice.  I actually found this program to be easier and more intuitive than the maze program, perhaps because I love chess.  
Challenges:  Tried to add instance variable to count the number of recursive calls on the stack and print along with the board, but was not working as intended, so I walked away.  The toString() method slowed down the program too much, so I set it to be called near the end. Did not determine how to call it exactly once at the very end. 
******************************************/

import java.io.*;
import java.util.*;

public class Knights{


    // the board is of ints rather than chars like the maze
    // since we want to track the moves by number
    
    private int[][] board;
    private int rows = 5;
    private int cols = 5;
    private int size=5;
    public int recursiveCallsOnStack=0;
    private String clearScreen="[0;0H\n";

    private void delay(int n)
    {
	try 
	    {Thread.sleep(n);} 
	catch(InterruptedException e)
	    {}

    }

    
    public Knights(int size){
	rows = size;
	cols = size;
	this.size=size;
	int row,col;
  recursiveCallsOnStack=0;

	// Notice that the board is 4 bigger in both directions with 0's
	// in the middle and a 2 row/col border of -1.
	// Why are we doing this?
	board = new int[cols+4][rows+4];
	for (row = 0; row < rows+4; row++){
	    for (col = 0; col < cols+4 ; col++){
		board[col][row] = -1;
	    }
	}
	for (row = 2; row < rows+2; row++){
	    for (col = 2; col < cols+2 ; col++){
		board[col][row] = 0;
	    }
	}

	
    }

    public String toString(){
	int row,col;
	int value;
	String result = "";
	for (row = 0; row < rows+4; row++){
	    for (col = 0; col < cols+4; col++){
		value = board[col][row];

		// Why do we have this if as opposed to 
		// just adding the next value to the string?
		if (value < 10 && value >= 0){
		    result = result + "0" + value+ " ";
		} else {
		    result = result + value + " ";
		}
	    }
	    result = result +"\n";
	};
  result+="Recursive Calls on Stack:"+recursiveCallsOnStack+"\n";
	return result;
    }

    public boolean solve(int col,int row, int count){
	boolean solved = false;
recursiveCallsOnStack++;

	// This should return true when we've solved the problem
	// What should CHANGETHIS be?
	// in the maze we knew we were done when we found the exit
	// here, when do we know when we're done?
	// HINT: you have an nxn board and are done when you've visited
	// every board location
	
  //System.out.println("this.size*this.size="+this.size*this.size);

  if (count>((this.size*this.size)))
  {

//Use only printing at the end to improve efficiency
	System.out.println(clearScreen+this);

recursiveCallsOnStack--;
	    return true;
	}


	// this should return false when we're at an illegal location
	// change CHANGETHIS to the appropriate boolean
	// HINT: we are tracking our moves in the board
	// and also built that border of -1 values.
	if (board[col][row]!=0){
	    
      recursiveCallsOnStack--;
      return false;
	}
	

	// what do we put into the board
	// Change CHANGETHIS
	board[col][row]=count;

//location of count++ could be important
count++;

//print the board only once at the end
/*
if (count==(this.size*this.size))
System.out.println(this);
*/
//Cut delay to improve efficiency

//delay(1);
//Use only one print at the end to improve efficiency

//	System.out.println(clearScreen+this);


	// Here we need to do try to do the 8 recursive calls
	// one for each knight's move.
	// It should be almost the same as the maze routine except:
	// 1. The maze had only four calls.
	// 2. The parameters for the call are a little different.
	// Add the recursive calls here
	
  solve( col+1,row-2 , count);

	solve(col+2,row-1, count);

	solve(col+1,row+2, count);

	solve(col+2,row+1, count);

	solve(col-1,row-2, count);

	solve(col-2,row-1, count);

	solve(col-1,row+2, count);

	solve(col-2,row+1, count);
  
	// Here we unset where we were for the backtracking
	
	board[col][row]=0;
	
  recursiveCallsOnStack--;
  return solved;
    }

    

    
}