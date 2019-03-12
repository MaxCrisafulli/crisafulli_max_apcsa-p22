//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		Toy newToy = new Toy(toys);
		toyList.add(newToy);
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
  		
  		
  		
  		
  		
  		
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}