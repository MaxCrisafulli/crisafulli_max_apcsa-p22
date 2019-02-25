//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;
   private String output;

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

	 public String letterArranger() {
		
		for (int i=amount; i>0; i--) {
			
				
				for (int k = 0; k < i ; k++) {

						
						for (int l = amount-k; l > 0; l--) {
							int lettervalue = letter + k;
							if (lettervalue > 90) {
								System.out.print((char)(letter+k-26));
							}
							else {
								System.out.print((char)(letter+k));
							}
							
						}
						System.out.print(" ");
				}
				System.out.println();

		}
		return "";
	} 
	

	
	public String toString()
	{
		return letterArranger();
	}
}