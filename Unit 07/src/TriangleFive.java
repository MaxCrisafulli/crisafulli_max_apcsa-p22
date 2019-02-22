//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public void letterArranger() {
		
			for (int i=amount; i>0; i--) {
				
					
					for (int k = 0; k < i ; k++) { //increments the letters
						
							
							for (int l = amount-k; l > 0; l--) { //prints the letters out the number of times
								if (letter > 89) {
									letter = (char)(letter-26);
								}
								System.out.print((char)(letter+k));
								
					}
						System.out.print(" ");
				}
				System.out.println();

			}
	}
	
	public String toString()
	{
		String output="";
		return output;
	}
}