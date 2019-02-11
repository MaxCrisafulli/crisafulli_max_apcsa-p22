//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main( String[] args )
	{
		StringOddOrEven main = new StringOddOrEven();
		Scanner keyin = new Scanner(in);
		out.print("Enter a word :: ");
		String s = keyin.next();
		main.setString(s);
		main.isEven();
		System.out.println(main);
	}
}