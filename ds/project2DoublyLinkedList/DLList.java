/******************************************
Doubly Linked List
By Alexander Moore
For Hunter College Summer 2021
Description:  Doubly Linked List Class - similar to Linked List class but with addition of the previous instance variable to the DLLNode class that allows for greater functionality in DLList methods.
Accomplishments:  It was extremely difficult to code the pointers so that they behaved as desired.  I ended up creating a user interface as part of the testing process that I left in the program.   
******************************************/
import java.io.*;
import java.util.*;


public class DLList{
    private DLLNode front; // the front of the list

    public  DLList(){
	front = null;
    }
      //creating a new constructor so you can pass an argument the name of a node that already exists; 
    public DLList(DLLNode myFirstNode)
    {
front=myFirstNode;

    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
	DLLNode newNode = new DLLNode(data);
	// point it to what front points to
	newNode.setNext(front);
	// point front to the new node
	front = newNode;
    }

    public String toString(){
	DLLNode currentNode;
	currentNode = front;
	String result = "";
	while (currentNode != null){
	    result = result + currentNode + "<->";
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
  //create a temp node to point to and 
  //access the other nodes
  DLLNode currentNode=new DLLNode("",front); //constructor; makes a new temp node

//Loop until the last node (end of list) is reached

/*System.out.println("Debugging:  currentNode.getNext() is "+ currentNode.getNext());
*/
  while (currentNode.getNext() != null){
	    numberOfNodes=numberOfNodes+1;
	
  //Most important idiom
      currentNode = currentNode.getNext();
	
  };//while

  //updated - was 0
  return numberOfNodes;
    }

    // returns the item at location index;
    // returns null if there aren't enough
    // items. Starts with index 0
    //null counts as an acceptable string
    public String get(int index){

	int currentIndex=0; 
  //3 types of node contructors
  DLLNode currentNode=new DLLNode("",front); //constructor; makes a new temp node

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
  DLLNode currentNode=new DLLNode("",front); //constructor; makes a new temp node

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
  /*
    public void insert(int index, String value){

  DLLNode currentNode=new DLLNode("",front);
  
   //constructor; keeps track of current node
  int currentIndex=0;
   
if (front==null){
    DLLNode newDLLNode=new DLLNode(value,currentNode.getPrevious(), currentNode);
front=newDLLNode;
return;
};

if (index>(this.length()+1)) //if index is greater than length of list-->error
{
System.out.println( "Error- Linked list length of "+this.length()+" is shorter than your index of "+index);
return;
};
/*
System.out.println("currentNode previous:"+currentNode.getPrevious());
System.out.println("currentNode data:"+currentNode.getData());
System.out.println("currentNode next:"+currentNode.getNext());


// 1) new node must point to the node after the index
while (currentIndex <(index)){
	/*    
      //Debugging
      System.out.println("Iteration#"+currentIndex+": currentNode.previous="+currentNode.getPrevious()+"\ncurrentNode.data="+currentNode.getData()+"\ncurrentNode.next="+currentNode.getNext());
     
      currentIndex=currentIndex+1;
  
	    currentNode = currentNode.getNext();
/*
       System.out.println("Iteration#"+currentIndex+": post-assignment--currentNode.previous="+currentNode.getPrevious()+"\ncurrentNode.data="+currentNode.getData()+"\ncurrentNode.next="+currentNode.getNext());
	
  };

  //point currentNode to the node AFTER the index.
  //now we make a DLL node that has the correct previous and next pointers
  DLLNode newDLLNode=new DLLNode(value,currentNode.getPrevious(), currentNode);

  //HOWEVER, it is still not pointed to by the previous node 
  currentNode.getPrevious().setNext(currentNode);

  //AND it must also be pointed to by the next node
  currentNode.setPrevious(currentNode.getPrevious().getNext());


  //currentNode.setNext(currentNode.getNext());
  //currentNode.setPrevious(currentNode.getPrevious());
 // currentNode.getPrevious().setNext(currentNode);
//Now the new node is pointing to one before the index.

//look at pointer, what is the address, set pointer in the new node to the next node (index specified/user provides)
//currentNode.setNext(currentNode);
//currentNode.getPrevious().setNext(currentNode);

//System.out.println(this);
/*
System.out.println("New node="+currentNode);
System.out.println("Next node="+currentNode.getNext());
System.out.println("Previous node="+currentNode.getNext().getPrevious().getPrevious());

    }
*/

// insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.
    public void insert(int index, String value){

	DLLNode current=front;
	int count = 0;

	// This piggybacks the pointers - prev follows
	// current 
  //NOTE:  Since this is a doubly linked list, the piggybacked pointer is no longer needed
	//System.out.println(">>Current="+current+"\n>>count="+count);
  
  while (current != null && count != index){
	    current = current.getNext();
	    count = count + 1;
	}

	// at this point, current points to the insertion location (or
	// null) and prev to the node ahead of it (or null in case
	// insertion isat the beginning.

	
	// we can only insert if index is in range
	if (current==null){
	    return;
	}

	// create the new node and set its next to the current node
	// where we're inserting.
	DLLNode newNode=new DLLNode(value);
	newNode.setNext(current.getNext());	
	// this handles the special case.
	// if prev isn't null we're at some interior node so we
	// can just insert it.
	if(current.getPrevious()!=null){
    //We still have to update setPrevious on newNode!!
	    current.setNext(newNode);
      //now time to set the new node's previous pointer
      current.
      //prev.setNext(newNode);
	} else{
	    // if prev was null we're inserting at the front
	    // which is a special case and we have to make front
	    // point to (refer to) the new node.
	    front = newNode;
	}
    }


    // returns the index of the first item with
    // data value key. Returns -1 if not found
    public int search(String key){
int currentIndex=0;
  DLLNode currentNode=new DLLNode("",front); //constructor; keeps 

while (currentNode!=null){
	    if (currentNode.getData()==key)
      return currentIndex;
      currentIndex++;	
      currentNode=currentNode.getNext();    
	};

	return -1;
    }

    // removes the node at index.
    // does nothing if index out of bounds
    public void remove(int index){

  DLLNode currentNode=new DLLNode("",this.front); //constructor; keeps track of current node
  int currentIndex=0;
   
if (index>(this.length()+1)) //if index is greater than length of list-->error
{
System.out.println( "Error- Linked list length of "+this.length()+" is shorter than your index of "+index);
return;
};


// 1) new node must point to the node after the index
while (currentIndex <(index-1)){
	    currentIndex=currentIndex+1;
      //currentNode.setPrevious(currentNode);
	    currentNode = currentNode.getNext();
	};
//Now the new node is pointing to one before the index.

//look at pointer, what is the address, set pointer in the new node to the next node (index specified/user provides)
currentNode.setNext(currentNode.getNext());
currentNode.getNext().setPrevious(currentNode);
//currentNode.getPrevious().setNext(currentNode);

System.out.println(this);

System.out.println("New node="+currentNode);
System.out.println("Next node="+currentNode.getNext());
System.out.println("Previous node="+currentNode.getNext().getPrevious().getPrevious());
    }
}
