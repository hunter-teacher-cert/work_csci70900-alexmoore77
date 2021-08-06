/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
QueueNode:  This is similar but not identical to the Node for the LinkedList class.
*/

//This is the QueueNode class for the class Queue
public class QueueNode
{

//instance variables
private int data;
private QueueNode next;

//default constructor
public QueueNode()
{
this.data=0;
this.next=null;
}

//constructor with data argument
public QueueNode(int data)
{
this.data=data;
this.next=null;
}

//construcgtor with data and pointer
public QueueNode(int data, QueueNode next)
{
this.data=data;
this.next=next;

}

public void setData(int data)
{
this.data=data;
return;
}

public int getData()
{
return this.data;

}

public QueueNode getNext()
{
  return this.next;
}

public void setNext(QueueNode next)
{
this.next=next;
return;
}

//I had to cast the int as a string for the return value of the toString method.
public String toString()
{
if (this==null) return null;
else return Integer.toString(this.getData());

}

}//QueueNode