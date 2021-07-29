import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

   //constructor
    public BSTree(){
	root = null;
    }

//set initial values
    public void seed(){
	TreeNode t;
	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);
t=new TreeNode(8);
	root.getLeft().setRight(t);
	t = new TreeNode(15);
	root.getRight().setLeft(t);
	t = new TreeNode(22);
	root.getRight().setRight(t);
	}

//recursively traverse in order    
private void inOrderTraverse (TreeNode current)
{
if (current==null)
return;
//recursively print out the left subtree
inOrderTraverse(current.getLeft());
//process the current node
System.out.print(current.getData()+", ");
//recursively print out the right subtree
inOrderTraverse(current.getRight());
}

//recursively traverse with preorder
private void preOrderTraverse (TreeNode current)
{
if (current==null)
return;
//process the current node
System.out.print(current.getData()+", ");
//recursively print out the left subtree
preOrderTraverse(current.getLeft());
//recursively print out the right subtree
preOrderTraverse(current.getRight());
}

//recursively traverse with postorder
private void postOrderTraverse (TreeNode current)
{
if (current==null)
return;
//recursively print out the left subtree
postOrderTraverse(current.getLeft());
//recursively print out the right subtree
postOrderTraverse(current.getRight());
//process the current node
System.out.print(current.getData()+", ");
}

//recursively traverse with inOrderTraverse logic
//if current==key, print information about current TreeNode:
//parent, child values, # of children
private void deleteTraverse (int key, TreeNode current, TreeNode previous)
{

if (current==null)
return;

//recursively print out the left subtree
deleteTraverse(key, current.getLeft(), current);

//process the current node
System.out.println("Current Node:"+current.getData());
if (current.getData()==key)
{
  System.out.println("I found the node to delete: "+current.getData());
  System.out.println("The left child of this node is "+current.getLeft().getData());
  System.out.println("The right child of this node is "+current.getRight().getData());
System.out.println("The value of the previous node is "+previous.getData());

//identify the number of children of the current node
int numberOfTotalChildren=0;
int numberOfLeftChildren=0;
int numberOfRightChildren=0;
if ((current.getLeft().getData())!=null) 
{
  numberOfTotalChildren++;
numberOfLeftChildren++;
};
if ((current.getRight().getData())!=null) 
{
  numberOfTotalChildren++;
  numberOfRightChildren++;
};
if (numberOfTotalChildren==0)
{

};


System.out.println("Current node "+current.getData()+" has "+numberOfTotalChildren+" children!");
System.out.println("Current node "+current.getData()+" has "+numberOfLeftChildren+" left children!");
System.out.println("Current node "+current.getData()+" has "+numberOfRightChildren+" right children!");


/*
  if (current.getLeft()==null) 
  System.out.println(current.getLeft() + " is equal to null.");
  else if (current.getLeft()!=null)
  System.out.println(current.getLeft() + " is not equal to null.");
else System.out.println("Error re: getLeft()!");  

  if (current.getRight()==null) 
  System.out.println(current.getRight() + " is equal to null.");
  else if (current.getRight()!=null)
  System.out.println(current.getRight() + " is not equal to null.");
else System.out.println("Error re: getLeft()!");  
*/

}
else System.out.println(current.getData() + " is not the node to delete.");

//recursively print out the right subtree
deleteTraverse(key, current.getRight(), current);

}

public void traverse(){
  inOrderTraverse(root);
  System.out.println();
}

public void deleteTraverse(int key)
{
deleteTraverse(key,root,null);
System.out.println();

}






      public void insert(int key){

	TreeNode newNode = new TreeNode(key);

	// if the tree is empty
	// manually insert the new node as the root
	if (root==null){
	    root = newNode;
	    return;
	}
	
	TreeNode front = root;
	TreeNode trailer = null;
	
	while (front != null){
	    int frontValue = front.getData();
	    if (frontValue == key){
		// if we're here, it means the key is
		// already in the tree so we can
		// update this node in some way
		// and then return
		System.out.println("It's a match!");
    return;
	    } else if (frontValue < key){
		System.out.println("frontValue<key");
    trailer = front;
		front = front.getRight();
    		
	    } else {
        System.out.println("frontValue>key");
		trailer = front;
		front = front.getLeft();
	    }
	}
	if (key > trailer.getData()){
	    // insert on the right
	    trailer.setRight(newNode);
      return;
	} else {
	    // insert on left
	    trailer.setLeft(newNode);
return;
	}
	
	

    }


        public int search(int key)

    {


TreeNode current=root;

while (current!=null)
{

if (current.getData()==key)

{
return key;
}//if
else if (key>current.getData())
{
System.out.println("getRight");
current=current.getRight();

} //else if
else
{
System.out.println("getLeft");

current=current.getLeft();
}//else
};//while


       throw new NullPointerException();
    }



}