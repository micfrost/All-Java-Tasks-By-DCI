package D51_TICTACTOE;


import java.util.Scanner;

public class TicTacToeGame {
    private char[][] board;
    private char currentPlayer;
    private int moves;

    public TicTacToeGame() {
        board = new char[3][3];
        currentPlayer = 'X';
        moves = 0;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    private boolean checkWin(int row, int col) {
        // Check row
        for (int i = 0; i < 3; i++) {
            if (board[row][i] != currentPlayer)
                break;
            if (i == 2)
                return true;
        }

        // Check column
        for (int i = 0; i < 3; i++) {
            if (board[i][col] != currentPlayer)
                break;
            if (i == 2)
                return true;
        }

        // Check diagonal
        if (row == col) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != currentPlayer)
                    break;
                if (i == 2)
                    return true;
            }
        }

        // Check anti-diagonal
        if (row + col == 2) {
            for (int i = 0; i < 3; i++) {
                if (board[i][2 - i] != currentPlayer)
                    break;
                if (i == 2)
                    return true;
            }
        }

        return false;
    }

    private boolean isBoardFull() {
        return moves == 9;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Current board:");
            displayBoard();

            System.out.println("Player " + currentPlayer + ", enter your move (row and column, separated by a space): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            moves++;

            if (checkWin(row, col)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }

            switchPlayer();
        }

        System.out.print("Do you want to replay? Type 'yes' to play again or any other input to exit: ");
        String replayChoice = scanner.next();

        if (replayChoice.equals("yes")) {
            initializeBoard();
            currentPlayer = 'X';
            moves = 0;
            playGame();
        } else {
            System.out.println("Thanks for playing!");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.playGame();
    }
}