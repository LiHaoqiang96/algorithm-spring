package com.xust.autumn_recruit.tencent;

import java.util.Scanner;

public class Main2 {
    public static void fun(int[][] array, int[][] array2) {
        int number = 0;
        for (int i = 1; i < array2.length; i++) {
            int count = 0;
            if(array2[1][i] == 1){
                for (int j = 0; j < array.length; j++) {
                    if(array[0][j] == i){
                        count++;
                    }
                }
                if(count != 0){
                    number++;
                }
            }
        }
        System.out.println(number);
    }
    public static void main(String[] args) {
        Boolean bool = new Boolean(true);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[2][m];
        int[][] array2 = new int[2][n+1];
        if (bool == true) {
            bool = false;
        }
        for (int i = 0; i < array[0].length; i++) {
            array[0][i] = input.nextInt();
            array[1][i] = input.nextInt();
        }
        for (int i = 0; i < array[0].length; i++) {
            array2[1][array[1][i]]++;
        }
        if (bool == false) {
            bool = true;
        }
        fun(array, array2);
    }
}
