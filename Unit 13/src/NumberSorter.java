//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0) {
			number = number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int num = number;
		for (int i = sorted.length-1;i > -1; i--) { //separates digits into an array
			int newNumber = num % 10;
			num = num/10;
			sorted[i] = newNumber;
		}
		
		int counter = 0;
		for (int i = 0; i < sorted.length; i++) {  //orders the digits
			int smallestnum = sorted[sorted.length-1];
			int smallestindex = sorted.length-1;
			if (sorted[i] < smallestnum) {
				smallestindex = i;
				smallestnum = sorted[i]; 
				int temp = sorted[counter];
				sorted[counter] = smallestnum;
				sorted[i] = temp;
				counter++;
			}
		}
		return sorted;
	}
}