package com.example.jogo_da_velha.Activities;

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
    private static int player;
    public static int imgCircle = R.drawable.imgcircle;
    public static int imgx = R.drawable.ximg;
    private int count = 1;
    private int[][] game = {{0,0,0},{0,0,0},{0,0,0}};
    private int[] WhiteList = {1,2,3,4,5,6,7,8,9};

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



        for(int i = 0; i<9; i++)
        {
            btn[i].setOnClickListener(new click);
        }
    }

    private View.OnClickListener click = new View.OnClickListener (){
        public void Onclick (View v)
        {
            LogicGame logicGame = new LogicGame();
            logicGame.getImage(count, imgx, imgCircle, player);
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
                    if (verifyContent(1, WhiteList)) {
                        btn[0].setText(player);
                        btn[0].setEnable(false);
                    }
                    break;
                case R.id.button2 :
                    if (verifyContent(2 ,WhiteList)) {
                        btn[1].setText(player);
                        btn[1].setEnable(false);
                    }
                    break;
                case R.id.button3 :
                    if (verifyContent(3, WhiteList)){
                        btn[2].setText(player);
                        btn[2].setEnable(false);
                    }

                    break;
                case R.id.button4 :
                    if (verifyContent(4, WhiteList)) {
                        btn[3].setText(player);
                        btn[3].setEnable(false);
                    }
                    break;
                case R.id.button5 :
                    if (verifyContent(5, WhiteList)) {
                        btn[4].setText(player);
                        btn[4].setEnable(false);
                    }
                    break;
                case R.id.button6 :
                    if(verifyContent(6, WhiteList)) {
                        btn[5].setText(player);
                        btn[5].setEnable(false);
                    }
                    break;
                case R.id.button7 :
                    if (verifyContent(7, WhiteList)) {
                        btn[6].setText(player);
                        btn[6].setEnable(false);
                    }
                    break;
                case R.id.button8 :
                    if (verifyContent(8, WhiteList)){
                        btn[7].setText(player);
                        btn[7].setEnable(false);
                    }
                    break;
                case R.id.button9 :
                    if (verifyContent(9, WhiteList)) {
                        btn[8].setText(player);
                        btn[8].setEnable(false);
                    }
                    break;
            }
        }
    }
}
