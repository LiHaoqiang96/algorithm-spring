package com.xust.autumn_recruit.kuaishou;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] temp = s.split(",");
        Long[] array = new Long[temp.length];

        for (int i = 0; i < temp.length; i++) {
            array[i] = Long.valueOf(temp[i]);
        }
        long cost = 0;
        int i;
        if (array[0] < array[1]) {
            cost += array[0];
            i = 0;
        } else {
            cost += array[1];
            i = 1;
        }
        while ((i + 2) < array.length) {
            if (array[i + 1] < array[i + 2]) {
                cost += array[i + 1];
                i++;
            } else {
                cost += array[i + 2];
                i += 2;
            }
        }
        System.out.println(cost);
    }
}
