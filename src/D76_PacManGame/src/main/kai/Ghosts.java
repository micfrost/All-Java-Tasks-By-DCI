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
            int ghostX = this.ghostX[i];
            int ghostY = this.ghostY[i];

            int distX = pacManX - ghostX;
            int distY = pacManY - ghostY;

            if (Math.abs(distX) > Math.abs(distY)) {
                // Move horizontally
                int newX = ghostX + Integer.compare(distX, 0);
                int newY = ghostY;
                
                if (isValidMove(newX, newY)) {
                    moveGhost(i, newX, newY);
                }
            } else {
                // Move vertically
                int newX = ghostX;
                int newY = ghostY + Integer.compare(distY, 0);
                
                if (isValidMove(newX, newY)) {
                    moveGhost(i, newX, newY);
                }
            }

            if (this.ghostX[i] == pacManX && this.ghostY[i] == pacManY) {
                System.out.println("Ghost caught Pac-Man!");
                return true; 
            }
        }
        return false;
    }

    private void moveGhost(int index, int newX, int newY) {
        board[ghostX[index]][ghostY[index]] = Board.EMPTY_SPACE;
        board[newX][newY] = 'G';
        ghostX[index] = newX;
        ghostY[index] = newY;
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
