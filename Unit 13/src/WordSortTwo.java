//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		String[] sorted = wordRay;
        for (int i = 0; i < sorted.length; i++) 
        {
            for (int j = i + 1; j < sorted.length; j++) 
            {
                if (sorted[i].substring(0, 1).compareTo(sorted[j].substring(0, 1)) > 0) 
                {
                	String temp = sorted[i];
                	sorted[i] = sorted[j];
                	sorted[j] = temp;
                }
            }
        }
        wordRay = sorted;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output + "\n\n";
	}
}