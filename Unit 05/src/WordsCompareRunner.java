//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare main = new WordsCompare();
		main.setWords("abe","ape");
		main.compare();
		System.out.println(main);
		main.setWords("giraffe","gorilla");
		main.compare();
		System.out.println(main);
		main.setWords("one","two");
		main.compare();
		System.out.println(main);
		main.setWords("fun","funny");
		main.compare();
		System.out.println(main);
		main.setWords("123","19");
		main.compare();
		System.out.println(main);
		main.setWords("193","1910");
		main.compare();
		System.out.println(main);
		main.setWords("goofy","godfather");
		main.compare();
		System.out.println(main);
		main.setWords("funnel","fun");
		main.compare();
		System.out.println(main);
	}
}