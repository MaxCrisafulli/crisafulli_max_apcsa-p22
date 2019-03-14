//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num;
	private int den;

	public Rational() 
	{
		setRational(0,0);
	}
	
	public Rational(int n, int d) 
	{
		setRational(n,d);
	}


	public void setRational(int n, int d) 
	{
		num = n;
		den = d;
	}
	
	public void setNum(int n) 
	{
		num = n;
	}
	
	public void setDen(int d) 
	{
		den = d;
	}

	
	public void add(Rational  other)
	{
		int newnum = 0;
		int newden = 0;
		
		newnum = ((num * other.getDen()) + (other.getNum() * den));
		newden = (den * other.getDen());
		setNum(newnum);
		setDen(newden);
		reduce();
		
	}

	private void reduce()
	{
		int placenum = num;
		int placeden = den;
		num = placenum/gcd(placenum,placeden);
		den = placeden/gcd(placenum,placeden);
	}

	private int gcd(int numOne, int numTwo)
	{
	        if (numOne == 0) {
	          return numTwo; 
	        }
	        if (numTwo == 0) { 
	          return numOne; 
	        }
	       
	        if (numOne == numTwo) {
	            return numOne; 
	        }
	       
	        if (numOne > numTwo) {
	            return gcd(numOne-numTwo, numTwo);
	        }
	        
	        return gcd(numOne, numTwo-numOne); 
	    } 


	public Object clone ()
	{
		Rational clone = new Rational(num, den);
		return clone;
	}

	public int getNum()
	{
		return num;
	}
	
	public int getDen()
	{
		return den;
	}
	
	
	public boolean equals(Rational obj)
	{
		reduce();
		obj.reduce();
		if (num == obj.getNum() && den == obj.getDen()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		reduce();
		other.reduce();
		double othernum = other.getNum();
		double otherden = other.getDen();
		double thisnum = getNum();
		double thisden = getDen();
		double valuethis = (thisnum/thisden);
		double othervalue = (othernum/otherden);
		
		if (valuethis > othervalue) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public String toString() 
	{
		return Integer.toString(num) + "/" + Integer.toString(den);
	}
	
	
}