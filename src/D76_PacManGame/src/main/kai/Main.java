package D76_PacManGame.src.main.kai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int BOARD_SIZE = 10;
        final int NUM_GHOSTS = 3;
        boolean gameOver = false;

        Board board = new Board(BOARD_SIZE);
        PacMan pacMan = new PacMan(BOARD_SIZE / 2, BOARD_SIZE / 2, BOARD_SIZE);
        Ghosts ghosts = new Ghosts(board, NUM_GHOSTS);

        board.placeEntity(pacMan.getX(), pacMan.getY(), 'P');
        ghosts.placeGhosts();

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            board.printBoard();

            System.out.println("\nEnter your move (U = UP, D = Down, L = Left, R = Right): ");
            String move = scanner.nextLine().toUpperCase();

            pacMan.move(move);
            board.placeEntity(pacMan.getX(), pacMan.getY(), 'P');

            gameOver = ghosts.moveGhosts(pacMan.getX(), pacMan.getY()); 

            if (gameOver) {
                System.out.println("Game Over!");
                break;
            }
        }

        scanner.close();
    }
}
