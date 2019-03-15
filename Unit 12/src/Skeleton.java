//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//instance variables
	private int size;
	private String name;

	
	//constructors and setters
	public Skeleton() {
		setName("");
		setSize(0);
	}
	
	public Skeleton(String n, int s) {
		setName(n);
		setSize(s);
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setSize(int s) {
		size = s;
	}

	
	//implementations
	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) {
		if (size > other.getHowBig()) {
			return true;
		}
		return false;
	}

	public boolean isSmaller(Monster other) {
		if (size < other.getHowBig()) {
			return true;
		}
		return false;
	}

	public boolean namesTheSame(Monster other) {
		if (name.equals(other.getName())) {
			return true;
		}
		return false;
	}	

	
	public String toString() {
		return name + " " + Integer.toString(size);
	}
}