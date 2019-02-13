package com.xust.autumn_recruit.beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = input.nextInt();
        }

        int sum = 0;
        Arrays.sort(array);
        for (int i = 1; i < array.length; ++i) {
            sum +=array[i];
        }
        System.out.println(sum);
    }
}
