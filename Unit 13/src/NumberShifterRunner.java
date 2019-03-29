//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter();
		int[] array = test.makeLucky7Array(20);
		System.out.println("Initial Array is " + Arrays.toString(array));
		System.out.println("Shifed Array is " + Arrays.toString((test.shiftEm(array))));
				
	}
}



