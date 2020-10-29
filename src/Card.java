
public class Card {
	private String rank;
	private String suit;
	
	private String rankNames[] = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
	//Default constructor sets the card to the Ace of Spades
	public Card(){
		rank = "Ace";
		suit = "Spades";
	}
	
	//Constructor setting the card to a given rank and suit
	public Card(String rank,String suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	/*
	 *     Parameters: 
	 *     Returns: String
	 *     Purpose: Returns the rank of the card
	 */
	public String getRank() {
		return rank;
	}
	
	
	/*
	 *     Parameters: 
	 *     Returns: String
	 *     Purpose: Returns the suit of the card
	 */
	public String getSuit() {
		return suit;
	}
	
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Prints the rank and suit of the card
	 */
	public void printCard() {
		System.out.println("\t" + rank + " " + suit);
	}

	public boolean isGreater(Card rhs) {
		int index1 = 0, index2 = 0;
		for(int i = 0; i < rankNames.length; ++i) {
			if(this.rank.equals(rankNames[i]))
				index1 = i;
			if(rhs.rank.equals(rankNames[i]))
				index2 = i;
		}
		if(index1 > index2)
			return true;
		else
			return false;
		
		
	}

	public boolean isLess(Card rhs) {
		int index1 = 0, index2 = 0;
		for(int i = 0; i < rankNames.length; ++i) {
			if(this.rank.equals(rankNames[i]))
				index1 = i;
			if(rhs.rank.equals(rankNames[i]))
				index2 = i;
		}
		if(index1 < index2)
			return true;
		else
			return false;
	}
	
	
}
