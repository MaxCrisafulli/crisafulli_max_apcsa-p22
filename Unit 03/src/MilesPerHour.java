//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	 public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	} 

	 public MilesPerHour(double dist, double hrs, double mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	} 

	public void setNums(double dist, double hrs, double mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		 mph = distance/(hours + (minutes/60));
	}

	public void print()
	{
		System.out.printf((int)distance + " miles in " + (int)hours + " hour(s) and " + (int)minutes + " minutes = " + String.format("%.0f",mph) + " MPH.");
	}
	
}