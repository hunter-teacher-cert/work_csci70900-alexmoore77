/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
Driver - Day[5]
alexmoore77
created collaboratively by Alex Moore, Emma Wingreen, and Stephannia Kabanakis
*/
import java.io.*;
import java.util.*;
public class Driver {
  public static void main(String[] args) {
    //declare a var of appropriate type to assign an instance of Time to t
    //"t is an object of type Time" "blueprint per se"
    Time t;
    //assign var the address of a newly-apportioned Time object
    // it is pulling from the Time class with the default values (lines 15-19)
    t = new Time(); //"new" signals creation of a new object of type Time
    // new object with the specified values
    Time s;
    // This initializes the new Time object that is pulling from the Time class
    // invoking the constructor using specified values (lines 27-29)
    // contructors are special types of methods that are created within the class to help create the objects.
    s = new Time(02,07,54.0);
    // assign a Time var the value null
    Time u = null;
    // assign a Time var the value of an existing Time var
    Time v = s;
    //Print all of the above
    //System.out.println(t.toString()); //prints the address of t
    //s.printTime(s); //print using method printTime
    System.out.print(s.toString()); //print using method toString
    System.out.print(t.toString()); //print using method toString
    //Test out equals method
    //System.out.println(t.equals(u)); //check that 0:0:0 doesn't equal null
    System.out.println(v.equals(s)); //check that v = s
    System.out.println(t.equals(s)); //check that t != s
    //Invoke the add instance method
    Time startTime = new Time(18, 50, 0.0);
    Time runningTime = new Time(2, 16, 0.0);
    Time endTime = Time.add(startTime, runningTime);
  System.out.print(endTime.toString());
  }//end main()
}//end class
