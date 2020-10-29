import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	protected ArrayList<Player> players = new ArrayList<>();
	protected Deck deck = new Deck();
	protected ArrayList<Integer> score = new ArrayList<>();
	
	public void shuffle(){
		deck.shuffle();
	}

	public void play() {}	
}

class War extends Game{
	public void play(){
		System.out.println("War Starting:");
		
		//Create player one and add to the list
		System.out.println("Enter player 1  Name and Type");
		Scanner input = new Scanner(System.in);
		players.add(PlayerFactory.createPlayer(input.next(),input.next()));

		//Create player two and add to the list
		System.out.println("Enter player 2  Name and Type");
		players.add(PlayerFactory.createPlayer(input.next(),input.next()));
		
		//Sets scores to 0
		score.add(0);
		score.add(0);
		
		//Shuffles deck
		shuffle();
		
		//Deals all the cards to the players
		while(!deck.isEmpty()){
			players.get(0).addCard(deck.dealOne());
			players.get(1).addCard(deck.dealOne());
		}
		
		//Loops while players have cards in their hand
		while(players.get(0).hand.size() != 0) {
			playHand();
			System.out.println();
		}
		
		//Prints who won and the final score
		if(score.get(0) > score.get(1))
			System.out.println(players.get(0).getName() + " Won!\t" + score.get(0) + " to " + score.get(1));
		else if(score.get(1) > score.get(0))
			System.out.println(players.get(1).getName() + " Won!\t" + score.get(1) + " to " + score.get(0));
		else
			System.out.println("It was a tie!\t" + + score.get(0) + " to " + score.get(1));
		
		
		
	}
	
	/*
	 *     Parameters: 
	 *     Returns: 
	 *     Purpose: playHand is used to play a hand in War, this function first print the two cards that were played followed by
	 *     who won and adding to their score. In the case of a tie 3 cards are discarded and another card is played.
	 */
	public void playHand(){
		//Play Cards
		Card card1 = players.get(0).playCard();
		Card card2 = players.get(1).playCard();
		
		//Scores Hand
		if(card1.isGreater(card2)) {
			System.out.println(players.get(0).getName() + " won the hand\n");
			score.add(0, score.get(0) + 1);
		}
		else if(card1.isLess(card2)) {
			System.out.println(players.get(1).getName() + " won the hand\n");
			score.add(1, score.get(1) + 1);
		}
		//In case of tie
		else {
			System.out.println("Tie\n 3 cards Discarded");
			
			//In case hand < 3 play discard all but one card
			int size;
			if(players.get(0).hand.size() <= 3)
				size = players.get(0).hand.size() -1;
			else
				size = 3;
			
			//Discards 3 cards (less if hand < 3)
			for(int i = 0; i < size; ++i){
				players.get(0).removeCard();
				players.get(1).removeCard();
			}
			
			//Play Cards
			card1 = players.get(0).playCard();
			card2 = players.get(1).playCard();
			
			//Scores Cards
			if(card1.isGreater(card2))
				score.add(0, score.get(0) + 1);
			if(card1.isLess(card2))
				score.add(1, score.get(1) + 1);		
		}
	}
	
	
	
	
}




class Blackjack extends Game{	
	public void playBlackjack(){
		
	}
}


	
	

