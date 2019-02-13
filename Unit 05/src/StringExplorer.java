/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		int pos = sample.indexOf("slow");
		if (pos != 1)
			System.out.println("Slow is found at position " + pos);
		else
			System.out.println("slow is not found");
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String str = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		System.out.println("The sentence is: " + str);
		int i = str.indexOf("the");
		if (i != -1)
		{
			while(i >= 0)
			{
				System.out.println("the word 'the' is at index " + i + " in the sentence");
				i = str.indexOf("the", i+1);
			}
		}
		else {
			System.out.println("The word 'the' is not in the phrase");
		}
		
		
		
	}

}
