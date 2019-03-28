//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;
   private String[] values;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		values = vals;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int)Math.floor(Math.random() * (vals.length))];;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int[] count = new int[values.length];
		
		
		
		
		
		return 0;
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
		return output;
	}
}