//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		setWord("");
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		System.out.println(word);
		for(int i=0; i < word.length(); i++) {
			String wordtoprint = word.substring(0, (word.length()-(i+1)));
			System.out.println(wordtoprint);
		}
	}
}