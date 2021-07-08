import java.io.*;
import java.util.*;
import java.lang.*;

public class Loops 
{
	
	//Chapter 7, Exercise 3
	/**
	iterativePower:  Takes double x and int n and returns x^n through iteration
	*/
	public static int iterativePower(double x, int n)
	{
	
	int returnValue=1;
	
	if (n!=0)
	{
	
		for (int counter=0;counter<n;counter++)
		{
			returnValue*=x;
		}//for
		if (n>0) return returnValue;
		else if (n<0) return 1/returnValue;
	}//else
	return returnValue; //This returns 1 if the power is 0
	}//iterativePower
	
	//Chapter 7, Exercise 4
	/**
	iterativeFactorial:  Returns factorial n through iteration
	*/
	public static int iterativeFactorial(int n)
	{
	
	int returnValue=n;

		for (int counter=n-1;counter>0;counter--)
		{
			
		returnValue*=counter;	
			
		};//while
	
	return returnValue;
	
	}//iterativeFactorial
	
	//Chapter 7, Exercise 5 - Part 1
	/**
	myExp:  Estimates e^x by adding the first n terms of the series
	*/
	public static int myExp (int x, int n)
	{
		
		int returnValue=1;

		for (int counter=1;counter<=n;counter++)
		{
			returnValue+=(x^counter)/iterativeFactorial(counter);
		};//for
		
		return returnValue;
		
	}//myExp
	
	//Chapter 7, Exercise 5 - Part 2
	/**
	myExp2:  Estimates e^x recursively. 
	*/
	public static int myExp2 (int x, int n)
	{

		if (n==0) return 1;
		
		else return myExp2(x*x,n-1);
		
		
	}//myExp2
	
//Chapter 7, Exercise 5 - Part 3
	/**
	check:  displays x, myexp(x), and Math.exp(x) 
	*/
	public static void check (int x, int n)
	{

		System.out.println(x+"\t"+myExp(x,n)+"\t"+Math.exp(x));
		
		
	}//myExp2	
	
//Chapter 7, Exercise 5 - Part 3 - overloaded for floats
	/**
	check:  displays x, myexp(x), and Math.exp(x) - accepts float x
	*/
	public static void check (float x, int n)
	{

		System.out.println(x+"\t"+myExp(x,n)+"\t"+Math.exp(x));
		
		
	}//myExp2	
	
	public static void main(String[] args)
	{
	System.out.println("Using iterativePower(), 5^3="+iterativePower(5,3));	
	System.out.println("Using iterativeFactorial(), 5!="+iterativeFactorial(5));
	System.out.println("Using myExp():  "+myExp(5, 8));
	System.out.println("Using myExp2(): "+myExp2(5,8));
	}//main
	
}//Loops