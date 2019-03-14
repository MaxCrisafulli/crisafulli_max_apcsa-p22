//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		int count = 0;
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getName().equals(toys)) {
				toyList.get(i).setCount((toyList.get(i).getCount()) + 1);
				count++;
			}
		}
		
		if (count == 0) {
			Toy newToy = new Toy(toys);
			toyList.add(newToy);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		Toy outputtoy = null;
  		for (int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				outputtoy = toyList.get(i);
  			}
  		}
  		return outputtoy;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
  		int count = 0;
  		
  		for (int j = 0 ; j < toyList.size(); j++) {
  			if (toyList.get(j).getCount() > count) {
  				count = toyList.get(j).getCount();
  				name = toyList.get(j).getName();
  			}
  		}
  		return name;
  	}  
  
	public String toString()
	{
		String output = "[]\n[";
		
		
		for (int i = 0; i < toyList.size(); i++) {
			output = output + toyList.get(i).getName() + " " + toyList.get(i).getCount() + " ";
		}
		
		output = output +  "]\nmax == " + getMostFrequentToy();
		
		return output;
	}
}