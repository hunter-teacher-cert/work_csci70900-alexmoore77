import java.io.*;
import java.util.*;



public class Methods
{
	
//Chapter 6, Exercise 2	
/**
isDivisible:  Returns true if n is divisible by m.
*/
	public static Boolean isDivisible (int n, int m)
	{
		
		if (n % m == 0)
		return true;
		
		if (n % m != 0)
		return false;
		
		return false;
	}//isDivisible

/**
isTriangle:  Returns true unless the sum of the length of two sides is less than that of a third side.
*/
//Chapter 6, Exercise 3
	public static Boolean isTriangle (int a, int b, int c)
	{
		if (((a+b)<c) || (b+c)<a || (a+c)<b)
		return false;
		
		else return true;
		
	}//isTriangle

/**
ack:  recursive function
*/
//Chapter 6, Exercise 8
	public static int ack (int m, int n)
	{
	if (m==0)	
		return n+1;
		
		else if (m>0 && n==0)
			return ack(m-1,1);
			
			else if (m>0 && n>0)
				return ack(m-1,ack(m,n-1));
				
				else return 0;
	
	}//ack


	
	public static void main (String[] args)
	{
		
		if (isDivisible(10,5)) System.out.println ("10 is divisble by 5.");
		if (isDivisible(10,3)) System.out.println ("10 is divisble by 3.");
		
		if (!isTriangle(1,1,10)) System.out.println ("This is not a triangle.");
		
		System.out.println(ack(1,1));
		
		return;
		
		
	}//main
}//Hello