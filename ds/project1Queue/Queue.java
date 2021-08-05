

public class Queue{

//instance variables - one for the front of the queue, and the other for the end of the queue.
//note about instance variable names:  In my Queue class, I call the point of node entry with enquing the "front" of the queue and the point of node exit with dequing the "end" of the queue.
private QueueNode front;
private QueueNode end;

//constructor with no arguments
public Queue(){
this.front=null;
this.end=null;
}

//constructor with front argument
//note that with one node, the front and the end are the same node.
public Queue (QueueNode front){
this.front=front;
this.end=front;
}

//class methods

//add value to the end of the queue
public void enqueue(int value){
QueueNode newQueueNode=new QueueNode(value,front);

//not needed because the constructor does this
//newQueueNode.setNext();

front=newQueueNode;
if (end==null)
end=front;

//it is not necessary to update the end of the queue with an equeue.


return;
} 

//x = dequeue() <-- remove and return the value at the front of the queue
public QueueNode dequeue()
{

  QueueNode currentNode=null;
  QueueNode returnQueueNode=null;
  if (end==null) 
 return null;

else if (front==end)
{
returnQueueNode=new QueueNode(end.getData(), end.getNext());
front=end=null;
return returnQueueNode;

}
else 
{
  //We traverse the queue.  With each node, we check to see if the next node is the last node.  If it is, we update the pointer to null
returnQueueNode=new QueueNode(end.getData(), end.getNext());

//Have currentNode point at the first QueueNode in the Queue.
//The problem is that this is only updating the pointer in the currentNode 


//
currentNode=front;
while(currentNode.getNext()!=end)
currentNode=currentNode.getNext();
//end=end.getNext();
};
currentNode.setNext(null);
return returnQueueNode;
}

//x = front() <-- return but don't remove the value at the front

public QueueNode front()
{
return end;
}

//isEmpty() <-- returns true if the queue is empty
public boolean isEmpty()
{
return (front==null);
}


//size() <-- returns the number of items in the queue
public int size()
{
int numberOfNodes=0;
QueueNode current=front;

while (current!=null)
{
  numberOfNodes++;
current=current.getNext();
}
return numberOfNodes;
}

public String toString()
{
//If the queue is empty, return null.
if (this.isEmpty() )
return null;

String returnString="";
//Create a temporary QueueNode to traverse the Queue until it reaches the end
QueueNode current=front;

while (current!=null) 
{
returnString+=current.toString();
returnString+="->";
current=current.getNext();
}
;
//Note that getNext() is necessary to add the final null
//System.out.println(current);

//I feel like there must be a way to print the terminating null as part of the loop without printing it as a constant especially because I made a toString() method for QueueNode that can handle the exception.
if (current==null)
returnString+="null";

return returnString;

}

public QueueNode getFront(){
  return front;
}

public QueueNode getEnd(){
  return end;
}

}//Queue