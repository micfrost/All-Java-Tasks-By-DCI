package D51_tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Welcome Message to the console
		System.out.println("Welcome to Console Tic Tac Toe");
		System.out.println("You can win every game because the Computer is not smart");
		System.out.println();
		
		// Create Objects.
		GameBoard gameBoard = new GameBoard();
		Random random = new Random();
		
		//. Print the Board to the console
		gameBoard.printGameBoard();
		System.out.println();
		
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		int playerChoice;
		int computerChoice = 0;
		int[] choices = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		boolean winner = false;
		int numOfTimesPlayed = 0;
		
		while(numOfTimesPlayed <= 5) {
			System.out.println("Enter a number from 1-9 to play:");
			
			playerChoice = scanner.nextByte();
			
			for(int i = 0; i < 9; i++) {
				
				if(choices[i] == playerChoice) {
					choices[i] = 0;
					break;
				}
			}
			
			gameBoard.printGameBoardAfterChoice(playerChoice, "player");
			System.out.println();
			System.out.println("Current Game State:");
			winner = gameBoard.isWinner();
			
			// This checks whether the Player won
			if (winner) {
				System.out.println("Congratulations Player, you won the game!!!");
				scanner.close();
				return;
			}
			
			// Do while statement to make sure that the Computer chooses a blank spot.
			do {computerChoice = choices[random.nextInt(0, 9)];} while(computerChoice == 0);
			
			for(int i = 0; i < 9; i++) {
				
				if(choices[i] == computerChoice) {
					choices[i] = 0;
					break;
				}
			}
			
			// Prints gameBoard to the console after the Computer plays
			gameBoard.printGameBoardAfterChoice(computerChoice, "computer");
			
			winner = gameBoard.isWinner();
			
			// This checks whether the Computer won
			if (winner) {
				System.out.println("Congratulations Computer, you won the game!!!");
				scanner.close();
				return;
			}
			
			// Increments number of times played
			numOfTimesPlayed++;
			
			
		}
		
		System.out.println("This is a draw");


		scanner.close();

	}

}
