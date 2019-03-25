//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
    	int count = 0;
    	for (int[] row : m) {
    		for(int num : row ) {
    			if (num == val) {
    				count += 1;
    			}
    		}
    	}
		return count;
    }
    
    public String toString() {
    	String output = "Matrix values \n";
    	for (int[] row : m) {
    		for (int num : row) {
    			output += num + "  ";
    		}
    		output += " \n";
    	}
    	output += "\n";
    	
    	output += "The 7 count is :: " + count(7) + "\n";
    	output += "The 8 count is :: " + count(8) + "\n";
    	output += "The 6 count is :: " + count(6) + "\n";
    	output += "The 21 count is :: " + count(21) + "\n";
    	return output;
    }
}
