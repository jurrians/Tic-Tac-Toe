package jurrians.tictactoe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Game game;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    Button buttonReset;

    ImageView cross1;
    ImageView cross2;
    ImageView cross3;
    ImageView cross4;
    ImageView cross5;
    ImageView cross6;
    ImageView cross7;
    ImageView cross8;
    ImageView cross9;

    ImageView circle1;
    ImageView circle2;
    ImageView circle3;
    ImageView circle4;
    ImageView circle5;
    ImageView circle6;
    ImageView circle7;
    ImageView circle8;
    ImageView circle9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonReset = findViewById(R.id.buttonReset);

        cross1 = findViewById(R.id.cross1);
        cross2 = findViewById(R.id.cross2);
        cross3 = findViewById(R.id.cross3);
        cross4 = findViewById(R.id.cross4);
        cross5 = findViewById(R.id.cross5);
        cross6 = findViewById(R.id.cross6);
        cross7 = findViewById(R.id.cross7);
        cross8 = findViewById(R.id.cross8);
        cross9 = findViewById(R.id.cross9);

        circle1 = findViewById(R.id.circle1);
        circle2 = findViewById(R.id.circle2);
        circle3 = findViewById(R.id.circle3);
        circle4 = findViewById(R.id.circle4);
        circle5 = findViewById(R.id.circle5);
        circle6 = findViewById(R.id.circle6);
        circle7 = findViewById(R.id.circle7);
        circle8 = findViewById(R.id.circle8);
        circle9 = findViewById(R.id.circle9);

        game = new Game();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // save game backend
        Tile boardSave[][] = game.getTileState();
        outState.putSerializable("boardSave", boardSave);

        // save player turn
        boolean playerSave = game.playerOneTurn;
        outState.putBoolean("playerSave", playerSave);

        // save UI
        int cross1Value = cross1.getVisibility();
        outState.putInt("cross1", cross1Value);

        int cross2Value = cross2.getVisibility();
        outState.putInt("cross2", cross2Value);

        int cross3Value = cross3.getVisibility();
        outState.putInt("cross3", cross3Value);

        int cross4Value = cross4.getVisibility();
        outState.putInt("cross4", cross4Value);

        int cross5Value = cross5.getVisibility();
        outState.putInt("cross5", cross5Value);

        int cross6Value = cross6.getVisibility();
        outState.putInt("cross6", cross6Value);

        int cross7Value = cross7.getVisibility();
        outState.putInt("cross7", cross7Value);

        int cross8Value = cross8.getVisibility();
        outState.putInt("cross8", cross8Value);

        int cross9Value = cross9.getVisibility();
        outState.putInt("cross9", cross9Value);


        int circle1Value = circle1.getVisibility();
        outState.putInt("circle1", circle1Value);

        int circle2Value = circle2.getVisibility();
        outState.putInt("circle2", circle2Value);

        int circle3Value = circle3.getVisibility();
        outState.putInt("circle3", circle3Value);

        int circle4Value = circle4.getVisibility();
        outState.putInt("circle4", circle4Value);

        int circle5Value = circle5.getVisibility();
        outState.putInt("circle5", circle5Value);

        int circle6Value = circle6.getVisibility();
        outState.putInt("circle6", circle6Value);

        int circle7Value = circle7.getVisibility();
        outState.putInt("circle7", circle7Value);

        int circle8Value = circle8.getVisibility();
        outState.putInt("circle8", circle8Value);

        int circle9Value = circle9.getVisibility();
        outState.putInt("circle9", circle9Value);

    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        // restore player turn
        game.playerOneTurn = inState.getBoolean("playerSave");

        // restore game backend
        Tile[][] tiles = (Tile[][]) inState.getSerializable("boardSave");
        game.board = game.putTileState(tiles);

        // restore UI
        int cross1ValueRes = inState.getInt("cross1");
        cross1.setVisibility(cross1ValueRes);

        int cross2ValueRes = inState.getInt("cross2");
        cross2.setVisibility(cross2ValueRes);

        int cross3ValueRes = inState.getInt("cross3");
        cross3.setVisibility(cross3ValueRes);

        int cross4ValueRes = inState.getInt("cross4");
        cross4.setVisibility(cross4ValueRes);

        int cross5ValueRes = inState.getInt("cross5");
        cross5.setVisibility(cross5ValueRes);

        int cross6ValueRes = inState.getInt("cross6");
        cross6.setVisibility(cross6ValueRes);

        int cross7ValueRes = inState.getInt("cross7");
        cross7.setVisibility(cross7ValueRes);

        int cross8ValueRes = inState.getInt("cross8");
        cross8.setVisibility(cross8ValueRes);

        int cross9ValueRes = inState.getInt("cross9");
        cross9.setVisibility(cross9ValueRes);


        int circle1ValueRes = inState.getInt("circle1");
        circle1.setVisibility(circle1ValueRes);

        int circle2ValueRes = inState.getInt("circle2");
        circle2.setVisibility(circle2ValueRes);

        int circle3ValueRes = inState.getInt("circle3");
        circle3.setVisibility(circle3ValueRes);

        int circle4ValueRes = inState.getInt("circle4");
        circle4.setVisibility(circle4ValueRes);

        int circle5ValueRes = inState.getInt("circle5");
        circle5.setVisibility(circle5ValueRes);

        int circle6ValueRes = inState.getInt("circle6");
        circle6.setVisibility(circle6ValueRes);

        int circle7ValueRes = inState.getInt("circle7");
        circle7.setVisibility(circle7ValueRes);

        int circle8ValueRes = inState.getInt("circle8");
        circle8.setVisibility(circle8ValueRes);

        int circle9ValueRes = inState.getInt("circle9");
        circle9.setVisibility(circle9ValueRes);

    }

    public void tileClicked(View view) {

        Log.d("Tic", "tileClicked");

        Tile tile;

        int id = view.getId();

        // button 1
        if (id == 2131165220) {
            tile = game.draw(0,0);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross1.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle1.setVisibility(View.VISIBLE);

                    break;
                case INVALID:
                    break;
            }
        }
        // button 2
        if (id == 2131165221) {
            tile = game.draw(0,1);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross2.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle2.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button3
        if (id == 2131165222) {
            tile = game.draw(0,2);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross3.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle3.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button4
        if (id == 2131165223) {
            tile = game.draw(1,0);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross4.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle4.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button5
        if (id == 2131165224) {
            tile = game.draw(1,1);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross5.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle5.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button6
        if (id == 2131165225) {
            tile = game.draw(1,2);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross6.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle6.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button7
        if (id == 2131165226) {
            tile = game.draw(2,0);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross7.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle7.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button8
        if (id == 2131165227) {
            tile = game.draw(2,1);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross8.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle8.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
        // button9
        if (id == 2131165228) {
            tile = game.draw(2,2);

            switch(tile) {
                case CROSS:
                    // cross visible maken
                    cross9.setVisibility(View.VISIBLE);
                    break;
                case CIRCLE:
                    // circle visible maken
                    circle9.setVisibility(View.VISIBLE);
                    break;
                case INVALID:
                    // do something different
                    break;
            }
        }
    }

    public void resetClicked (View view) {
        // reset game
        game = new Game();

        // reset UI
        cross1.setVisibility(View.INVISIBLE);
        cross2.setVisibility(View.INVISIBLE);
        cross3.setVisibility(View.INVISIBLE);
        cross4.setVisibility(View.INVISIBLE);
        cross5.setVisibility(View.INVISIBLE);
        cross6.setVisibility(View.INVISIBLE);
        cross7.setVisibility(View.INVISIBLE);
        cross8.setVisibility(View.INVISIBLE);
        cross9.setVisibility(View.INVISIBLE);

        circle1.setVisibility(View.INVISIBLE);
        circle2.setVisibility(View.INVISIBLE);
        circle3.setVisibility(View.INVISIBLE);
        circle4.setVisibility(View.INVISIBLE);
        circle5.setVisibility(View.INVISIBLE);
        circle6.setVisibility(View.INVISIBLE);
        circle7.setVisibility(View.INVISIBLE);
        circle8.setVisibility(View.INVISIBLE);
        circle9.setVisibility(View.INVISIBLE);

    }
}
