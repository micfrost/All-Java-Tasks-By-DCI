package D76_PacManGame.src.main.kai;

import java.util.Arrays;

public class Board {
    public static final char EMPTY_SPACE = ' ';
    public static final char DOT = '.';
    private char[][] board;
    private int remainingDots;

    public Board(int size) {
        board = new char[size][size];
        initializeBoard();
        remainingDots = size * size;
    }

    private void initializeBoard() {
        for (char[] row : board) {
            Arrays.fill(row, EMPTY_SPACE);
        }
    }

    public void placeEntity(int x, int y, char entity) {
        if (isValidPosition(x, y)) {
            if (entity == 'P') {
                clearPreviousEntity('P');
                board[x][y] = 'P';
            } else {
                board[x][y] = entity;
            }
        } else {
            System.err.println("Invalid entity placement!");
        }
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char symbol : row) {
                char printSymbol;
                if (symbol == 'P') {
                    printSymbol = 'P';
                } else if (symbol == 'G') {
                    printSymbol = 'G';
                } else if (symbol == 'I') {
                    printSymbol = 'I';
                } else if (symbol == '*'){
                	printSymbol = '*';
                } else {
                	printSymbol = '.';
                }
					/*
					 * if (symbol == '.'){ printSymbol = (symbol == '.') ? '.' : '*'; } else {
					 * printSymbol = '*'; }
					 */
                
                System.out.print(printSymbol + " ");
            }
            System.out.println();
        }
    }


    private void clearPreviousEntity(char entity) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == entity) {
                    board[i][j] = EMPTY_SPACE;
                    return;
                }
            }
        }
    }

    public void eatDot(int x, int y) {
        if (isValidPosition(x, y) && board[x][y] == '.') {
            System.out.println("Eating dot at position: " + x + ", " + y);
            board[x][y] = '*';
            remainingDots--;

            if (remainingDots == 0) {
                System.out.println("Congratulations! You have won the game!");
            }
        }
    }


    public char getPacManPosition(int x, int y) {
        return board[x][y];
    }

    public char[][] getBoard() {
        return board;
    }

    public int getSize() {
        return board.length;
    }

    public char getPosition(int x, int y) {
        return board[x][y];
    }
    
    public int getRemainingDots() {
        return remainingDots;
    }


    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
    }

	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + ", remainingDots=" + remainingDots + "]";
	}


    
    
}
