package D76_PacManGame.src.main.A;

import java.util.Scanner;
import java.util.Random;

public class PacmanGame {
    private char[][] board = {
            "###############".toCharArray(),
            "#.............#".toCharArray(),
            "#.###.###.###.#".toCharArray(),
            "#.#G#.#.#.#G#.#".toCharArray(),
            "#.###.#.#.###.#".toCharArray(),
            "#.....#P#.....#".toCharArray(),
            "###############".toCharArray()
    };

    private int score = 0;
    private boolean gameOver = false;
    private int[] pacmanPos = {5, 7};
    private int[][] ghosts = {{2, 3}, {2, 11}, {4, 7}, {4, 7}};
    private int[][] powerUps = {{1, 7}};

    private void printBoard() {
        for (char[] row : board) {
            System.out.println(new String(row));
        }
    }

    private void movePacman(char direction) {
        int x = pacmanPos[0];
        int y = pacmanPos[1];

        switch (direction) {
            case 'U':
                if (board[x - 1][y] != '#') {
                    x--;
                }
                break;
            case 'D':
                if (board[x + 1][y] != '#') {
                    x++;
                }
                break;
            case 'L':
                if (board[x][y - 1] != '#') {
                    y--;
                }
                break;
            case 'R':
                if (board[x][y + 1] != '#') {
                    y++;
                }
                break;
        }

        handleMoveResult(x, y);
        pacmanPos[0] = x;
        pacmanPos[1] = y;
    }

    private void handleMoveResult(int x, int y) {
        if (board[x][y] == '.') {
            score++;
        } else if (board[x][y] == '*') {
            score += 10;
            for (int[] powerUp : powerUps) {
                if (powerUp[0] == x && powerUp[1] == y) {
                    powerUp[0] = -1;
                    powerUp[1] = -1;
                    break;
                }
            }
        } else if (board[x][y] == 'G') {
            gameOver = true;
        }
    }

    private void moveGhosts() {
        Random random = new Random();
        for (int i = 0; i < ghosts.length; i++) {
            int[] ghost = ghosts[i];
            int x = ghost[0];
            int y = ghost[1];

            int direction = random.nextInt(4);

            switch (direction) {
                case 0:
                    if (board[x - 1][y] != '#') {
                        x--;
                    }
                    break;
                case 1:
                    if (board[x + 1][y] != '#') {
                        x++;
                    }
                    break;
                case 2:
                    if (board[x][y - 1] != '#') {
                        y--;
                    }
                    break;
                case 3:
                    if (board[x][y + 1] != '#') {
                        y++;
                    }
                    break;
            }

            ghosts[i][0] = x;
            ghosts[i][1] = y;

            if (x == pacmanPos[0] && y == pacmanPos[1]) {
                gameOver = true;
            }
        }
    }

    private void runGame() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            System.out.println("Score: " + score);
            System.out.print("Enter direction (U/D/L/R): ");
            char direction = scanner.nextLine().toUpperCase().charAt(0);

            movePacman(direction);
            moveGhosts();
        }

        System.out.println("Game Over! Final Score: " + score);
    }

    public static void main(String[] args) {
        PacmanGame game = new PacmanGame();
        game.runGame();
    }
}
