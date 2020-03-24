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
                if(game[0][i] != 0 && game[1][i] != 0 && game[2][i] != 0)
                {
                    return true;
                }
                else if(game[i][0] != 0 && game[i][1] != 0 && game[i][2] != 0)
                {
                    return true;
                }
            }

            if(game[0][0] != 0 && game[1][1] != 0 && game[2][2] != 0)
            {
                return true;
            }
            else if(game[0][2] != 0 && game[1][1] != 0 && game[2][0] != 0)
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
