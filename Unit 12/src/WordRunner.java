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
		
		
		
		
		
		
		
		
		
		
		
		
		for (int j = 0; j < list.size(); j++) { //prints array list
			System.out.println(list.get(j));
		}
		
	}
}