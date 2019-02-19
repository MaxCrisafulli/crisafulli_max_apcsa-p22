//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",'a');
	}

	public LetterRemover (String s, char rem) {
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	
	public String removeLetters()
	{
		String cleaned = sentence;
		int loc = sentence.indexOf(lookFor);
		while (loc < sentence.length() ) {
			cleaned = sentence.substring(0, loc);
			loc = cleaned.indexOf(lookFor);
		}
		
		return cleaned;
	}
	

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + removeLetters();
	}
}