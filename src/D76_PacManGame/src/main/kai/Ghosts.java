package D76_PacManGame.src.main.kai;

import java.util.Random;

public class Ghosts {

    private int numGhosts;
    private int boardSize;
    private char[][] board;
    private Random random;
    private final char EMPTY_SPACE;
    private int[] ghostX;
    private int[] ghostY;

    public Ghosts(Board gameBoard, int numGhosts) {
        this.board = gameBoard.getBoard();
        this.boardSize = gameBoard.getSize();
        this.numGhosts = numGhosts;
        this.random = new Random();
        this.EMPTY_SPACE = Board.EMPTY_SPACE;
        this.ghostX = new int[numGhosts];
        this.ghostY = new int[numGhosts];
    }

    public void placeGhosts() {
        for (int i = 0; i < numGhosts; i++) {
            int x, y;
            do {
                x = random.nextInt(boardSize);
                y = random.nextInt(boardSize);
            } while (board[x][y] != Board.EMPTY_SPACE);

            board[x][y] = 'G';
            ghostX[i] = x;
            ghostY[i] = y;
        }
    }

    public boolean moveGhosts(int pacManX, int pacManY) {
        for (int i = 0; i < numGhosts; i++) {
            int direction = random.nextInt(4);
            int newX = ghostX[i] + (direction == 0 ? -1 : (direction == 1 ? 1 : 0));
            int newY = ghostY[i] + (direction == 2 ? -1 : (direction == 3 ? 1 : 0));

            if (isValidMove(newX, newY)) {
                if (newX == pacManX && newY == pacManY) {
                    System.out.println("Ghost caught Pac-Man!");
                    return true; 
                } else {
                    if (board[pacManX][pacManY] != 'G') {
                        board[ghostX[i]][ghostY[i]] = Board.EMPTY_SPACE;
                        board[newX][newY] = 'G';
                        ghostX[i] = newX;
                        ghostY[i] = newY;
                    } else {
                        System.out.println("Pac-Man ate a ghost!");
                        board[ghostX[i]][ghostY[i]] = Board.EMPTY_SPACE;
                        ghostX[i] = -1; // Set the ghost's position to an invalid state
                        ghostY[i] = -1;
                    }
                }
            }
        }
        return false;
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < boardSize && y >= 0 && y < boardSize && board[x][y] == ' ';
    }

    public int getNumGhosts() {
        return numGhosts;
    }

    public int getGhostX(int index) {
        return (index >= 0 && index < numGhosts) ? ghostX[index] : -1;
    }

    public int getGhostY(int index) {
        return (index >= 0 && index < numGhosts) ? ghostY[index] : -1;
    }
}
