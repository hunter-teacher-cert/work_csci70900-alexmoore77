/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
Driver for Mode.  Tiffany had some great ideas for the data structure for this one that were aligned with the suggested solution!
DLLNode
*/
//Created by Alex Moore
import java.io.*;
import java.util.*;

public class DLLNode {

    private String data;
    private DLLNode next;
    private DLLNode previous;

    public DLLNode() {
    	data = "";
    	next = null;
      previous=null;
    }//default constructor

    public DLLNode(String value) {
    	data = value;
    	next = null;
      previous=null;

    }//constructor(value)

    public DLLNode(String value, DLLNode next) {
    	data = value;
    	this.next = next;
      previous=null;

    }//constructor(value, next)


    public DLLNode(String value, DLLNode previous, DLLNode next) {
    	data = value;
    	this.next = next;
      this.previous=previous;

    }//constructor(value, next)


public DLLNode(String value, DLLNode next, String message)
{
data=value;
this.next=next;
System.out.println(message);

}

public DLLNode(String value, DLLNode next, DLLNode previous, String message)
{
data=value;
this.next=next;
this.previous=previous;
System.out.println(message);

}


    public void setData(String value) {
    	data = value;
    }//setData

    public void setNext(DLLNode n) {
    	next = n;
    }//setNext

    public void setPrevious(DLLNode n) {
    	previous = n;
    }//setNext

    public String getData() {
    	return data;
    }//end getValue

    public DLLNode getNext() {
    	return next;
    }//getNext

    public DLLNode getPrevious() {
    	return previous;
    }//getNext

    public String toString() {
    	return data;
    }//toString

    public String printList(){
      DLLNode currentVar = this;
      String output ="";
      do {
        output += currentVar.toString();
        currentVar = currentVar.getNext();
      }while (currentVar != null);
      return output;
    }//printList

}//class DLLNode