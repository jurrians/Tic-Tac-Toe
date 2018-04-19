package jurrians.tictactoe;

public class Game {

    final private int BOARD_SIZE = 3;
    private Tile[][] board;

    private boolean playerOneTurn; // true if players 1's turn, false if player 2
    private int movesPlayed;
    private boolean gameOver;


    public Game() {

        board = new Tile[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = Tile.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public Tile draw(int row, int column) {

        Tile curVal = board[row][column];
//
        if (curVal == Tile.BLANK) {
            if (playerOneTurn) {
                board[row][column] = Tile.CROSS;
                playerOneTurn = false;
                return Tile.CROSS;

            }
            if (!playerOneTurn) {
                board[row][column] = Tile.CIRCLE;
                playerOneTurn = true;
                return Tile.CIRCLE;
            }
        }


        return Tile.INVALID;
    }


}
