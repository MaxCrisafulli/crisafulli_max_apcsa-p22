//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word, backword, charbeg, charend;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
		charbeg = "";
		charend = "";
		backword = "";
	}

	public String getFirstChar()
	{
		charbeg = word.substring(0,1);
		return charbeg;
	}

	public String getLastChar()
	{
		charend = word.substring(word.length()-1,word.length());
		return charend;
	}

	public String getBackWards()
	{
		for (int i = (word.length()-1); i > -1; i--) {
			backword = backword + word.substring(i,i+1);
		}
		return backword;
	}
	
	public void runAll() {
		getFirstChar();
		getLastChar();
		getBackWards();
	}

 	public String toString()
 	{
 		return String.format(charbeg + "%n" + charend + "%n" + backword + "%n" + word);

	}
}