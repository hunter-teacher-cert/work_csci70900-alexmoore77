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
System.out.println("Now I deleteTraverse 5:");
t.deleteTraverse(5);
t.traverse();

System.out.println("Now I deleteTraverse 0:");
t.deleteTraverse(0);
t.traverse();

System.out.println("Now I deleteTraverse 4:");
t.deleteTraverse(4);
t.traverse();

System.out.println("Now I deleteTraverse 8:");
t.deleteTraverse(8);
t.traverse();

System.out.println("Now I deleteTraverse 13:");
t.deleteTraverse(13);
t.traverse();


System.out.println("Now I deleteTraverse 19:");
t.deleteTraverse(19);
t.traverse();


System.out.println("Now I deleteTraverse 20:");
t.deleteTraverse(20);
t.traverse();

System.out.println("Now I deleteTraverse 22:");
t.deleteTraverse(22);
t.traverse();

System.out.println("Now I deleteTraverse 24:");
t.deleteTraverse(24);
t.traverse();


System.out.println("Now I deleteTraverse 190:");
t.deleteTraverse(190);
t.traverse();



    }
}