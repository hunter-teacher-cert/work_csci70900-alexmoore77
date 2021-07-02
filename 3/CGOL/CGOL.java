//Group members:  Alex Moore, Diana, Eduardo
//Comments:  Making fine progress - everything pretty intuitive so far.  We took some time to understand the Game of Life before diving into coding.
/*List of variables
  r/c are row and col

  Note:  X is life, [blank] is no life
*/

import java.io.*;
import java.util.*;

/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/

public class CGOL
{

  //initialize empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols) {

   
    char [][] newBoard=new char[rows][cols];


    return newBoard;
  }


  //print the board to the terminal
  public static void printBoard(char[][] board) {
  

    for (int i=0;i<board.length;i++)
      {
        for (int j=0;j<board[0].length;j++)
          {
            System.out.print("["+board[i][j]+"]");

          } //for int j
        System.out.println();
      };//for int i
  }//printBoard


  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val){

    board[r][c]=val;

  }


  //return number of living neigbours of board[r][c]
  //row and col

  //Checks the board and square passed in (x=r, y=c) to count the number of neighbors.  Uses a nested for loop that goes from -1 to 0 to 1 to check the spaces around the square

  //Possible issue:  array out of bounds if by the edge - may need to modify later
  public static int countNeighbours(char[][] board, int r, int c) {

    int totalNeighbors=0;

    if(r>0 && c>0)
      {
        if (board[r-1][c-1]=='X')
          totalNeighbors++;
      };


    if(r>0)
      {
        if (board[r-1][c]=='X')
          totalNeighbors++;
      };


    if (r>0 && c<24)
      {
        if (board[r-1][c+1]=='X')
          totalNeighbors++;
      };

    if (c>0)
      {
        if (board[r][c-1]=='X')
          totalNeighbors++;
      };

    if (c<24)
      {
        if (board[r][c+1]=='X')
          totalNeighbors++;
      };

    if (c>0&&r>24)
      {
        if (board[r+1][c-1]=='X')
          totalNeighbors++;
      };

    if (r>24)
      {
        if (board[r+1][c]=='X')
          totalNeighbors++;
      };

    if (r>24 && c>24)
      {
        if (board[r+1][c+1]=='X')
          totalNeighbors++;
      };

    return totalNeighbors;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board,int r, int c) {
    if (countNeighbours(board, r, c)==2
        || countNeighbours(board, r, c)==3)
      return 'x';
    else return ' ';

  }


  //generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {
    

    for (int i=0;i<25;i++)
      for (int j=0;j<25;j++)
        {
          //possible that we need to make a new board?

          board[i][j]=
            getNextGenCell(board,i,j);

        }

    return board;
  }


  public static void main( String[] args ){

    
    char[][] board;
    board = createNewBoard(25,25);

    //temporary - for testing purposes - then delete
    /*
      printBoard(board);
      System.out.println(countNeighbours(board,5,5));
    */
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    //    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  }//end main()

}//end class