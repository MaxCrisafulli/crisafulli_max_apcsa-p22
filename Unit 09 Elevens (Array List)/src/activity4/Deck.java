package activity4;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		ArrayList<Card> outputlist = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++) {
			String inputrank = ranks[i];
			int inputvalue = values[i];
			
			for (int j = 0; j < suits.length; j++) {
				String inputsuit = suits[j];
				outputlist.add(new Card(inputrank, inputsuit, inputvalue));
			}
			
		}
		cards = outputlist;
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (cards.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		size = cards.size();
		return size;
	}
	
	public Card get(int index) {  //allows getting card at an index (used in deal() method)
		return cards.get(index);
	}
	
	public void printCards() {   //prints out the cards in the deck for debugging purposes
		for (int i = 0; i < cards.size(); i++) {
			System.out.println(cards.get(i));
		}
		System.out.println();
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	
	
	public void shuffle() {
		for (int i = size()-1; i > 0; i--) {
			int random = (int)Math.floor(size() * Math.random());
			Card card1temp = cards.get(i);
			Card card2temp = cards.get(random);
			cards.add(i, card2temp);
			cards.add(random, card1temp);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		Card removedcard = cards.get(0);
		cards.remove(0);
		return removedcard;
	}
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		size();
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
