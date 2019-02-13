package com.xust.autumn_recruit.netease;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = input.nextInt();
        }

        String[] s = new String[m];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextLine();
        }
        for (int i = 0; i < m; i++) {
            System.out.println(s[i]);
        }
    }
}
