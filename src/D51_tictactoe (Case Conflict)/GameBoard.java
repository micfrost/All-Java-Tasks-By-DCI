package D51_tictactoe;

public class GameBoard {
	char symbol = ' ';
	
	// 2D Array to create the Game Board
	char[][] gameBoard = {
			{ ' ', '|', ' ', '|', ' '},
			{ '+', '-', '+', '-', '+'},
			{ ' ', '|', ' ', '|', ' '},
			{'+', '-', '+', '-', '+'},
			{' ', '|', ' ', '|', ' '},
			};
	
	public void printGameBoard() {
		for(int i = 0; i < gameBoard.length; i++) {
			for(int j = 0; j < gameBoard[0].length; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
		
	}
	
	// This method prints the Board to the console after each User plays
	public void printGameBoardAfterChoice(int choice, String user) {
		
		if(user.equals("player")) {
			symbol = 'x';
		} else if (user.equals("computer")) {
			symbol = 'o';
		}
		
		switch(choice) {
		
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;
			
		}
		printGameBoard();
	}
	
	// This checks whether a user has won the Game.
	boolean isWinner() {
		if (gameBoard[0][0] == symbol && gameBoard[0][2] == symbol && gameBoard[0][4] == symbol) return true;
		if (gameBoard[2][0] == symbol && gameBoard[2][2] == symbol && gameBoard[2][4] == symbol) return true;
		if (gameBoard[4][0] == symbol && gameBoard[4][2] == symbol && gameBoard[4][4] == symbol) return true;
		if (gameBoard[0][0] == symbol && gameBoard[2][0] == symbol && gameBoard[4][0] == symbol) return true;
		if (gameBoard[0][4] == symbol && gameBoard[2][4] == symbol && gameBoard[4][4] == symbol) return true;
		if (gameBoard[0][0] == symbol && gameBoard[2][2] == symbol && gameBoard[4][4] == symbol) return true;
		if (gameBoard[0][4] == symbol && gameBoard[2][2] == symbol && gameBoard[4][0] == symbol) return true;
		
		return false;
		
	}

}
