package com.xust.spring_recruit.Tencent.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if( n<2 || n>1000000000 || m<1 || n%(2*m) != 0)
            System.exit(1);
        int[] a = new int[n+1];
        int cnt =0, t= 1;
        for(int i=1; i<n+1; i++){
            cnt++;
            if((cnt-1)%m == 0)
                t=t*-1;
            a[i] = t*i;
        }
        long sum =0;
        for(int i=1; i<n+1; i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
