
public class Test {

	public static void main(String[] args) {
		Card card1 = new Card("Four","Clubs");
		Card card2 = new Card();
		
		//Test Constructor and getter methods
		if(card1.getRank().equals("Four") && card1.getSuit().equals("Clubs"))
			System.out.println("Valid: Card Constructor, getRank and getSuit");
		else
			System.out.println("Error: Card Constructor, getRank and getSuit");
		
		//Test default Constructor and getter methods
		if(card2.getRank().equals("Ace") && card2.getSuit().equals("Spades"))
			System.out.println("Valid: Card Constructor, getRank and getSuit");
		else
			System.out.println("Error: default Card Constructor, getRank and getSuit");
		
		
		Deck deck = new Deck();
		
		for(int i = 0; i < deck.size(); ++i) {
			deck.dealOne().printCard();
		}
		
		
		

	}

}
