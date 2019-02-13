package com.xust.spring_recruit.Font.T2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] a = new int[N];
        a[0] = 1;
        boolean abc = true;
        int sum = a[0];
        while (true){
            for(int i=1; i<N; i++){
                a[i] = a[i-1]+1+(int)(Math.random()*(a[i-1]*2+1));
                sum+=a[i];
            }
            if(sum==M)
                break;
        }
        System.out.println(a[N-1]);
    }
}
