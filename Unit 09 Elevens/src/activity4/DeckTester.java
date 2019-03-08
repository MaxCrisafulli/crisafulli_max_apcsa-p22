package activity4;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck test = new Deck(new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}, new String[] {"Clubs", "Spades", "Diamonds", "Hearts" }, new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13});
		test.printCards();
		System.out.println(test.size());
		test.shuffle();
		test.printCards();
		System.out.println(test.size());
		
	}
}
