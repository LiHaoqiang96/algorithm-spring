package com.xust.autumn_recruit.toutiao.time3;

import java.util.Scanner;

public class Main2 {
    public static void fun(int[][] array, int i, int j) {
        array[i][j] = 2;
        if (i - 1 >= 0 && array[i - 1][j] == 1)
            fun(array,i - 1, j);

        if (i + 1 < array.length && array[i + 1][j] == 1)
            fun(array,i + 1, j);

        if (j - 1 >= 0 && array[i][j - 1] == 1)
            fun(array,i, j - 1);

        if (j + 1 < array[i].length && array[i][j + 1] == 1)
            fun(array,i - 1, j + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = input.nextInt();
            }
        }
        int num = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (array[i][j] == 1) {
                    num++;
                    fun(array, i, j);
                }
        System.out.println(num);
    }
}
