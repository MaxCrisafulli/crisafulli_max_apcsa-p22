package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		//creates card objects
		Card card1 = new Card("King", "Clubs", 13);
		Card card2 = new Card("King", "Clubs", 13);
		Card card3 = new Card("Ace", "Spades", 1);
		//prints card values
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		//testing matches
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		System.out.println(card2.matches(card1));
		System.out.println(card2.matches(card3));
		System.out.println(card3.matches(card1));
		System.out.println(card3.matches(card2));
	}
}