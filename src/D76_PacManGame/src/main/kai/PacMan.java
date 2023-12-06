package D76_PacManGame.src.main.kai;

public class PacMan {
    private int x;
    private int y;
    private final int BOARD_SIZE;

    public PacMan(int x, int y, int boardSize) {
        this.x = x;
        this.y = y;
        this.BOARD_SIZE = boardSize;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(String direction) {
        switch (direction.toUpperCase()) {
            case "U" -> movePlayer(-1, 0);
            case "D" -> movePlayer(1, 0);
            case "L" -> movePlayer(0, -1);
            case "R" -> movePlayer(0, 1);
            default -> System.err.println("Invalid move!");
        }
    }

    private void movePlayer(int moveX, int moveY) {
        int newX = x + moveX;
        int newY = y + moveY;
        if (isValidMove(newX, newY)) {
            x = newX;
            y = newY;
        } else {
            System.err.println("Invalid move!");
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }
}
