//Created with Alex, Chris, and Benson
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
/*
  Node n;
	n = new Node();
	n.setData("Eduardo");
	Node n2 = new Node("Brian");
	n.setNext(n2);
	System.out.println(n);
	System.out.println(n2);
	System.out.println(n.getNext());
	n.getNext().setNext(new Node("Steph"));
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());
*/
	Node L;
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"
  L = new Node("a");

  Node L2 = new Node("b");
  L.setNext(L2);
  Node L3 = new Node("c");
  L2.setNext(L3);
  Node L4 = new Node("d");
  L3.setNext(L4);



  // 2. Write the code to insert an "x"
	//    between the b and the c
//  Node LX = new Node("x");
  
  Node x=new Node("x");
  x.setNext(L3);
  L2.setNext(L2);
  //System.out.println(L.printList());
  /*
  L2.setNext(new Node("x"));
  L2.getNext().setNext(L);
  String output = L.printList();
  System.out.println(output);
	*/
  // 3. Write the code to delete the c
x.setNext(L4);

	System.out.println("\n");
	System.out.println("Llist");
	System.out.println("-----------");

	Llist ll0Items = new Llist();
	Llist ll5Items=new Llist(L);
  System.out.println(ll0Items);
//System.out.println(ll5Items);

//check to see if list is empty;  want to see if method works

System.out.println(ll0Items);
System.out.println("Empty status of list ll0Items:" +ll0Items.isEmpty());

/*
System.out.println(ll5Items);
System.out.println("Empty status of list ll5Items:" +ll5Items.isEmpty());
*/

System.out.println("Count status of list ll0Items:" + ll0Items.length());
/*
System.out.println("Count status of list ll0Items:" + ll5Items.length());
  */
  }// main
}//end class