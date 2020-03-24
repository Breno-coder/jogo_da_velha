package com.example.jogo_da_velha.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.jogo_da_velha.Models.LogicGame;

import com.example.jogo_da_velha.R;

public class MainActivity extends AppCompatActivity {

    private Button[] btn;
    private Button btnReset;
    private TextView result;
    private char player;
    private int turn = 0;
    private int count = 1;
    private int[][] game = {{0,0,0},{0,0,0},{0,0,0}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = findViewById(R.id.button1);
        btn[1] = findViewById(R.id.button2);
        btn[2] = findViewById(R.id.button3);
        btn[3] = findViewById(R.id.button4);
        btn[4] = findViewById(R.id.button5);
        btn[5] = findViewById(R.id.button6);
        btn[6] = findViewById(R.id.button7);
        btn[7] = findViewById(R.id.button8);
        btn[8] = findViewById(R.id.button9);
        result = findViewById(R.id.textView);
        btnReset = findViewById(R.id.buttonReset);

        btnReset.setOnClickListener(resetClick);

        for(count = 0; count<9; count++)
        {
            btn[count].setOnClickListener(CLICKING);
        }
    }

    private View.OnClickListener CLICKING = new View.OnClickListener ()
    {
        @Override
        public void onClick (View v)
        {
            LogicGame logicGame = new LogicGame();
            getImage(count);
            if (logicGame.verifyWinner(game, count) == true)
            {
                if (count % 2 == 0)
                {
                    result.setText("Jogator X ganhou");
                }else if(count == 9)
                {
                    result.setText("Deu Velha");
                }else {
                    result.setText("Jogador O ganhou");
                }
            }
            switch (v.getId())
            {
                case R.id.button1 :
                        btn[0].setText(player);
                        btn[0].setEnabled(false);
                        game[0][0] = 1;
                    break;
                case R.id.button2 :
                        btn[1].setText(player);
                        btn[1].setEnabled(false);
                        game[0][1] = 1;
                    break;
                case R.id.button3 :
                        btn[2].setText(player);
                        btn[2].setEnabled(false);
                        game[0][2] = 1;
                    break;
                case R.id.button4 :
                        btn[3].setText(player);
                        btn[3].setEnabled(false);
                        game[1][0] = 1;
                    break;
                case R.id.button5 :
                        btn[4].setText(player);
                        btn[4].setEnabled(false);
                        game[1][1] = 1;
                    break;
                case R.id.button6 :
                        btn[5].setText(player);
                        btn[5].setEnabled(false);
                        game[1][2] = 1;
                    break;
                case R.id.button7 :
                        btn[6].setText(player);
                        btn[6].setEnabled(false);
                        game[2][0] = 1;
                    break;
                case R.id.button8 :
                        btn[7].setText(player);
                        btn[7].setEnabled(false);
                        game[2][1] = 1;
                    break;
                case R.id.button9 :
                        btn[8].setText(player);
                        btn[8].setEnabled(false);
                        game[2][2] = 1;
                    break;
            }
        }
    };

    private  View.OnClickListener resetClick = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            Intent currentlyView = new Intent(MainActivity.this, MainActivity.class);
            startActivity(currentlyView);
        }
    };

    public void getImage(int count)
    {
        if (count%2 == 0)
        {
            this.player = 'O';
            this.turn = 2;
        }
        else {
            this.player = 'X';
            this.turn = 1;
        }
    }
}
