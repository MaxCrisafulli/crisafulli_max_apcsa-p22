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
		toyList = null;
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
  		Toy mft = null;
  		
  		for (int i = 0; i < toyList.size(); i++) {
  			
  			Toy placetoy = toyList.get(i);
  			int toyfreq = 0;
  			int prevtoyfreq = 0;
  			
  			for (int j = 0; j < toyList.size(); j++) {
  				if (placetoy.getName().equals(toyList.get(j).getName())) {
  					toyfreq += 1;
  				}
  			}
  			
  			if (toyfreq > prevtoyfreq) {
  				mft = placetoy;
  			}
  		}
  		
  		return mft.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}