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
		
        for (int i = 0; i < sorted.length; i++) 
        {
            for (int j = i + 1; j < sorted.length; j++) 
            {
                if (sorted[i] > sorted[j]) 
                {
                	int  temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
		return sorted;
	}
}