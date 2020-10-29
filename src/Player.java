import java.util.ArrayList;
import java.util.Scanner;




public class Player {
	protected String name;
	protected ArrayList<Card> hand = new ArrayList<>();
	
	/*
	 *     Parameters: 
	 *     Returns: String
	 *     Purpose: Returns the name of the Player
	 */
	public String getName() {
		return name;
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Adds a card to the players hand
	 */
	public void addCard(Card c) {
		hand.add(c);
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Removes the first card in a players hand
	 */
	public void removeCard() {
		hand.remove(0);
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Plays the first card in a players hand
	 */
	public Card playCard() {
		return hand.remove(0);
	}
}






class Human extends Player{
	//Constructor setting name of player
	public Human(String name) {
		this.name = name;
	}
		
		
	/*
	 *     Parameters: 
	 *     Returns: Card
	 *     Purpose: Prompts the user for a card and returns that card.
	 */
	public Card playCard() {
		printHand();
		System.out.println("Enter a card to play 1 - " + hand.size());
		Scanner input = new Scanner(System.in);
		return hand.remove(input.nextInt() - 1);
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: Prints the contents of the user's hand
	 */
	public void printHand() {
		System.out.println(name + "'s hand: ");
		for(Card c : hand) {
			c.printCard();
		}
	}
}

class AI extends Player{
	//Constructor setting name of player 
	public AI(String name) {
		this.name = name;
	}
	
	/*
	 *     Parameters: 
	 *     Returns: Card
	 *     Purpose: Plays First Card in AI's Hand
	 */
	public Card playCard() {
		Card card = hand.remove(0);
		System.out.println(name + " played: ");
		card.printCard();
		return card;
		
		
	}
}





class PlayerFactory{
	/*
	 *     Parameters: String, String
	 *     Returns: Player
	 *     Purpose: Takes in the name and type of a player and returns either a Human or AI object with the corresponsing name.
	 *     	returns null in case of error
	 */
	public static Player createPlayer(String name, String type) {
		if(type.equals("Human"))
			return new Human(name);
		else if(type.equals("AI"))
			return new AI(name);
		else
			return null;
	
	}
}


