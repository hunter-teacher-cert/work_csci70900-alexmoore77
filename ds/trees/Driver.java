import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
	BSTree t = new BSTree();
  
  for (int test=0;test<25;test++)

  {
  
  t.seed();
  

//  t.search(searchValue);

try 
{
System.out.println("searchValue="+test+"   BSTree search: " +t.search(test));
}
catch (NullPointerException e){
System.out.println(test+" not in tree");
} ;
  };//for

  //System.out.println("test");
  System.out.println("Search for 13:" + t.search(13));
  System.out.println("Insert 13:");
  t.insert(13);
    System.out.println("Search for 13:" + t.search(13));


    }
}