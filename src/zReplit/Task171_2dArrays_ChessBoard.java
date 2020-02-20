package zReplit;

import java.util.*;

public class Task171_2dArrays_ChessBoard {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            char letters = 'a';
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = "" + (i + 1) + letters;
                letters++;
            }
        }

        System.out.println(Arrays.deepToString(chessBoard));

    }

}
