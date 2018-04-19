
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

        String curVal = "";

        // retrieve current value of board at position (row, column)
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                if (i == row && j == column) {
                    curVal = board[i][j].toString();
                };

        if (curVal.equals("BLANK")) {
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

//        else {
//            return Tile.INVALID;
//        }

        // if place is still blank, we can go ahead and fill it
            // if current plater = 1, fill with cross
            // if current player = 2, fill with circle
            // either case: make sure other player gets the turn
            // both cases: make sure to return Tile.CROSS or TILE.CIRCLE to allow the UI to update
        // if that place isnt blank, its an invalid move! --> return Tile.INVALID
        return Tile.INVALID;
    }


}