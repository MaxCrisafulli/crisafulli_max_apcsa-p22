//(c) A+ !Computer wins <<>>! Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors()
	{
		setPlayers('0');
	}

	public RockPaperScissors(char playerch)
	{
		setPlayers(playerch);
	}

	public void setPlayers(char player)
	{
		playChoice = player;
		
		int rand = (int)(3*Math.random()); 
		switch(rand) {
		case 0: compChoice = 'R'; 
				break;
		case 1: compChoice = 'P'; 
				break;
		case 2: compChoice = 'S';
				break;
		}	
	}

	public String determineWinner()
	{
		String winner = "";
		//player = rock
		if (playChoice == 'R' && compChoice == 'R') {
			winner = "!Draw Game!";
		}
		else if (playChoice == 'R' && compChoice == 'P') {
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		else if (playChoice == 'R' && compChoice == 'S') {
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		}
		//player = paper
		else if (playChoice == 'P' && compChoice == 'R') {
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		else if (playChoice == 'P' && compChoice == 'P') {
			winner = "!Draw Game!";
		}
		else if (playChoice == 'P' && compChoice == 'S') {
			winner = "!Computer wins <<Scissors Cut Paper>>!";
		}	
		//player = scissors
		else if (playChoice == 'S' && compChoice == 'R') {
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		}
		else if (playChoice == 'S' && compChoice == 'P') {
			winner = "!Player wins <<Scissors Cut Paper>>!";
		}
		else if (playChoice == 'S' && compChoice == 'S') {
			winner = "!Draw Game!";
		}
		return winner;
	}

	public String toString()
	{
		String output = String.format("Player had " + playChoice + "%n" + "Computer had " + compChoice + "%n" + determineWinner() + "%n" );
		return output;
		
	}
}