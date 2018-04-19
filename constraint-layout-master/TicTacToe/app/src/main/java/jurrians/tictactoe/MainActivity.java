package jurrians.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();

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

    }

    public void tileClicked(View view) {

        Log.d("Tic", "tileClicked");

        int id = view.getId();
        Log.d("mainActivity", Integer.toString(id));


        //  vertaling maken van bij welke row/column

        // button 1
        if (id == 2131165220) {
            game.draw(0,0);
        }
        // button 2
        if (id == 2131165221) {
            game.draw(0,1);
        }
        // button3
        if (id == 2131165222) {
            game.draw(0,2);
        }
        // button4
        if (id == 2131165223) {
            game.draw(1,0);
        }
        // button5
        if (id == 2131165224) {
            game.draw(1,1);
        }
        // button6
        if (id == 2131165225) {
            game.draw(1,2);
        }
        // button7
        if (id == 2131165226) {
            game.draw(2,0);
        }
        // button8
        if (id == 2131165227) {
            game.draw(2,1);
        }
        // button9
        if (id == 2131165228) {
            game.draw(2,2);
        }
    }

    public void resetClicked (View view) {
        game = new Game();

        // dont forget to reset UI as well
    }
}
