import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
       System.out.println("Testing default constructor.");
    
  /*  L value = R value

    variable <- value
    
x+1 = 1 + x (What is the value, and assign this to the address of the variable on the left.)
*/

    SuperArray sa = new SuperArray(); //SuperArray() is constructor
  
  
    System.out.println("Testing empty print:");
    System.out.println(sa);

    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println(sa.isEmpty());

    System.out.println("\nTesting add 100 to indecies: 5, 0, and 17 or end");
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);
    sa.add(27, 100);
    System.out.println(sa);

  
  


    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    //precondition: newly-instantiated SuperArray of default capacity
    
    
    
    
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    sa.remove(15);
    System.out.println(sa);
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//main

}//class SuperArrayDriver