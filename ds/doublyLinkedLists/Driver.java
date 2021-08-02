//Created by Alex Moore
import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	// 1.Create a new  list that looks like:
	//   L->"a"->"b"->"c"->"d"->"e"

	DLLNode L1= new DLLNode("a");
  DLLNode L2 = new DLLNode("b");
  L1.setNext(L2);
  DLLNode L3 = new DLLNode("c");
  L2.setNext(L3);
  DLLNode L4 = new DLLNode("d");
  L3.setNext(L4);
  DLLNode L5 = new DLLNode("e");
  L4.setNext(L5);

  //2. Write the code to insert an "x" between the b and the c

System.out.println("DLLNode a="+L1);
System.out.println("DLLNode b="+L2);
System.out.println("DLLNode c="+L3);
System.out.println("DLLNode d="+L4);
System.out.println("DLLNode e="+L5);

//Create a new doubly linked list pointing to node L as the head
DLList d1=new DLList(L1);

System.out.println(d1);

//System.out.println(DLLList)

  DLLNode x=new DLLNode("x");
  x.setNext(L3);
  L2.setNext(x);

System.out.println("Now we have added x!");System.out.println(d1);

  //System.out.println(L.printList());
  
  
  
  // 3. Write the code to delete the c

x.setNext(L4);
	System.out.println("\n");


	DLList ll0Items = new DLList();
	DLList ll5Items=new DLList(L1);



  System.out.println("ll0Items:"+ll0Items);
System.out.println("ll5Items:" + ll5Items);

//check to see if list is empty;  want to see if method works



System.out.println("Empty status of list ll0Items:" +ll0Items.isEmpty());


System.out.println("Empty status of list ll5Items:" +ll5Items.isEmpty());

System.out.println("Length of list ll0Items:" + ll0Items.length());
System.out.println("Length of list ll0Items:" + ll5Items.length());
  
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
System.out.println(d1);

  }// main
}//end class