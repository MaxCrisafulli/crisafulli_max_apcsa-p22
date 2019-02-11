//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality main = new StringEquality();
		main.setWords("hello", "goodbye");
		main.checkEquality();
		System.out.println(main);
		main.setWords("one", "two");
		main.checkEquality();
		System.out.println(main);	
		main.setWords("three", "four");
		main.checkEquality();
		System.out.println(main);	
		main.setWords("TCEA", "UIL");
		main.checkEquality();
		System.out.println(main);	
		main.setWords("State", "Champions");
		main.checkEquality();
		System.out.println(main);	
		main.setWords("ABC", "ABC");
		main.checkEquality();
		System.out.println(main);	
		main.setWords("ABC", "CBA");
		main.checkEquality();
		System.out.println(main);	
		main.setWords("Same", "Same");
		main.checkEquality();
		System.out.println(main);	
	}
}