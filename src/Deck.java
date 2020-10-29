import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	private int next;
	private final int deckSize = 52;
	
	private String suitNames[] = {"Spades","Hearts","Clubs","Diamonds"};
	private String rankNames[] = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
	
	
	//Default Constructor that creates the deck
	Deck(){
		for(int i = 0; i < 4; ++i) {
			for(int j = 0; j < 13; ++j) {
				Card card = new Card(rankNames[j],suitNames[i]);
				cards.add(card);
			}
		}
		next = 0;
	}
	
	/*
	 *     Parameters:
	 *     Returns: Card
	 *     Purpose: Deals a card from the top of the deck.
	 */
	public Card dealOne() {
		++next;
		return cards.get(next-1);
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Resets the deck starting at the first card
	 */
	public void reset() {
		next = 0;
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Shuffles the Cards, repeated 7 times.
	 */
	public void shuffle() {
		for(int i = 0; i < 7; ++i) {
			Collections.shuffle(cards);
		}
		next = 0;
	}
	
	/*
	 *     Parameters: 
	 *     Returns: boolean
	 *     Purpose: Returns whether or not the pack is empty or not.
	 */
	public boolean isEmpty() {
		return(next == deckSize);
	}
	
	public int size() {
		return cards.size();
	}
}
