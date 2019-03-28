package com.xust.spring_recruit2019.zijietiaodong.main_4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double binary(double[] a, int n) {
        Arrays.sort(a);
        double min = 0;
        double max = a[a.length - 1];
        double res = 0;
        for (int j = 0; j < 100; j++) {
            res = (min + max) / 2.0;
            int num = 0;
            for (int i = 0; i < a.length; i++) {
                num += (int) (a[i] / res);
            }
            if (num < n) max = res;
            else min = res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            double[] array = new double[m];
            int k = 0;
            while ((m--) > 0) {
                array[k++] = sc.nextDouble();
            }
            double res = binary(array, n);
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            res = Math.floor(res * 100) / 100;
            System.out.println(decimalFormat.format(res));
        }
    }
}
