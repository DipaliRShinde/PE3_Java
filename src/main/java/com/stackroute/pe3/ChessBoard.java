package com.stackroute.pe3;

import java.util.Arrays;
public class ChessBoard {
    public static void main(String args[])
    {
        ChessBoard.chessBoard();
    }

    public static void chessBoard()
    {
        String chess[][]=new String[8][4];
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                if(i%2==0) {
                    chess[i][j]="WW" + "|" + "BB" + "|";
                }
                else {
                    chess[i][j]="BB" + "|" + "WW" + "|";
                }
            }
        }

        for (int i=0;i<8;i++)
        {
            for(int j=0;j<4;j++) {
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }
}
