//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;
   private int valength;
   private String[]valsarr;
   private int[] countarr;
   private String mostvalue;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		valength = vals.length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int)Math.floor(Math.random() * (vals.length))];;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] count = new int[valength];
		
		for (int i = 0; i < valength; i++) {
			count[i] = countVals(vals[i]);
		}
		
		
		String mostval = "";
		int index = 0;
		int biggestcount = 0;
		
		for (int j = 0; j < count.length; j++) {
			if (count[j] > biggestcount) {
				biggestcount = count[j];
				index = j;
			}
		}
		
		mostval = vals[index];
		countarr = count;
		valsarr = vals;
		mostvalue = mostval;
		return mostval;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (String[] row : grid) {
			for (String word : row) {
				if (val.equals(word)) {
					count += 1;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (String[] row : grid) {
			for (String str : row) {
				output += str + " ";
			}
			output += "\n";
		} 
		
		output += "\n";
		
		for (int i = 0; i < countarr.length; i++) { //print out for debugging
			output += valsarr[i] + " count is " +  countarr[i] + "\n";
		}
		
		output += "\n";
		
		output += mostvalue + " occurs the most";
		
		return output;
	}
}