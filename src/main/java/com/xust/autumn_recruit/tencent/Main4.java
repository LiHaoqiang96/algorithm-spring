package com.xust.autumn_recruit.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

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
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = n + 1; i < 1000001; i++) {
            int temp = i;
            list1.clear();
            list2.clear();
            for (int j = 0; j < temp; j++) {
                list1.add(j + 1);
            }

            int k = n + 1;
            for (int j = 0; j < temp - n; j++) {
                list2.add(k);
                k++;
            }
            /*if (getMoreSmallMul( ) == getMoreSmallMul(b, b.length)) {
                System.out.println(i);
                break;
            }*/
        }
    }
}
