package D76_PacManGame.src.main.micfro;

public class PacManGame {

    private char[][] board;
    int row = 9;
    int col = 9;



    public void creatingBoard() {
        board = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = '.';
            }
        }

        for (int c =0; c<col; c++){
            board[0][c] = '-';}
        for (int c =0; c<col; c++){
            board[row-1][c] = '-';}

        for (int r =0; r<row; r++){
            board[r][0] = '|';}
        for (int r =0; r<row; r++){
            board[r][col-1] = '|';}

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        PacManGame pacManGame = new PacManGame();
        pacManGame.creatingBoard();
    }


}
