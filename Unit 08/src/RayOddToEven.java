//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	
	public int go(int[] ray)
	{
		int oddloc = 0;
		int evenloc = 0;
		int distance = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i]%2 != 0) {
				oddloc = i;
				for (int j = i; j < ray.length; j++) {
					if ( ray[j]%2 == 0) {
						evenloc = j;
						break;
					}
				}
			}
			break;
		}
		distance = evenloc - oddloc;
		if (distance == 0) {
			distance = -1;
		}
		return distance;
	}
}