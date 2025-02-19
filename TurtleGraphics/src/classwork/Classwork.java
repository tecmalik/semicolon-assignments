package classwork;

import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
    String[][] board = {
            {"x","0","x"},
            {"x","x","0"},
            {"x","0","0"}
    };

        System.out.print(Arrays.deepToString(replaceX(board)));
        System.out.println();

        for(int count = 0; count < board.length; count++ ){
            for(int index = 0; index < board[count].length; index++){
                System.out.print(replaceX(board)[count][index]+"  ");
            }
            System.out.println();
        }

    }
    public static int[][] replaceX(String[][] board){
        int[][] newCharacters = new int[board.length][board.length];
        for(int count = 0; count < board.length; count++ ){
            for(int index = 0; index < board[count].length; index++){
                if(board[count][index].equals("x")) newCharacters[count][index] = 1;
                if(board[count][index].equals("0")) newCharacters[count][index] = 0;
            }
        }
        return newCharacters;
    }
}
