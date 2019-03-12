//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
<<<<<<< HEAD
		boolean output = true;
		for (int i = 0; i < numArray.size()-1; i++) {
			if (numArray.get(i) > numArray.get(i+1)) {
				output = true;
			}
			if (!(numArray.get(i) > numArray.get(i+1))) {
				output = false;
				break;
			}
		}
		return output;
=======
		for (int i = 0; i < numArray.size()-2; i++) {
			if (!(numArray.get(i) > numArray.get(i+1))) {
				return false;
			}
		}
		return true;
>>>>>>> 8a667ff59c319abf2a3322fd2b720f39a24d63d6
	}	
}