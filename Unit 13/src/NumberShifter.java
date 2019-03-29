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

	public int[] makeLucky7Array(int size)
	{
		int[] output = new int[size];
		for (int i = 0; i < size; i++) {
			output[i] = (int)Math.floor(Math.random() * 10) + 1;
		}
		return output;
	}
	
	public int[] shiftEm(int[] array)
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
		return array;
	}
}