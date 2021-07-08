import java.io.*;
import java.util.*;

public class Time
{
	public static void main(String[] args)
	{
		int hour=13;
		int minute=28;
		int second=14;
		int secondsPassed=(hour*60*60)+(minute*60)+second;
		int secondsRemaining=((23-hour)*60*60)+((59-minute)*60)+(60-second);
		
		float percentagePassed=(100* (hour*60*60)+(minute*60)+second)/ (24*60*60);
int savedSecondsPassed=secondsPassed;
	System.out.println("Current Time:\n" + hour+ ":"+minute+ ":"+second); 
	System.out.println("The seconds since midnight are ("+hour+" hours * 60 * 60) + ("+minute+" minutes *60) + "+second+" seconds="+secondsPassed);
	System.out.println("The seconds remaining in the day are ((23-"+hour+" hours)*60*60) + ((59-"+minute+" minutes)*60) + (60-"+second+" seconds)="+secondsRemaining);
	System.out.println("The percentage of the day that has passed is the seconds since 100 * The seconds since midnight/(24*60*60)=" + percentagePassed+"%");
		
	
hour=14;
minute=33;
second=10;
secondsPassed=(hour*60*60)+(minute*60)+second;
		secondsRemaining=((23-hour)*60*60)+((59-minute)*60)+(60-second);
		percentagePassed=(100* (hour*60*60)+(minute*60)+second)/ (24*60*60);
	System.out.println("Current Time:\n" + hour+ ":"+minute+ ":"+second); 
	System.out.println("The seconds since midnight are ("+hour+" hours * 60 * 60) + ("+minute+" minutes *60) + "+second+" seconds="+secondsPassed);
	System.out.println("The seconds remaining in the day are ((23-"+hour+" hours)*60*60) + ((59-"+minute+" minutes)*60) + (60-"+second+" seconds)="+secondsRemaining);
	System.out.println("The percentage of the day that has passed is the seconds since 100 * The seconds since midnight/(24*60*60)=" + percentagePassed+"%");
	System.out.println("The time that has passed since I started working on this exercise is secondsPassed-savedSecondsPassed="+(secondsPassed-savedSecondsPassed));
	}
}