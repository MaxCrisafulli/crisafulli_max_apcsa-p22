//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word> list = new ArrayList<Word>();
		
		for (int i = 0; i < size; i++) {    //adds word data to array list
			list.add(new Word(file.nextLine()));
		}
		
		
		//sorts the list by length
		ArrayList<Word> output = new ArrayList<Word>(); //the new output list 
		size = list.size();
		for (int k = 0; k < size; k ++) {
			Word bigw = new Word("");
			int biggestlength = 0;
			int bigwindex = 0;
			for (int l = 0; l < list.size(); l++) { //finds biggest word
				if (list.get(l).compareTo(bigw) == 0) { // if word lengths are same 
					if (list.get(l).getWord().compareTo(bigw.getWord()) > 0) {
						biggestlength = list.get(l).getLength();
						bigw = list.get(l);
						bigwindex = l;
					}
				}
				else if (list.get(l).compareTo(bigw) == 1) { //if there are larger words
					biggestlength = list.get(l).getLength();
					bigw = list.get(l);
					bigwindex = l;
				}
			}
			list.remove(bigwindex);
			output.add(0,bigw);
		}
		list = output;
		
		//prints the array list
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		
	}
}