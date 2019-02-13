package com.xust.autumn_recruit.tencent;

import java.util.Scanner;

public class Main3{
    public static String[] fun(int[][] array) {
        Boolean bool = new Boolean(false);
        String [] s = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            int j = 1;
            if (bool == false) {
                bool = true;
            }
            while(j < 100) {
                int res = j * array[i][0];
                if(res % array[i][1] == array[i][2]) {
                    s[i] = "YES";
                    break;
                } else {
                    s[i] = "NO";
                }
                j++;
            }
        }
        return s;
    }

    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        int t = input.nextInt();
        int[][] array = new int[t][3];
        for(int i = 0; i < t; i++) {
            if (bool == true) {
                bool = false;
            }
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        String[] result = fun(array);
        for(int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
