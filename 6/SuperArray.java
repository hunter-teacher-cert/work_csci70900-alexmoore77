/**
  Is a constructor created by default?
  How many array elements are necesary?
  Can we create two constructors with identical parameters?
  If we know that an instance variable is going to have an initial value of 0, is it still good practice to include it in the constructor and set it to 0?
  When is the this word necessary, and when can it be left out?
  Do we need to fill in empty array indices with 0, or can we leave them at the default value?

   lab skeleton
   encapsulation / SuperArray
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
 **/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //instance vars
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    data = new int[size];
  
    //numberElements=0;
  }

 

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    data = new int[10];

    //numberElements=0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~


  public void add( int value )
  {
    // test to see if we need to grow, then grow
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER
    this.grow();
    // add item
    data[numberElements] = value;
    
    // increment numberElements
    numberElements++;


  }//end add()

  // New add method that takes an index parameter
  public void add(int index, int value)
  {
    // test to see if we need to grow, then grow
    this.grow(index);
    //this.grow();
    // add item
    for (int i = numberElements; i>=index; i--){
      data[i+1]=data[i];
    }

    data[index] = value;
    
    // increment numberElements
    numberElements++;

  }//end  new add()

  //Method to test if array is empty
  public boolean isEmpty()
  {
    return numberElements==0;
  }//end of isEmpty()


  public int get(int index)
  {
    return 0; //default return

  }

  // Method for printing Array
  public String toString()
  {
    String returnString="";
    
    for (int i=0; i<this.data.length;i++)
    {
      returnString+=(this.data[i]+" ");
    };//end of for loop to print
    
    return returnString;

  }//end toString()


  //helper method for debugging/development phase
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  private void grow()
  {
    if (numberElements==this.data.length) // if new array is needed then increase by 10
    {
      int[] newData = new int[this.data.length+10]; //increase array by 10
    
    //populate newData with data
      for (int i=0; i<this.data.length; i++){
        newData[i] = this.data[i];
      }
      this.data = newData;
      }    
    else 
    {
      //do nothing
    }
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?

    // copy over all the elements from the old array to the new one

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
  }//end grow()

// New grow method to check if index is greater than current array size or if adding a value to a full array

private void grow(int index)
  {
    if (index>this.data.length) // if new array is needed then increase by 10
    {
      int[] newData = new int[index+1]; //increase array to index
    
    //populate newData with data
      for (int i=0; i<this.data.length; i++){
        newData[i] = this.data[i];
      }
      this.data = newData;
    } 

    else if (numberElements==this.data.length)
      {
      int[] newData = new int[this.data.length + 1]; //increase array by 1
    
      //populate newData with data
      for (int i=0; i<this.data.length; i++){
        newData[i] = this.data[i];
      }
      this.data = newData;
      }

    else{
      //do nothing
    }
     
      
  }// end of new grow method



    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?

    // copy over all the elements from the old array to the new one

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
 

}//end class