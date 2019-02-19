//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		test.setNum(496);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(45);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(6);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(14);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(8128);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(1245);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(33);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(28);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(27);
		test.isPerfect();
		System.out.println(test);
		
		test.setNum(33550336);
		test.isPerfect();
		System.out.println(test);
																
	}
}