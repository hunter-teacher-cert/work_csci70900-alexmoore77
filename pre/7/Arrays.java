import java.io.*;
import java.util.*;

public class Arrays
{
	
	//Chapter 8, Exercise 1	- Part 1
/**
powArray1:  Returns an array consisting of the elements of a squared
*/
	public static double [] powArray1 (double [] a)
	{
		
		for (int i = 0; i < a.length; i++) {
		a[i] = Math.pow(a[i], 2.0);
		};//for
		
		return a;
		
	}//powArray1
	
		//Chapter 8, Exercise 1	- Part 2
/**
powArray2:  Returns an array consisting of the elements of a squared
*/
	public static double [] powArray2 (double [] a, double power)
	{
		
		for (int i = 0; i < a.length; i++) {
		a[i] = Math.pow(a[i], power);
		};//for
		
		return a;
		
	}//powArray2
	
	/**
indexOfMax:  Returns the index of the largest element
This method cannot be written with an enhanced for loop because the enhanced for loop does not retain the index variable.
*/
	public static int indexOfMax (double [] a)
	{
		double largest=a[0];
		int indexOfLargest=0;
		
		for (int i = 0; i < a.length; i++) {
		if (a[i]>largest) 
		{
			largest=a[i];
			indexOfLargest=i;
		};
		
		};//for
		
		return indexOfLargest;
		
	}//powArray2
	
	public static Boolean[] sieve (int n)
	{
		//initialize as true (prime) except 0
		Boolean [] returnValue=new Boolean[n];
		returnValue[0]=false;
		returnValue[1]=true;
		for (int counter=2;counter<n;counter++)
		{
			returnValue[counter]=true;
		};//for

		//run through numbers <=n.  
		for (int counter=2;counter<n;counter++)
		{
			
			//For each that is prime, mark as false all multiples <=n.
			
			if (returnValue[counter]==true)
			{
			for (int counter2=counter+counter;counter2<n;counter2+=counter)
			{
			returnValue[counter2]=false;
			};//for
			};//if
		
		};//for
		
	return returnValue;
	}//sieve
	
	public static void main (String[] args)
	{
		
		//Declare and initialize the array.
		double[] a=new double[10];
		double[] b=new double[10];
		int primeMax=30;
		Boolean[] primeCheck=new Boolean[primeMax];
		
		for (int i = 0; i < 10; i++) {
		a[i] = i;
		};//for
		
		b=powArray2(a, 3.0);
		
		for (int i = 0; i < 10; i++) {
		System.out.print(i+ "^3=");
		System.out.println(b[i]+ " ");
		};//for
		
		System.out.println("The index of the largest element of b[] is "+indexOfMax(b));
		
		primeCheck=sieve(primeMax);
		
		System.out.println("The prime status of numbers follow:  ");
		
		for (int i = 0; i < primeMax; i++) {
	
		System.out.print(i+ ": "+primeCheck[i]+ " _ ");
		};//for
		
	}//main
}//Hello