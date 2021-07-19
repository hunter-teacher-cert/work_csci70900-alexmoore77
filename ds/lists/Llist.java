//Alex, Michelle, and Michelle
import java.io.*;
import java.util.*;


public class Llist{
    private Node front; // the front of the list

    public  Llist(){
	front = null;
    }
      //creating a new constructor so you can pass an argument the name of a node that already exists; 
    public Llist(Node myFirstNode)
    {
front=myFirstNode;

    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
	Node newNode = new Node(data);
	// point it to what front points to
	newNode.setNext(front);
	// point front to the new node
	front = newNode;
    }

    public String toString(){
	Node currentNode;
	currentNode = front;
	String result = "";
	while (currentNode != null){
	    result = result + currentNode + "->";
	    // this is like i=i+1 is for arrays
	    // but for linked lists
	    currentNode = currentNode.getNext();
	}
	result = result + "null";
	return result;

    }

    // returns True if there is nothing in the list
    // False otherwise
    //if list is pointing to null it's isEmpty
    //data - next
    public boolean isEmpty(){
      if (front==null)
      return true;
      else return false;
    }

    // returns the number of items in the list
    // Hint: look at the toString
    // to remind you how to traverse down the list
    public int length(){
      //counter variable to count the number of nodes in the linked list
	int numberOfNodes=0; 
  //3 types of node contructors
  //create a temp node to point to and //access the other nodes
  Node currentNode=new Node("",front); //constructor; makes a new temp node

//Loop until the last node (end of list) is reached
  while (currentNode != null){
	    numberOfNodes=numberOfNodes+1;
	
  //Most important idiom
      currentNode = currentNode.getNext();
	
  }
  
  //updated - was 0
  return numberOfNodes-1;
    }

    // returns the item at location index;
    // returns null if there aren't enough
    // items. Starts with index 0
    //null counts as an acceptable string
    public String get(int index){

	int currentIndex=0; 
  //3 types of node contructors
  Node currentNode=new Node("",front); //constructor; makes a new temp node

if (index>this.length()) //if index is greater than length of list-->error
return "Error- Linked list length of "+this.length()+" is shorter than your index of "+index;
while (currentIndex <index){
	    currentIndex=currentIndex+1;
	    currentNode = currentNode.getNext();
	};

return currentNode.getData();
    }

    // sets the item at location index (starting
    // with 0) to value.
    // only sets if the index is within range
    public void set(int index, String value){

	int currentIndex=0; 
  //3 types of node contructors
  Node currentNode=new Node("",front); //constructor; makes a new temp node

System.out.println("The index is "+index+", and the length is "+this.length());

if (index>this.length()) //if index is greater than length of list-->error
{
System.out.println( "Error- Linked list length of "+this.length()+" is shorter than your index of "+index);
return;
};
while (currentIndex <index){
	    currentIndex=currentIndex+1;
	    currentNode = currentNode.getNext();
	};


currentNode.setData(value);

    }

    // insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.
    public void insert(int index, String value){

  Node currentNode=new Node("",front); //constructor; keeps track of current node
  Node previousNode=new Node("",front);
  int currentIndex=0;
   
if (index>(this.length()+1)) //if index is greater than length of list-->error
{
System.out.println( "Error- Linked list length of "+this.length()+" is shorter than your index of "+index);
return;
};


// 1) new node must point to the node after the index
while (currentIndex <(index)){
	    currentIndex=currentIndex+1;
	    currentNode = currentNode.getNext();
	};
//Now the new node is pointing to one before the index.

//look at pointer, what is the address, set pointer in the new node to the next node (index specified/user provides)
currentNode.setNext(currentNode.getNext());

currentIndex=0;
// 2) node before the index must point to the new node.
while (currentIndex <(index-1)){
	    currentIndex=currentIndex+1;
	    previousNode = previousNode.getNext();
	};

previousNode.next=currentNode;

    }

    // returns the index of the first item with
    // data value key. Returns -1 if not found
    public int search(String key){
int currentIndex=0;
  Node currentNode=new Node("",front); //constructor; keeps 

while (Node!=null){
	    if (currentNode.getData()==key)
      return currentIndex;
      currentIndex=currentIndex+1;	    
	};

	return -1;
    }

    // removes the node at index.
    // does nothing if index out of bounds
    public void remove(int index){



    }


}
