//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
	private int[][] m;

	public TotalRow(int[][] matrix) {
		m = matrix;
	}

	
    public List<Integer> getRowTotals()
    {
    	ArrayList<Integer> output = new ArrayList<Integer>();
    	for (int[] row : m) {
    		int sum = 0;
    		for(int num : row ) {
    			sum += num;
    		}
    		output.add(sum);
    	}
		return output;
    }
    
    public String toString() {
    	String wordout = "";
    	wordout += "Row total are :: ";
    	wordout += getRowTotals();
    	return wordout;
    }
 }
