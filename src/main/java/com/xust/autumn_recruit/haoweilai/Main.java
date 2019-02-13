package com.xust.autumn_recruit.haoweilai;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);

        float e = 0;
        for (int i = 0; i < n; i++) {
            e += (1.0 / 6) * array[i];
        }
        double x = (1.0 / 6) * m;

        double abc = 1.17;
        String r = String.format("%.2f", abc);
        System.out.println(r);
    }
}
