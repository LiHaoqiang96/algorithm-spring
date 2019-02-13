package com.xust.autumn_recruit.keep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] temp = str.split(",| ");
        int[] array = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            array[i] = Integer.valueOf(temp[i]);
        }

        int j = 0;
        for (j = 0; j < array.length - 2; j++) {
            if ((array[j] + array[j+1]) % array[array.length-1] == 0) {
                System.out.println(1);
                System.exit(0);
            }
        }
        if (j == array.length - 1) {
            System.out.println(0);
        }
    }
}
