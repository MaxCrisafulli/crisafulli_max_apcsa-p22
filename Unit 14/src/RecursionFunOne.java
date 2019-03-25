//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		String number = Integer.toString(num);
		int length = number.length();
		for (int i = 0; i < length; i++) {
			int digit = (num%(10*(length-i)))/1;
			System.out.println("The " + i + " digit is " + digit);
		}
		return 0;
	}
}