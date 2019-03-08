//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	private int sumout;

	public ListSumFirst() {
		sumout = 0;
	}
	
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		for (int i = 1; i < ray.size(); i++) {
			int first = ray.get(0);
			if (ray.get(i) > first) {
				sum += ray.get(i);
			}
		}
		if (sum == 0) {
			sum = -1;
		}
		return sum;
	}

}