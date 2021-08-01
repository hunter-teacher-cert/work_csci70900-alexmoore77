//Created with Alex, Chris, and Benson
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"->"e"

	DLLNode L= new DLLNode("a");
  DLLNode L2 = new DLLNode("b");
  L.setNext(L2);
  DLLNode L3 = new DLLNode("c");
  L2.setNext(L3);
  DLLNode L4 = new DLLNode("d");
  L3.setNext(L4);
  DLLNode L5 = new DLLNode("e");
  L4.setNext(L5);

  //2. Write the code to insert an "x" between the b and the c
  
  DLLNode x=new DLLNode("x");
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
/*
x.setNext(L4);
*/
	System.out.println("\n");
	System.out.println("Llist");
	System.out.println("-----------");

	DLList ll0Items = new DLList();
	DLList ll5Items=new DLList(L);
/*
  System.out.println(ll0Items);
System.out.println(ll5Items);
*/
//check to see if list is empty;  want to see if method works

//System.out.println(ll0Items);
/*
System.out.println("Empty status of list ll0Items:" +ll0Items.isEmpty());
*/
/*
System.out.println(ll5Items);
*/
/*System.out.println("Empty status of list ll5Items:" +ll5Items.isEmpty());

System.out.println("Length of list ll0Items:" + ll0Items.length());
*/
/*
System.out.println("Count status of list ll0Items:" + ll5Items.length());
  */
/*
System.out.println("Length of list ll5Items:" + ll5Items.length());

System.out.println("Item 3 of list ll0Items:" + ll0Items.get(3));


System.out.println("Item 3 of list ll5Items:" + ll5Items.get(3));

//ll0Items.set(3,"-1");
ll5Items.set(3, "-1");

System.out.println("Update Item 3 of list ll0Items to -1:" + ll0Items.get(3)+"\n\n");


System.out.println("Update Item 3 of list ll5Items to -1:" + ll5Items.get(3)+"\n\n");
System.out.println("------------");
ll5Items.insert(3,"new data");
System.out.println("------------");
System.out.println("Added new data to list ll5Items:" );

System.out.println("------------");

*/
  }// main
}//end class