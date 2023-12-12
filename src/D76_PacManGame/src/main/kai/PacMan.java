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

    public void move(String direction, Board board) {
        int[] movement = getMovement(direction);

        int newX = x + movement[0];
        int newY = y + movement[1];

        if (isValidMove(newX, newY, board)) {
            char newPosition = board.getPosition(newX, newY);

            System.out.println("New Position: " + newX + " " + newY); 
            board.placeEntity(newX, newY, '*');
            System.out.println(board.getBoard()[newX][newY]);

            if (newPosition != '#') {
                board.placeEntity(x, y, Board.EMPTY_SPACE); 
                x = newX;
                y = newY;
                board.placeEntity(x, y, 'P'); 

                System.out.println("After movement, position: " + board.getPosition(x, y)); 

                if (newPosition == '.') {
                    board.eatDot(newX, newY);
                	board.placeEntity(newX - 1, newY - 1, '*');
                }

                if (board.getRemainingDots() == 0) {
                    System.out.println("Congratulations! You've eaten all the dots. You win!");
                }
            } else {
                System.err.println("Invalid move! Pac-Man can't move through walls.");
            }
        } else {
            System.err.println("Invalid move! Pac-Man can't move out of the board.");
        }
    }

    
    public int[] getMovement(String direction) {
        return switch (direction.toUpperCase()) {
            case "U" -> new int[]{-1, 0}; 
            case "D" -> new int[]{1, 0}; 
            case "L" -> new int[]{0, -1}; 
            case "R" -> new int[]{0, 1}; 
            default -> {
                System.err.println("Invalid move!");
                yield new int[]{0, 0}; 
            }
        };
    }
    
    private boolean isValidMove(int x, int y, Board board) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }
}
