//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	private boolean result;
	private int[] arr;
	
	public RayDown() {
		setArray(null);
	}
	
	public RayDown(int [] numArray) {
		setArray(numArray);
	}
	
	public void setArray(int [] numArray) {
		arr = numArray;
	}
	
	public boolean go(int[] numArray) {
		setArray(numArray);
		int length = arr.length;
		for (int i = 0; i < (length-1); i++) {

			if (arr[i] > arr[i+1]) {
				result = true;
			}
			else {
				result = false;
				break;
			}
		}
		if (arr.length == 1) {
			result = true;
		}
		return result;
	}
}