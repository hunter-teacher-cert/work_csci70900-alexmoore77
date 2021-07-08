import java.io.*;
import java.util.*;
import java.util.Scanner;

//This program convets seconds to hours, minutes, and seconds.
public class ThnkJavaEx3
{
	public static void main(String[] args)
	{
		int second=0,minute=0,hour=0,secondsPassed=0,currentHour=0, currentMinute=0, currentSecond=0, total=0, originalTotal=0;
Scanner input = new Scanner(System.in);

System.out.println("Seconds Conversion Tool");
System.out.println("Please enter the number of seconds that have elapsed since last midnight.");
total=input.nextInt();
originalTotal=total;
currentHour=total/3600;
total=total%3600;
currentMinute=total/60;
total=total%60;
currentSecond=total;
System.out.println(originalTotal+" seconds="+currentHour+ " hours, "+currentMinute+" minutes, "+currentSecond+ " seconds.");
	}
}