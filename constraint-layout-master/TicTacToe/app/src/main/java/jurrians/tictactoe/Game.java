package jurrians.tictactoe;

import android.view.View;

import java.io.Serializable;

import static jurrians.tictactoe.Tile.BLANK;
import static jurrians.tictactoe.Tile.CIRCLE;
import static jurrians.tictactoe.Tile.CROSS;
import static jurrians.tictactoe.Tile.INVALID;

public class Game implements Serializable {

    final public int BOARD_SIZE = 3;
    public Tile[][] board;

    public Tile[][] boardSave;

    public boolean playerOneTurn; // true if players 1's turn, false if player 2
    private int movesPlayed;
    private boolean gameOver;


    public Game() {

        board = new Tile[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public Tile draw(int row, int column) {

        Tile curVal = board[row][column];
//
        if (curVal == BLANK) {
            if (playerOneTurn) {
                board[row][column] = CROSS;
                playerOneTurn = false;
                return CROSS;

            }
            if (!playerOneTurn) {
                board[row][column] = CIRCLE;
                playerOneTurn = true;
                return CIRCLE;
            }
        }

        else {
            return INVALID;
        }

        return INVALID;
    }

    public Tile[][] getTileState() {

        boardSave = new Tile[BOARD_SIZE][BOARD_SIZE];

        // add method to class to ensure that you can find the state of each tile
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)

                switch(board[i][j]) {
                    case CROSS:
                        boardSave[i][j] = Tile.CROSS;
                        break;
                    case CIRCLE:
                        boardSave[i][j] = Tile.CIRCLE;
                        break;
                    case BLANK:
                        boardSave[i][j] = BLANK;
                        break;
                }

        return boardSave;
    }

    public Tile[][] putTileState(Tile[][] boardSave) {

        Tile boardRes[][] = new Tile[BOARD_SIZE][BOARD_SIZE];

        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                boardRes[i][j] = boardSave[i][j];
                return boardRes;
    }

}

