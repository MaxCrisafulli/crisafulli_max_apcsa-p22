//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Triples test = new Triples();
	   Scanner keyin = new Scanner(System.in);
	   int limit = keyin.nextInt();
	   test.setNum(limit);
	   System.out.println(test);
   }
}