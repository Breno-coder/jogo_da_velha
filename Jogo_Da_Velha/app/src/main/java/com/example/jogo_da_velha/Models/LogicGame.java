package com.example.jogo_da_velha.Models;

import android.media.Image;
import android.view.View;

import com.example.jogo_da_velha.R;

public class LogicGame {
    public boolean verifyWinner(int[][] game, int count)
    {
        if (count < 9)
        {
            for(int i=0; i<3; i++)
            {
                if(game[0][i] == 1 && game[1][i] == 1 && game[2][i] == 1)
                {
                    return true;
                }
                else if(game[i][0] == 1 && game[i][1] == 1 && game[i][2] == 1)
                {
                    return true;
                }
            }

            if(game[0][0] == 1 && game[1][1] == 1 && game[2][2] == 1)
            {
                return true;
            }
            else if(game[0][2] == 1 && game[1][1] == 1 && game[2][0] == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
