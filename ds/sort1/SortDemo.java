//Initial version created by Alex Moore, Liam Baum, and JiYoon Kim
/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
SortDemo
*/

import java.io.*;
import java.util.*;

/*

Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder

Lab:

Part 1:
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.

Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.

Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.

*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    private Random r;

  // can you include non-instance variables in a constructor?
  // can you make a constructor and omit certain instance variables?
  // When to use or not use this. ?

    //constructs ArrayList data length 15 filled with random numbers [0,19]
    public SortDemo(){
	    data = new ArrayList<Integer>(); // create new ArrayList of integers
	    r = new Random();  // create variable to hold random number
	    for (int i=0;i<15;i++){ // loop 15 times
	    data.add(r.nextInt(20)); // assign a random integer into ArrayList btwn 0 and 19
    }//for
  }//SortDemo

    //constructs ArrayList data with specified length size filled with random numbers [0,19]
    public SortDemo(int size){ // creates parameterized constructor - argument for size of ArrayList
	     data = new ArrayList<Integer>(); // create new ArrayList of integers
	     r = new Random(); // create variable to hold random number
	     for (int i=0;i<size;i++){//loop size times (= to argument passed through parameter)
	        data.add(r.nextInt(20)); // assign a random integer into ArrayList btwn 0 and 19
	     }
    }//end constructor with parameter

    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end

    */
    //finds the index of the minimum value for the sub-ArrayList from var start to end
    public int findSmallestIndex(int start){
	     int smallIndex = start; // set smallIndex to start argument value

       int smallestValue=this.data.get(start); // set smallestValue to ArrayList value at start index

       //may or may not present an issue for certain data sets
       for (int i= start + 1;i<this.data.size();i++) // loop starting at start value + 1 going to length of ArrayList
       {
         if (this.data.get(i) < smallestValue) // if value in ArrayList at i index is less than current smallestValue...
         {
           smallestValue = this.data.get(i); //...set the smallest value to the value at index i
           smallIndex = i; // set the smallest index to i
         }
       }//for

	// start a variable at the one after start
	// your code here

	// loop from that variable to end and update smallIndex as needed
	// your code here
	     return smallIndex;  // return the index of the smallest value
    } //end findSmallestIndex

    public int get(int index){
      return data.get(index);
    }


    public void sort(){
      int i; // declare variable for loop
      for (i=0;i < data.size()-1; i++){ // for loop to iterate through data
        int currMinIndex = findSmallestIndex(i+1); // initializing variable to store current Minimum index
        // find the smallest index from i to end --use findSmallestIndex
        // your code here
        if(data.get(currMinIndex) < data.get(i)) { // if value at currMinIndex is less than value at i.....
          // swap the item at that index and i
          // your code here
          swap(i, currMinIndex); // ... swap values in ArrayList indecies
        }

      }
    }

    /*
    allocate temp storage
    put var A in temp
    overwrite var A with var B
    overwrite var B with temp
    */

    // method for swapping two values
    public void swap(int aIndex, int bIndex) {
      int temp = data.get(aIndex); // assigns temp var with value at aIndex
      data.set(aIndex, data.get(bIndex)); // overwrites value at aIndex with value from bIndex
      data.set(bIndex, temp); // overWrites value at bIndex with temp var which held value at aIndex
    }




    /* If you finish the lab early you can get started on this */
    //In what context would a Boolean return value be superior
    public int linearSearch(int value){
      // loop through the ArrayList data
      // and if the value you're searchign for is in the ArrayList, return it.
      // return -1 if it isn't there.
      for(int i = 0; i < data.size(); i++){
        if(data.get(i) == value) {
          return value; // replace this return
        }
      }
      return -1;

    }

    /* If you finish the lab early you can get started on this */
    public int binarySearch(int value){
	boolean isValueEqualToMid = false;
	int lowerIndex = 0;
	int upperIndex = data.size();
	int middleIndex = data.size()/2;

if (data.get(middleIndex)==value)
return value;



if (data.get(middleIndex)<value)
return binarySearch();

if (data.get(middleIndex)>value)
return binarySearch();

  // is middleIndex == value - return value; -> exit loop
  // if value is higher -> low == middle -> mid = hi - lo
  // else if value is lower -> high == middle -> mid == mid/2



	/* if upper crosses lower it's not there and the loop should exit the loop
	   and if the item is at middle you should exit the loop

           you have to replace the "replacethiswithrealexpression" boolean
           with a correct expression based on lowerIndex and upperIndex
	*/
	while (!isValueEqualToMid)
	    {
		// update lower and upper.
		// remember if value is less than data.get(middleIndex) you want to search next time
		// from lower to the middle and otherwise from the middle to the upper.
		//
		// then update middleIndex based on new lowerIndex and upperIndex.
      if(middleIndex == value) {
        return value;
      } 
      else if (value > middleIndex) {
        // if value is higher -> low == middle -> mid = hi - lo
      } 
      else if(value > middleIndex) {
        //if value is lower -> high == middle -> mid == mid/2
      }
	    }

	/* replace this return to either return the value if it was found and -1
	   if upperIndex and lowerIndex crossed
	*/

	return 0; // replace this return
    }


    public String toString(){
	return ""+data;
    };

public ArrayList<Integer> msort(ArrayList<Integer> l){

    	ArrayList<Integer> left = null;
    	ArrayList<Integer> right = null;

//mergesort (sorts and combines)
  //merge (combines)

    	// base case - if the input ArrayList is smaller than 2 elements

      if (l.size() < 2) {

        return l;

      }
      // split l into left and right halves
      else {

        left = new ArrayList<Integer>(l.subList(0,l.size()/2));
        right = new ArrayList<Integer>(l.subList((l.size()/2),l.size()));

        System.out.println(left);
        System.out.println(right);
      }

      // sort the left half, sort the right half
      // merge the two halves that have been sorted
      // return the result
      return merge(msort(left), msort(right));

      }//method

    public void msortTest(){
	     data = msort(data);
    }

 private ArrayList<Integer> merge(ArrayList<Integer> a,
				     ArrayList<Integer> b){

        //Initialize variables to store the index of ArrayList a and ArrayList b
        int indexA = 0;
        int indexB = 0;

        //Make a new ArrayList<Integer> of size a.size + b.size to return
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        //Iterate through the two arrays to merge them

        //Testing to see if either ArrayList is already full.
        //If so, add the next remaining element to the ArrayList
        //and increment that ArrayList's counter.
//Are both arrays full?
//while (!(indexA>a.size() && indexB>b.size())
        for (int i = 0 ; i < (a.size()+b.size()) ; i=i+1){

          if (indexA > (a.size()-1))
          {
            sorted.add(b.get(indexB)); //add to ArrayList sorted, the value in ArrayList b
            indexB++; //increment the index in ArrayList b
          }
          else if (indexB > (b.size()-1))
          {

            sorted.add(a.get(indexA)); //add to ArrayList sorted, the value in ArrayList a
            indexA++; //increment the index in ArrayList a

          }

          //Else both lists have at least one space, and the values can be compared, and the element can be added, and the index can be incremented.
          else
          {
            //If the element in ArrayList a is greater than
            //the element in ArrayList b...
            if (a.get(indexA) > b.get(indexB)){

              sorted.add(b.get(indexB)); //add to ArrayList sorted, the value in ArrayList b
              indexB++; //increment the index in ArrayList b

            }

            //If the element in ArrayList b is greater than
            //the element in ArrayList a...
            else if (a.get(indexA) < b.get(indexB)){

              sorted.add(a.get(indexA)); //add to ArrayList sorted, the value in ArrayList a
              indexA++; //increment the index in ArrayList a

            }

            //If the elements in the 2 ArrayLists are equal...
            else if (a.get(indexA) == b.get(indexB)){
              sorted.add(a.get(indexA)); //add to ArrayList sorted, the value in ArrayList a
              indexA++; //increment the index in ArrayList a
              // sorted.add(b.get(indexB));
              // indexB++;
              // i++;
            } //end of else if
          }//end of else
        }//end of for loop

        //Return the ArrayList sorted
        return sorted;
    }

  private ArrayList<Integer> fillForMerge(int size){
  	ArrayList<Integer> a = new ArrayList<Integer>();
  	int lastVal = r.nextInt(10);
  	for (int i = 0 ; i < size ; i=i+1){
  	    a.add(lastVal);
  	    lastVal = lastVal + r.nextInt(10);
  	}
	return a;

  }

  public void testMerge(){

  	ArrayList<Integer> a = new ArrayList<Integer>();
  	ArrayList<Integer> b = new ArrayList<Integer>();
  	a = fillForMerge(20);
  	b = fillForMerge(20);
  	System.out.println(a);
  	System.out.println(b);

    //Call merge method
    System.out.println(merge(a,b));

    }

}
