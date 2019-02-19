//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		test.setString("Hello");
		test.runAll();
		System.out.println(test);
		test.setString("World");
		test.runAll();
		System.out.println(test);
		test.setString("JukeBox");
		test.runAll();
		System.out.println(test);
		test.setString("TCEA");
		test.runAll();
		System.out.println(test);
		test.setString("UIL");
		test.runAll();
		System.out.println(test);	
	}
}