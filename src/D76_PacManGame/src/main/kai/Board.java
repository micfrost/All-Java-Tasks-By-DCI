package D76_PacManGame.src.main.kai;

import java.util.Arrays;

public class Board {
    public static final char EMPTY_SPACE = ' ';
    private char[][] board;

    public Board(int size) {
        board = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (char[] row : board) {
            Arrays.fill(row, EMPTY_SPACE);
        }
    }

    public void placeEntity(int x, int y, char entity) {
        if (isValidPosition(x, y)) {
            clearPreviousEntity('P');
            board[x][y] = entity;
        } else {
            System.err.println("Invalid entity placement!");
        }
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char symbol : row) {
                char printSymbol = (symbol == 'P') ? 'P' : (symbol == 'G') ? 'G' : (symbol == 'I') ? 'I' : '.';
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

    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
    }
}
