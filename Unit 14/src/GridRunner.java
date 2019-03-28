//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid( 25, 25, new String[] {"a", "b", "c","7","9","x","2", "b", "z"});
		test.findMax(new String[] {"a", "b", "c","7","9","x","2", "b", "z"});
		out.print(test);
		
		
		
	}
}