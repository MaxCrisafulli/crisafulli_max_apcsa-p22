//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] tarr;
	
	public RayOddToEven() {
		setArray(null);
	}
	
	public RayOddToEven(int[] ray) {
		setArray(ray);
	}
	
	public void setArray(int[] ray) {
		tarr = ray;
	}
	
	public int go(int[] ray)
	{
		setArray(ray);
		int oddloc = 0;
		int evenloc = 0;
		int distance = 0;
		for (int i = 0; i < tarr.length; i++) {
			if (tarr[i]%2 != 0) {
				oddloc = i;
				for (int j = i; j < tarr.length; j++) {
					if ( tarr[j]%2 == 0) {
						evenloc = j;
						break;
					}
				}
				break;
			}
		}
		distance = evenloc - oddloc;
		if (distance == 0) {
			distance = -1;
		}
		return distance ;
	}
}