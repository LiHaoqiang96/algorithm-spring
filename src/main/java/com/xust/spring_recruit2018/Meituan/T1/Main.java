package com.xust.spring_recruit2018.Meituan.T1;

import java.util.Scanner;

public class Main {
    private static long sum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int n = input.nextInt();
        int m = input.nextInt();
        int p = input.nextInt();
        int[] A = new int[N+1];
        A[1] = p;
        for(int i=2; i<N+1; i++){
            A[i] = (A[i-1]+153)%p;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                sum += A[gcd(j,i)];
            }
        }
        System.out.println(sum);
    }

    public static int gcd(int m,int n){
        if(m<n){
            int k=m;
            m=n;
            n=k;
        }
        if(m%n!=0){
            int temp=m%n;
            return gcd(n,temp);
        }else
            return n;
    }
}
