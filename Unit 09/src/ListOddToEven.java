//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	private int distance;
	
	public ListOddToEven () {
		distance = 0;
	}
	
	public int go(List<Integer> ray)
	{
		int size = ray.size();
		int evenloc = -1;
		int oddloc = -1;
		
		for (int i = 0; i < size; i++) {
			if (ray.get(i)%2 != 0) {
				oddloc = i;
				break;
			}
			else {
				oddloc = -1;
			}
		}
		
		for (int j = size-1; j > oddloc; j--) {
			if (ray.get(j)%2 == 0) {
				evenloc = j;
				break;
			}
			else {
				evenloc = -1;
			}
		}
		
		distance = evenloc - oddloc;
		if (evenloc == -1 || oddloc == -1) {
			distance = -1;
		}
		return distance;
	}
	
	
	public String toString() {
		return Integer.toString(distance);
	}

}