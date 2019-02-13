package com.xust.autumn_recruit.didi;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[t][2];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int a = arr[i][0];
            int b = arr[i][1];

            int temp1 = a, temp2 = a;
            int value1 =1, value2 = 1, value3 = 1;
            for (int j = 0; j < b; j++) {
                value1 *= temp1;
                temp1--;
            }

            for (int j = 0; j < (b + 1); j++) {
                value2 *= temp2;
                temp2--;
            }

            for (int j = 1; j <= (b + 1); j++) {
                value3 *= j;
            }

            if (a == 2) {
                System.out.println(2);
            }else {
                System.out.println(value1 - value2 / value3);
            }
        }
    }
}
