package com.xust.spring_recruit.Font.T5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] a = new int[t];
        for(int i=0; i<t; i++) {
            int value;
            if(Main.isPower(value=s.nextInt())==false) {
                a[i] = value;
            }else {
                System.exit(1);
            }
        }
        for (int i = 0; i < t; i++) {
            int N = a[i];
            int j = 2;
            for (; j <= N / 2; j += 2) {
                int x = N / j;
                int y = j;
                if ((x % 2 == 1) && (x * j == N)) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
            if (j > N / 2)
                System.out.println("No");
        }
    }

    public static boolean isPower(int n){
        if(n<1)
            return false;
        int i=1;
        while(i<=n){
            if(i==n)
                return true;
            i<<=1;
        }
        return false;
    }
}
