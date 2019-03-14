//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		test.loadToys("Sorry");
		test.loadToys("Action Man");
		test.loadToys("Sorry");
		test.loadToys("GI Joe");
		test.loadToys("GI Joe");
		test.loadToys("Sorry");
		test.loadToys("Train");
		test.loadToys("Action Man");
		test.loadToys("Action Man");
		test.loadToys("Train");
		test.loadToys("Action Man");
		System.out.println(test);

	}
}