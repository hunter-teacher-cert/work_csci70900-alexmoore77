/**
   Alex Moore and Benson Leung
   
   lab -- Day 7 | 0b111 | 0x7

   class: Foogle

   A mystery class for code analysis and search exploration.

   USAGE:
   As a team, read through at least once. Dialogue.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   (get handy with your editor's find/replace shortcuts...)
   Insert comment preceding each method to summarize functionality.

   T. Mykolyk, F. Dragon
   June 2021

   Original Error:
   Note: Foogle.java uses unchecked or unsafe operations.
  Note: Recompile with -Xlint:unchecked for details.
**/

import java.io.*;
import java.util.*;

public class Foogle
{

  //  Parameters are ArrayList and int
  // For loop:  0 to ArrayList.size() - returns the ArrayList index of the first int in ArrayList that is equal to target
  //return index of first equal value
  //if the item is not there, return -1 
  public static int searchForFirstInstance( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end searchForFirstInstance()


  //  
  //<YOUR DESCRIPTIVE COMMENT HERE>
  public static ArrayList gizmo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); //0
      //retArr.add( (int)(hi * Math.random()) ); // [0,?)
      retArr.add( lo + (int)(hi * Math.random()) ); // [?,?)
    }
    return retArr;
  }//end gizmo()


  //  <YOUR DESCRIPTIVE COMMENT HERE>
  public static ArrayList wooHa(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    // <YOUR DESCRIPTIVE COMMENT HERE>
    if ( numItems<1 )
      return retArr;

    // <YOUR DESCRIPTIVE COMMENT HERE>
    retArr.add(
               (int)(lo * Math.random())
               );

    // <YOUR DESCRIPTIVE COMMENT HERE>
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); //0
      //retArr.add( (int)(hi * Math.random()) ); // [0,?)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [?,?)
      //System.out.println(retArr.get(i-1));  //diag.
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) );
    }

    return retArr;
  }//end wooHa()


  public static void main( String[] args )
  {
    // test battery for gizmo()
    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
    System.out.println("\n"+"al000"+":");
    ArrayList al000 = gizmo(0,0,0);
    System.out.println(al000);
    System.out.println(searchForFirstInstance(al000,3));

    System.out.println("\n"+"al01"+":");
    ArrayList al01 = gizmo(5,0,100);
    System.out.println(al01);
    System.out.println(searchForFirstInstance(al01,3));

    System.out.println("\n"+"al02"+":");
    ArrayList al02 = gizmo(5,3,10);
    System.out.println(al02);
    System.out.println(searchForFirstInstance(al02,3));

    System.out.println("\n"+"al05"+":");
    ArrayList al05 = gizmo(20,1,5);
    System.out.println(al05);
    System.out.println(searchForFirstInstance(al05,3));
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


    // test battery for wooHa()
    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
    System.out.println("\n"+"sal000"+":");
    ArrayList sal000 = wooHa(0,0,0);
    System.out.println(sal000);
    System.out.println(searchForFirstInstance(sal000,3));

    System.out.println("\n"+"sal00"+":");
    ArrayList sal00 = wooHa(5,0,100);
    System.out.println(sal00);
    System.out.println(searchForFirstInstance(sal00,3));

    System.out.println("\n"+"sal01"+":");
    ArrayList sal01 = wooHa(5,0,100);
    System.out.println(sal01);
    System.out.println(searchForFirstInstance(sal01,3));

    System.out.println("\n"+"sal02"+":");
    ArrayList sal02 = wooHa(5,3,100);
    System.out.println(sal02);
    System.out.println(searchForFirstInstance(sal02,3));

    System.out.println("\n"+"sal03"+":");
    ArrayList sal03 = wooHa(5,0,100);
    System.out.println(sal03);
    System.out.println(searchForFirstInstance(sal03,3));

    System.out.println("\n"+"sal04"+":");
    ArrayList sal04 = wooHa(20,0,3);
    System.out.println(sal04);
    System.out.println(searchForFirstInstance(sal04,3));

    System.out.println("\n"+"sal05"+":");
    ArrayList sal05 = wooHa(20,1,5);
    System.out.println(sal05);
    System.out.println(searchForFirstInstance(sal05,3));
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

    /*
    System.out.println("\n"+"al"+":");
    ArrayList al = gizmo(,0,100);
    System.out.println(al);

    */
  }//end main

}//end class