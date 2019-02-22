//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		for (int i=0; i < i+1; i++) { //loop forever until no is entered
		//Take keyboard input
		Scanner keyboard = new Scanner(System.in);
		out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
		char player = keyboard.next().charAt(0);
		
		//Instantiate and Run
		RockPaperScissors game = new RockPaperScissors();
		game.setPlayers(player);
		out.println(game);
		
		//ask to player again
		out.printf("Do you want to play again? ");
		char response = keyboard.next().charAt(0);
		if (response == 'y') {
			i++;
		}
		else {
			out.println("Thanks for playing");
			break;
		}
	}
}
}