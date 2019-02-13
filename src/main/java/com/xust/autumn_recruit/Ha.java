package com.xust.autumn_recruit;

import java.util.Scanner;

public class Ha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] temp = str.split(" ");
        String[] arr = new String[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        String[] reslut = new String[1000];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                int n = arr[i].charAt(j) - '0';
                if ( n >=0 && n <= 9) {
                    reslut[n] = arr[i];
                }
            }
        }
        for (String s : reslut
             ) {
            if (s != null) {
                System.out.print(s + " ");
            }
        }
    }
}
