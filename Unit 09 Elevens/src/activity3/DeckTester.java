package activity3;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck test = new Deck(new String[] {"A", "B", "C", "D", "E"}, new String[] {"Giraffes", "Lions", "Zebras"}, new int[] {2,1,6,4,5});
		System.out.println(test);
		
		
	}
}
