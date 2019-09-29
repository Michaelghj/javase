package com.ghj.codes03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 五子棋
 */
public class Gobang {
    //定义棋盘的大小
    private static int BOARD_SIZE = 15;
    //定义一个二维数组来充当棋盘
    private String[][] board;
    public void initBoard(){
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++){
            for (int j = 0; j < BOARD_SIZE; j++){
                board[i][j] = "+";
            }
        }
    }
    //在控制台输出棋盘的方法
    public void printBoard(){
        //打印每个数组
        for (int i = 0; i < BOARD_SIZE ; i++){
            for (int j = 0; j < BOARD_SIZE; j++){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputstr = null;
        while ((inputstr = br.readLine()) != null){
            String[] posStrArr = inputstr.split(",");
            int xpos = Integer.parseInt(posStrArr[0]);
            int ypos = Integer.parseInt(posStrArr[1]);
            gb.board[ypos-1][xpos-1] = "·";
            gb.printBoard();
            System.out.println("请您输入下棋的坐标");
        }
    }
}
