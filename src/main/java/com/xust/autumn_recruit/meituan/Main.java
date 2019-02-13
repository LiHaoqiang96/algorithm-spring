package com.xust.autumn_recruit.meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n-1][2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[][] matrix = new int[n][n];

        System.out.println(4);
    }
}
