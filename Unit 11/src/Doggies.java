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
		if (spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int ageplace = pups[0].getAge();
		Dog oldestdog = null;
		for (int i = 0; i < pups.length; i++) {
			if (ageplace < pups[i].getAge()) {
				ageplace = pups[i].getAge();
				oldestdog = pups[i];
			}
		}
		return oldestdog.getName();
	}

	public String getNameOfYoungest()
	{
		int ageplace = pups[0].getAge();
		Dog oldestdog = null;
		for (int i = 0; i < pups.length; i++) {
			if (ageplace > pups[i].getAge()) {
				ageplace = pups[i].getAge();
				oldestdog = pups[i];
			}
		}
		return oldestdog.getName();
	}
	


	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}