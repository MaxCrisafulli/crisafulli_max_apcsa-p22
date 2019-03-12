//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot < pups.length-1) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		Dog oldestdog = null;
		int biggestage = 0;
		for (int i = 0; i < pups.length-1; i++) {
			int oldest = Math.max(biggestage, pups[i].getAge());
			biggestage = oldest;
		}
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() == biggestage) {
				oldestdog = pups[i];
				break;
			}
		}
		return oldestdog.getName();
	}

	public String getNameOfYoungest()
	{
		Dog youngestdog = null;
		int smallestage = pups[0].getAge();
		for (int i = 0; i < pups.length-1; i++) {
			int youngest = Math.max(smallestage, pups[i].getAge());
			smallestage = youngest;
		}
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() == smallestage) {
				youngestdog = pups[i];
				break;
			}
		}
		return youngestdog.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}