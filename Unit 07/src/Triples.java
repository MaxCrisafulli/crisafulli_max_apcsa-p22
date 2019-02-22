//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   private double a,b,c;

   //constructors and setters
	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
		a=0;
		b=0;
		c=0;
	}
	
	
	private int greatestCommonFactor(int numa, int numb, int numc)
	{
		int limit;
	    limit = Math.min(numa, numb);
	    limit = Math.min(limit, numc);
	    for(int n = limit; n >= 2; n--)
	    {
	        if ( (numa % n == 0) && (numb % n == 0) && (numc % n == 0) ) {
	            return n;
	        }
	    }

	    return 1;
	}

	public String toString()
	{
		String output = "";
		for (int i = 2; i < number; i++) {
			
			for (int j=2; j < number; j++) {
				
				for (int k = 2; k < number; k++) {
					a = i;
					b = j;
					c = k;
					if ((Math.sqrt(a*a + b*b) == c) && ((a%2 != 0 && b%2 == 0)||(a%2 == 0 && b%2 != 0)) && (c%2 != 0) && (greatestCommonFactor(i,j,k) <= 1)) {
						String anum = Integer.toString(i);
						String bnum = Integer.toString(j);
						String cnum = Integer.toString(k);
						String out = String.format(anum + " " + bnum + " " + cnum + "%n");
						output = String.format(output + "%n" + out);
					}
				}
			}
		}
		return output;
	}

}

