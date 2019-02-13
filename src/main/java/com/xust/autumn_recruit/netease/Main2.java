package com.xust.autumn_recruit.netease;

import java.util.Scanner;

public class Main2 {
    private static int max(int i, int j) {
        int result = 0;
        if (i < 3 || j < 2 || i == j){
            return result;
        }
        if (j>(i+1)/2){
            result = i-j;
        }else {
            result = j-1;
        }
        return result;
    }
    private static int min(int i, int j) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int[][] array = new int[m][2];
        int[][] reslut = new int[m][2];
        for (int i = 0; i < array.length; ++i) {
            array[i][0] = input.nextInt();
            array[i][1] = input.nextInt();
        }

        for (int i = 0; i < array.length; ++i) {
            reslut[i][0] = min(array[i][0], array[i][1]);
            reslut[i][1] = max(array[i][0], array[i][1]);
        }
        for (int i = 0; i < array.length; ++i) {
            System.out.println(reslut[i][0]+" "+reslut[i][1]);
        }
    }
}
