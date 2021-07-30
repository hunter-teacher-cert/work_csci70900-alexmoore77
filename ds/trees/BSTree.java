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

//recursively traverse the left subtree
deleteTraverse(key, current.getLeft(), current);

//process the current node
System.out.println("Current Node:"+current.getData());
if (current.getData()==key)
{
  System.out.println("I found the node to delete: "+current.getData());
  if (current.getLeft()==null) 
  System.out.println("The left child of this node is "+current.getLeft());
else System.out.println("The left child of this node is "+current.getLeft().getData());
if (current.getRight()==null)
System.out.println("The right child of this node is "+current.getRight());
else   System.out.println("The right child of this node is "+current.getRight().getData());
System.out.println("The value of the previous node is "+previous.getData());

//identify the number of children of the current node
int numberOfTotalChildren=0;
int numberOfLeftChildren=0;
int numberOfRightChildren=0;
if ((current.getLeft())!=null) 
{
  numberOfTotalChildren++;
numberOfLeftChildren++;
};
if ((current.getRight())!=null) 
{
  numberOfTotalChildren++;
  numberOfRightChildren++;
};

//debugging info
System.out.println("Current node "+current.getData()+" has "+numberOfTotalChildren+" children!");
System.out.println("Current node "+current.getData()+" has "+numberOfLeftChildren+" left children!");
System.out.println("Current node "+current.getData()+" has "+numberOfRightChildren+" right children!");

/*
Delete Scenario #1:  0 children
Check the previous node.  
-If the previous node's left child is equal to the current, set the left child to null.  
-If the previous node's right child is equal to the current, set the right child to null.
*/
if (numberOfTotalChildren==0)
{
this.deleteNoChildren(key, current, previous);
}//if (numberOfTotalChildren==0)

/*Delete Scenario #2:  1 child
Check the previous node.  
-If the previous node's left child is equal to the current, set the previous node's left child to the deleted node's child.  
-If the previous node's right child is equal to the current, set the previous node's right child to the deleted node's child.
*/
else if (numberOfTotalChildren==1)
{

this.deleteOneChild(key, current, previous);

}//else if numberOfTotalChildren==1

/*Delete Scenario #3:  2 children
Check the previous node.  
-If the previous node's left child is equal to the current, set the previous node's left child to the deleted node's child.  
-If the previous node's right child is equal to the current, set the previous node's right child to the deleted node's child.
*/

else if (numberOfTotalChildren==2)
{
this.returnGreatestLeftAndParent (key, current, previous);

}

}
else System.out.println(current.getData() + " is not the node to delete.");

//recursively print out the right subtree
deleteTraverse(key, current.getRight(), current);

}

//delete a TreeNode if it has no children.
private void deleteNoChildren (int key, TreeNode current, TreeNode previous)
{
System.out.println(current.getData()+ " has been deleted!");
if (previous.getRight().getData()==current.getData())
{
previous.setRight(null);
System.out.println("Now the right child of "+previous.getData()+ " is null!");
}//if
else if (previous.getLeft().getData()==current.getData())
{
previous.setLeft(null);
System.out.println("Now the left child of "+previous.getData()+ " is null!");
}//if

}

//Delete a TreeNode if it has one child.
private void deleteOneChild (int key, TreeNode current, TreeNode previous)
{
System.out.println(current.getData()+ " has been deleted!");
if (previous.getRight().getData()==current.getData() && current.getRight()!=null)
{
previous.setRight(current.getRight());
System.out.println("Now the right child of "+previous.getData()+ " is "+previous.getRight().getData()+"!");
}//if

else if (previous.getRight().getData()==current.getData() && current.getLeft()!=null)
{
previous.setRight(current.getLeft());
System.out.println("Now the right child of "+previous.getData()+ " is "+previous.getRight().getData()+"!");

}//else if

else if (previous.getLeft().getData()==current.getData() && current.getLeft()!=null)
{
previous.setLeft(current.getLeft());
System.out.println("Now the left child of "+previous.getData()+ " is "+previous.getLeft().getData()+"!");

}//else if

else if (previous.getLeft().getData()==current.getData() && current.getRight()!=null)
{
previous.setLeft(current.getRight());
System.out.println("Now the left child of "+previous.getData()+ " is "+previous.getLeft().getData()+"!");

}//else if

}//method


//Identify the greatest to the left (left and all the way to the right) to replace the node
private TreeNode returnGreatestLeftAndParent (int key, TreeNode current, TreeNode previous)
{
int oldData=current.getData();
previous=current;
current=current.getLeft();

while(current.getRight()!=null)
{
previous=current;
current=current.getRight();

}//while

System.out.println("I found the node to replace it with: "+  current.getData());
if (current.getLeft()==null)
System.out.println("The value of the left child is "+current.getLeft());

else System.out.println("The value of the left child is "+current.getLeft().getData());

if (current.getRight()==null)
System.out.println("The value of the right child is "+current.getRight());

else System.out.println("The value of the right  child is "+current.getRight().getData());

System.out.println("The value of the previous node is "+previous.getData());

System.out.println("This node has not yet been deleted or copied.");
//get a pointer to the node to be deleted and copied

int newData=current.getData();


current.deleteTraverse(key, current.getLeft(), current);

current.searchAndReplace(oldData,newData);

//return the node to be copied
return current;

}//method







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


//Search for the key (old node value), and replace it with the new node value.
  public void searchAndReplace(int oldNodeValue, int newNodeValue)

    {


TreeNode current=root;

while (current!=null)
{

if (current.getData()==oldNodeValue)

{
current.set(newNodeValue);
return;
}//if
else if (oldNodeValue>current.getData())
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