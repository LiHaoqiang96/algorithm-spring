package com.xust.autumn_recruit.tencent;

import java.util.Scanner;

public class Main {

    public static int getBigDiv(int a, int b) {
        if (b == 0)
            return a;
        return getBigDiv(b, a % b);
    }

    public static int getSmallMul(int a, int b) {
        return (a * b) / getBigDiv(a, b);
    }

    public static int getMoreSmallMul(int num[], int n) {
        if (n == 1)
            return num[n - 1];
        return getSmallMul(num[n - 1], getMoreSmallMul(num, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a;
        int[] b;
        for (int i = n + 1; i < 1000001; i++) {
            int temp = i;
            a = new int[temp];
            b = new int[temp - n];

            for (int j = 0; j < temp; j++) {
                a[j] = j + 1;
            }

            int k = n + 1;
            for (int j = 0; j < temp - n; j++) {
                b[j] = k;
                k++;
            }
            if (getMoreSmallMul(a, a.length ) == getMoreSmallMul(b, b.length)) {
                System.out.println(i);
                break;
            }
            a = null;
            b = null;
        }
    }
}
