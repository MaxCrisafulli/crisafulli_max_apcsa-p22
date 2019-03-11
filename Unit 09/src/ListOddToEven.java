//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public int go( List<Integer> ray )
	{
		int dist = 0;
		int oddloc = -1;
		int evenloc = -1;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i)%2 != 0) {
				oddloc = i;
				for (int j = ray.size()-1; j > i; j--) {
					if (ray.get(j)%2 == 0) {
						evenloc = ray.size()-1-j;
					}
				}
			}
		}
		dist = oddloc - evenloc;
		if (oddloc == -1 || evenloc == -1 ) {
			dist = -1;
		}
		return dist;
	}

}