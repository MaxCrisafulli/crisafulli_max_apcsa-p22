//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble test = new BiggestDouble();
		test.setDoubles(4.5, 6.7, 7.8, 9.0);
		test.getBiggest();
		out.println(test);
		
		test.setDoubles(14.51, 6.17, 71.8, 19.0);
		test.getBiggest();
		out.println(test);
		
		test.setDoubles(41.15, 816.7, 17.8, 19.0);
		test.getBiggest();
		out.println(test);
		
		test.setDoubles(884.5,16.7,7.8,9.0);
		test.getBiggest();
		out.println(test);
		
		test.setDoubles(4.5,-456.7,677.8,9.0);
		test.getBiggest();
		out.println(test);
		
		test.setDoubles(4.5, 16.7, -7.8, -9.0);
		test.getBiggest();
		out.println(test);
				
	}
}