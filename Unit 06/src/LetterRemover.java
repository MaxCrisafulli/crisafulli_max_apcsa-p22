//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence, newsentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",'0');
	}

	public LetterRemover (String s, char rem) {
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		newsentence = "";
	}

	
	public String removeLetters()
	{
		String cleaned = "";
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == lookFor) {
			//do nothing
			}
			else {
				cleaned += sentence.charAt(i);
			}
		}
		newsentence = cleaned;
		return cleaned;
	}
	

	public String toString()
	{
		return String.format(sentence + " - letter to remove " + lookFor + "%n" + newsentence);
	}
}