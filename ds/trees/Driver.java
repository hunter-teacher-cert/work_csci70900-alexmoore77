import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
	BSTree t = new BSTree();
  
  t.seed();

  
  for (int test=0;test<25;test++)

  {
  

  

//  t.search(searchValue);

try 
{
t.insert(test);

System.out.println("searchValue="+test+"   BSTree search: " +t.search(test));
}
catch (NullPointerException e){
System.out.println(test+" not in tree");
} ;
  };//for
  


int test=190;
t.insert(test);
try 
{
System.out.println("searchValue="+test+"   BSTree search: " +t.search(test));
}
catch (NullPointerException e){
System.out.println(test+" not in tree");
} ;

t.traverse();
t.deleteTraverse(5);

    }



}