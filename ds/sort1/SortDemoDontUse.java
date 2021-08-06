/*
Another version of SortDemo, kept but not used here.  Please disregard.

*/

//Created with Alex Moore, Liam, JiYoon, Emma, Steph, and Eric

import java.io.*;
import java.util.*;

//CLASS name
public class SortDemo{

  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data

  private Random r;

//CONSTRUCTOR with no arguments
  public SortDemo(){
  	data = new ArrayList<Integer>();
  	r = new Random();
  	for (int i=0;i<15;i++){
  	    data.add(r.nextInt(20));
  	}
  }

//CONSTRUCTOR with size argument
  public SortDemo(int size){
  	data = new ArrayList<Integer>();
  	r = new Random();
  	for (int i=0;i<size;i++){
  	    data.add(r.nextInt(20));
  	}
  }

//METHOD get:  return the value at index 
  public int get(int index){
	   return this.data.get(index);
  }

//METHOD findSmallestIndex:  return index of smallest value from a starting point passed as an argument
  public int findSmallestIndex(int start){

	//EXPLANATION start a variable at the one after start.  loop from that variable to end and update smallIndex as needed
	   int smallIndex = start;
  	int i;
  	for (i = smallIndex + 1; i < this.data.size(); i++){
      if (this.data.get(i) < this.data.get(smallIndex)){
  		      smallIndex = i;
  	   }
  	}
	 return smallIndex;
  }


  public void sort(){
  	int i;
  	int smallIndex;
  	int tmp;
  	for (i=0;i < data.size()-1; i++){
  	    smallIndex = findSmallestIndex(i);
  	    tmp = data.get(smallIndex);
  	    data.set(smallIndex,data.get(i));
  	    data.set(i,tmp);
  	}
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){


	     return 0; // replace this return
	   }

	/* If you finish the lab early you can get started on this */
	public int binarySearch(int value){
	    return 0;

	}


    public String toString(){
	return ""+data;
    };

    /*------------------------- MERGESORT STUFF -----------------*/


    // Preconditions: a and b are ArrayLists of Integers and
    //                both are in increasing order
    // Return: a new ArrayList of Integers that is the result
    //         of merging a and b. The new ArrayList
    //         should be in increasing order
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

    /*
      Parameters: l - an ArrayList

      Returns: a new, sorted ArrayList
      This routine should implement the mergesort algorithm.
    */
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
