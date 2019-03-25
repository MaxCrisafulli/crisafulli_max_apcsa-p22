//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int number) {
	    if (number == 0) { //if the number is 0 then it will return 0 immediately
	    return 0;
	    }
	    
	    int lastdig = number % 10;   //gets the last digit of the number
	    int firstdigs = number / 10; //gets the remaining digits of the number
	    
	    if (lastdig % 2 == 0) {  //if the last digit is even
	        return 1 + countEvenDigits(firstdigs); // return 1 + then call the method again on the remaning numbers
	    } else {
	        return 0 + countEvenDigits(firstdigs); 
	    }
	}
}