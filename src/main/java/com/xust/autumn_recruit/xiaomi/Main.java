package com.xust.autumn_recruit.xiaomi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        int[][] array = new int[t][2];
        for (int i = 0; i < t; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            if (array[i][0] == 1) {
                String temp = "";
                for (int j = n - array[i][1]; j < n; j++) {
                    temp += str.charAt(j);
                }
                for (int j = 0; j < n - array[i][1]; j++) {
                    temp += str.charAt(j);
                }
                str = temp;
            }
            if (array[i][0] == 2) {
                System.out.println(str.charAt(array[i][1]));
            }
        }
    }
}
