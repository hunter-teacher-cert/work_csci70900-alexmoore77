/*

Last name: Moore
First name: Alexander
Github username: alexmoore77
Driver for DLList
*/
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
  L2.setPrevious(L1);
  DLLNode L4 = new DLLNode("d");
  L3.setNext(L4);
  L3.setPrevious(L2);
  DLLNode L5 = new DLLNode("e");
  L4.setNext(L5);
  L4.setPrevious(L3);
/*
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

ll0Items.set(3,"-1");

System.out.println("Update Item 3 of list ll0Items to new data:" + ll0Items+"\n\n");

ll5Items.set(3,"new data");

System.out.println("Update Item 3 of list ll5Items to new data:" + ll5Items+"\n\n");
System.out.println("------------");
ll5Items.insert(3,"new data");
System.out.println("------------");
System.out.println("Added new data to list ll5Items:" );

System.out.println("------------");
System.out.println(d1);
System.out.println("------------");

System.out.println("Removed " + ll5Items.get(2)+ " from list ll5Items:" );
ll5Items.remove(2);
System.out.println("------------");
System.out.println(ll5Items);
System.out.println("------------");
*/
DLList userDLL=new DLList(L1);

  System.out.println("*********************************");
  System.out.println("          Doubly Linked List");
  System.out.println("          By Alex Moore");
  System.out.println("          Summer 2021");
  System.out.println("*********************************\n\n");

//System.out.println(">>Current List:\n"+userDLL);  
int choice=-1;

while (choice!=0)
{

System.out.println(">>Select a command:\n1)userDLL.length()\n2)userDLL.isEmpty()\n3)search(\"Hello\")\n4)userDLL.toString()\n5)userDLL.insert(\"Hello\", 1)\n6)userDLL.delete(1)\n0)END PROGRAM"); 
 
  Scanner myInput = new Scanner(System.in);
 // Scanner myInput2=new Scanner(System.in);

  //what user types in is assigned to user
  //int choice=myInput.nextInt();
  //int choice2=2;



choice=myInput.nextInt();

switch (choice)
{
case 1: 
System.out.print("Output>> "+userDLL.length()+"\n");
break;
case 2:  System.out.print("Output>> "+userDLL.isEmpty()+"\n");
break;
case 3:  System.out.print("Output>> "+userDLL.search("Hello")+"\n");
break;
case 4:  System.out.print("Output>> "+userDLL.toString()+"\n");
break;
case 5:  System.out.print("Output>> [void]\n");userDLL.insert(1, "Hello");
break;
case 6:  System.out.print("Output>> [null - void method]\n");
userDLL.remove(1);
break;
case 0:
break;
default:  System.out.println("Please select an option from the menu.");
break;

};//switch

System.out.println("List after command: "+userDLL+"\n\n\n");
/*
System.out.println("Hit enter to continue.");
String s=myInput.next;
*/
}//while


/*
Scanner hitEnter = new Scanner(System.in);

int hitAKey=hitEnter.nextInt();
*/

  }// main
}//end class