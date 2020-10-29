import java.util.Scanner;

public class GameMaker {
	public static void main(String[] args) {
		System.out.println("Enter W for War or B for Blackjack: ");
		Scanner input = new Scanner(System.in);
		
		Game game;
		
		if(input.next().equals("W")) 
			game = new War();
		else if(input.next().equals("B")) 
			game = new Blackjack();
		else
			game = null;
		
		
		game.play();
		
	}
}
