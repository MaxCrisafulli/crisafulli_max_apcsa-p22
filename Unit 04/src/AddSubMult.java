//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a - b > 0) {
			return a - b;
		}
		else if (a - b < 0) {
			return b - a;
		}
		else if (a - b == 0) {
			return a * b;
		}
		return 0;
	}
}