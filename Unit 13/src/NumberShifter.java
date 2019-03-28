//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private int[] before, after;

	public int[] makeLucky7Array( int size)
	{
		int[] output = new int[size];
		for (int i = 0; i < size; i++) {
			output[i] = (int)Math.floor(Math.random() * 10) + 1;
		}
		before = output;
		return output;
	}
	public void shiftEm(int[] array)
	{
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				int a = array[counter];
				int b = array[i];
				array[counter] = b;
				array[i] = a;
				counter++;
			}
		}
		after = array;
	}
	
	public String toString() {
		String output = "";
		output += Arrays.toString(before) + "\n";
		output += Arrays.toString(after) + "\n";
		return output;

	} //THIS IS WRONG
	
	
	
}