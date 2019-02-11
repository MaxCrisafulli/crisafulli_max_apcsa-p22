//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private int length;

	public StringOddOrEven()
	{
		word = "";
		length = 0;
	}

	
	public StringOddOrEven(String s)
	{
		word = s;
		length = s.length();
	}

	
	public void setString(String s)
	{
		word = s;
		length = s.length();
	}

	
 	public boolean isEven()
 	{
 		
 		if (length%2 == 0) {
 			return true;

 		}
 		else {
 			return false;
 		}
	}

 	public String toString()
 	{
 		if (isEven() == true) {
 			return word + " is even";
 		}
 			return word + " is odd";
	}
}