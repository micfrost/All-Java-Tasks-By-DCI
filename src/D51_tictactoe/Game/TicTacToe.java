package D51_tictactoe.Game;

import java.util.Scanner;

public class TicTacToe {

    private Scanner scanner = new Scanner(System.in);
    private String player1Name;
    private String player2Name;
    private String currentPlayerName;
    private char[][] table = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    private char player1 = 'X';
    private char player2 = 'O';
    private char currentPlayer = player1;
    private int numberOfMarks = 0;

    public void userInterface() {
        System.out.println("Welcome to TicTacToe");
        System.out.println("Enter a name of a player 1: ");
        player1Name = scanner.nextLine();
        System.out.println("Hello " + player1Name + " you are playing with a mark: \"X\".");
        System.out.println();

        System.out.println("Enter a name of a player 2: ");
        player2Name = scanner.nextLine();
        System.out.println("Hello " + player2Name + " you are playing with a mark: \"O\".");
        System.out.println();
        drawATable();
        currentPlayerName = player1Name;

        while (!checkWin() && numberOfMarks < 9) {
            drawMark();
            if (checkWin()) {
                break;
            }
            changeTurn();
        }

        if (checkWin()) {
            System.out.println(currentPlayerName + " won.");
        } else {
            System.out.println("It's a draw.");
        }

        System.out.println("End of the game.");
    }


    void drawATable() {
        System.out.println("Current Table: ");
        for (char[] row : table) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
        System.out.println();
    }

    void drawMark() {
        int row;
        int column;
        while (true) {

            System.out.println(currentPlayerName + " enter the row and column coordinates separated by a space.");
            String inputString = scanner.nextLine();
            String[] inputArray = inputString.split(" ");
            row = Integer.parseInt(inputArray[0]);
            column = Integer.parseInt(inputArray[1]);

            if (table[row][column] != '-') {
                System.out.println("You can not put a mark here. Please try again.");
                continue;
            }
            table[row][column] = currentPlayer;
            drawATable();
            numberOfMarks++;
            break;
        }
    }

    void changeTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
            currentPlayerName = player2Name;
        } else {
            currentPlayer = player1;
            currentPlayerName = player1Name;
        }
    }

    boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (table[i][0] == currentPlayer && table[i][1] == currentPlayer && table[i][2] == currentPlayer)
                return true;
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (table[0][i] == currentPlayer && table[1][i] == currentPlayer && table[2][i] == currentPlayer)
                return true;
        }

        // Check diagonals
        if (table[0][0] == currentPlayer && table[1][1] == currentPlayer && table[2][2] == currentPlayer)
            return true;
        if (table[0][2] == currentPlayer && table[1][1] == currentPlayer && table[2][0] == currentPlayer)
            return true;

        return false;
    }

}
