//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int sum;
	private int[] tar;
	
	public RaySumLast() {
	}
	
	public RaySumLast(int[] ray) {
		setArray(ray);
	}
	
	public void setArray(int[] ray) {
		tar = ray;
		sum = 0;
	}
	
	
	public int getSum()
	{
		int lastvalue = tar[tar.length-1];
		for (int i = 0; i < tar.length; i++) {
			if (tar[i] > tar[lastvalue]) {
				sum += tar[i];
			}
		}
		return sum;
	}
	
	public String toString() {
		return Integer.toString(getSum());
	}
}