package com.xust.spring_recruit.Meituan.T2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T =input.nextInt();
        if(T>100){
            System.exit(0);
        }
        long[] a = new long[T];
        for(int i=0; i<T; i++){
            a[i] = input.nextLong();
        }

        for(int i=0; i<T; i++){
            String str = "";
            for(long j=1; j<a[i]+1; j++){
                str+=j+"";
            }
            System.out.println(str.length());
        }
    }
}