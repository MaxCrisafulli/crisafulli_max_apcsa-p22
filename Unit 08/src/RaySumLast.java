//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int[] arr;
	
	public RaySumLast() {
		setArray(null);
	}
	
	public RaySumLast(int[] ray) {
		arr = ray;
	}
	
	public void setArray(int[] ray) {
		arr = ray;
	}
	
	public int getSum(int [] ray)
	{
		setArray(ray);
		int sum = 0;
		int lastvalue = 0;
		lastvalue = arr[arr.length-1];
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[lastvalue]) {
				sum += arr[i];
			}
		}
		return sum;
	}
}