/*
Last name: Moore
First name: Alexander
Github username: alexmoore77
TreeNode
*/

import java.io.*;
import java.util.*;

public class TreeNode{
    private Integer data;
    private TreeNode left,right;

    public TreeNode(){
	this.data=null;
	left = null;
	right = null;
    }

    public TreeNode(int data){
	this.data = data;
	left = null;
	right = null;
    }

    public void setData(int data){
	this.data = data;
    }

    public void setLeft(TreeNode left){
	this.left = left;
    }

    public void setRight(TreeNode right){
	this.right = right;
    }

    public Integer getData(){
	return data;
    }

    public TreeNode getLeft(){
	return left;
    }

    public TreeNode getRight(){
	return right;
    }

}