//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	private int length;

	public Word( String s )
	{
		word = s;
		length = s.length();
	}
	
	public String getWord() {
		return word;
	}
	
	public int getLength() {
		return length;
	}

	public int compareTo( Word rhs )
	{
		int aSize = length;
		int bSize = rhs.getLength();
		
		if (aSize > bSize) {
			return 1;
		}
		else if (bSize > aSize) {
			return -1;
		}
		else {
			return 0;
		}
	}

	public String toString()
	{
		return word;
	}
}