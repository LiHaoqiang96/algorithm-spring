package com.xust.autumn_recruit.kuaishou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static double getNum(double a, double b) {
        Boolean bool = new Boolean(false);
        double c = 0;
        if (bool == false) {
        }
        while (true) {
            c = a % b;
            a = b;
            b = c;
            if (b == 0) {
                return a;
            }
        }

    }
    public static boolean isLoop(double a, double b) {
        double num = getNum(a, b);
        b = b / num;
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        if (b == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static String getString(int a, int b) {
        List t1 = new ArrayList();
        List t2 = new ArrayList();
        int p = -1;
        while (true) {
            t1.add(a / b);
            int x = a % b;
            if (x == 0) break;
            p = t2.indexOf(x);
            if (p >= 0) break;
            else
                t2.add(x);
            a = x * 10;
        }
        String str = t1.get(0) + ".";
        for (int i = 1; i < t1.size(); i++) {
            if (i == p + 1){
                str+="(";
            }
            str+=t1.get(i);
        }
        if (p >= 0){
            str+=")";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String reslut = "";
        if (n % m == 0) {
            reslut = String.valueOf(n / m);
        } else if (isLoop(n, m)) {
            reslut = getString(n, m);
        } else {
            Double aDouble = Double.valueOf(n / m);
            reslut = String.valueOf(aDouble);
        }
        System.out.println(reslut);
    }
}
