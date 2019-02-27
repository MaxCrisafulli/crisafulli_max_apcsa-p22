//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int length = numArray.length;
		int before;
		int after;
		for (int i=0; i < length; i++) {
			before = numArray[i];
			after = numArray[i+1];	
			if (Math.min(before,after) == after) {
				i++;
			}
			else {
				break;
			}
		}
		return true;
	}	
}