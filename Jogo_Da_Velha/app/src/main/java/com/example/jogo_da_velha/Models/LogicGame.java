package com.example.jogo_da_velha.Models;

import android.media.Image;
import android.view.View;

import com.example.jogo_da_velha.R;

public class LogicGame {

    public void getImage(int count, int x, int circle, int player)
    {
        if (count%2 == 0)
        {
            player = x;
        }
        else {
            player = circle;
        }
    }

    public boolean verifyContent(int btn, int[] WhiteList)
    {
        for (int i = 0; i <= WhiteList.length; i++)
        {
            if (WhiteList[i] == btn)
            {
                WhiteList[i] = 0;
                return true;
            }
        }
        return false;
    }

    public boolean verifyWinner(int[][] matriz, int count)
    {
        if (count < 9)
        {
            for(int i=0; i<3; i++)
            {
                if(matriz[0][i] == 1 && matriz[1][i] == 1 && matriz[2][i] == 1)
                {
                    return true;
                }else if(matriz[i][0] == 1 && matriz[i][1] == 1 && matriz[i][2] == 1)
                {
                    return true;
                }
            }

            if(matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1)
            {
                return true;
            }else if(matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1)
            {
                return true;
            }
        }
        return false;
    }
}
