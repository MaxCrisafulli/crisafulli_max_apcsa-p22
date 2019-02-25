//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive();
	   Scanner keyin = new Scanner(System.in);
	   System.out.print("Please enter the character :: ");
	   char c = keyin.next().charAt(0);
	   System.out.print("Please enter the number :: ");
	   int n = keyin.nextInt();
	   test.setAmount(n);
	   test.setLetter(c);  
	   System.out.print(test);
	}
}