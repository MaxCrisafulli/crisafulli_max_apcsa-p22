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
	private Card[] cards;

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
		int initdecksize = suits.length * ranks.length;
		int deckloc = 0;
		Card[] outputlist = new Card[initdecksize];
		for (int i = 0; i < ranks.length; i++) {
			String inputrank = ranks[i];
			int inputvalue = values[i];
			
			for (int j = 0; j < suits.length; j++) {
				String inputsuit = suits[j];
				outputlist[deckloc] = new Card(inputrank, inputsuit, inputvalue);
				deckloc += 1;
			}
			
		}
		
		cards = outputlist;
		size = cards.length;
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (cards.length == 0) {
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
		size = cards.length;
		System.out.println(size);
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	
	
	public void shuffle() {
		for (int i = size()-1; i > 0; i--) {
			int random = (int)Math.floor(size() * Math.random());
			
			Card card1temp = cards[i];
			Card card2temp = cards[i];
			cards[i] = card2temp;
			cards[random] = card1temp;
		}
	}


	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		Card returnedcard = cards[size-1];
		size--;
		return returnedcard;
	}
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}