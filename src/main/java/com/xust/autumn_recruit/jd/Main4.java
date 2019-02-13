package com.xust.autumn_recruit.jd;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] array = new int[n][3];
        for (int i=0;i<n;++i){
            array[i][0] = input.nextInt();
            array[i][1] = input.nextInt();
            array[i][2] = input.nextInt();
        }
        System.out.println(find(array));
    }

    private static int find(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; ++i){
            for (int j = 0;j < array.length; ++j){
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1] && array[i][2] < array[j][2]){
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
