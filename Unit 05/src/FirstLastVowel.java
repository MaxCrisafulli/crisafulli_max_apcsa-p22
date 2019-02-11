//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 
//Date - 


public class FirstLastVowel
{
	
	private String vowels;
	
	
	public FirstLastVowel() {
		vowels = "aeiouAEIOU";
	}
	
	
	
   public String go( String a )
	{
	   String begLetter = a.substring(a.length() -1);
	   String finLetter = a.substring(0,1); 
	   
	   if (vowels.indexOf(begLetter) != -1 || vowels.indexOf(finLetter) != -1) {
		   return "yes";
	   }
	   return "no";
	}
}
