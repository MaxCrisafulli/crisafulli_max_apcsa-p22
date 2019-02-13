/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		
		if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.trim().length() == 0) {
			response = "Say something, please";
		}
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pet";
		}
		else if (statement.indexOf("Mauro") >= 0 || statement.indexOf("mauro") >= 0) {
			response = "Mr. Mauro, that's good";
		}
		else if (statement.indexOf("videogames") >= 0 || statement.indexOf("video games") >= 0) {
			response = "Computer games, I like those";
		}
		else if (statement.indexOf("car") >= 0 || statement.indexOf("truck") >= 0 || statement.indexOf("motorbike") >= 0 )
		{
			response = "Motor vehicles, those are cool";
		}
		else if (statement.indexOf("idiot") >= 0 || statement.indexOf("stupid") >= 0) {
			response = "No that's what you are";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
		
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "That's a cool statement";
		}
		else if (whichResponse == 5)
		{
			response = "Thanks for the input";
		}

		return response;
	}
}
