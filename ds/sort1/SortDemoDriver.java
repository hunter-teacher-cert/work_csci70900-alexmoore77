/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
SortDemoDriver
*/
import java.io.*;
import java.util.*;

public class SortDemoDriver {
    public static void main(String[] args) {

  	SortDemo sd = new SortDemo();
  	/*
  	System.out.println(sd);
  	  SortDemo sd2 = new SortDemo(20);
  	System.out.println(sd2);

  	// part 2 test lines
  	int i;
  	i = sd.findSmallestIndex(0);
  	System.out.println("sd["+ i +"] = "+sd.get(i)+" : " + sd);
  	i = sd2.findSmallestIndex(0);
  	System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);

  	// part 3 test lines
  	System.out.println(sd);
  	  sd.sort();
  	  System.out.println(sd);
  	*/

    //print out sd
    System.out.println(sd);

    //Test out merge sort
    sd.msortTest();

    //Sorted sd
    System.out.println(sd);

    //Test out merging two ArrayLists
  	//sd.testMerge();

    }
}
