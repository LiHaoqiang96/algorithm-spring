package com.xust.autumn_recruit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] temp = str.split(",|_| |!");
        String[] array = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            array[i] = String.valueOf(temp[i]).toLowerCase();
        }
        for (int i = 1; i < array.length; i++) {
            char[] c = new char[1000];
            for (int j = 0; j < array[i].length(); j++) {
                c[j] = array[i].charAt(j);
            }
            if (c[0] >= 'a' && c[0] <= 'z') {
                c[0] -= 32;
            }
            int l = array[i].length();
            array[i] = "";
            for (int j = 0; j < l; j++) {
                 array[i] += c[j];
            }
        }
        for (String i : array
             ) {
            System.out.print(i);
        }
    }
}
