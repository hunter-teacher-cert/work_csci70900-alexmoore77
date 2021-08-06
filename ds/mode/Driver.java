
/*
Tiffany W.
Alex M.
Michele P

Last name: Moore
First name: Alexander
Github username: alexmoore77
Driver for Mode.  Tiffany had some great ideas for the data structure for this one that were aligned with the suggested solution!

*/


import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {
    Mode m = new Mode();

    System.out.println(m);
    //System.out.println("smallest value: " + m.findSmallestValue());

    int modeFound = m.calcMode();
    System.out.println("mode: " + modeFound);
    System.out.println("number of times mode appears: " + m.frequency(modeFound));


  }

}