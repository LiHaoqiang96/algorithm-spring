package com.xust.spring_recruit2018.Qiyi.T5;

import java.util.Scanner;
public class Main{
    private static int count = 0;
    public static void getNum(int n,int s,int [] arrL,int [] arrR,int deep){
        if(s==0){
            count++;
            return;
        }
        if(s<0 || deep>=n){
            return;
        }
        for(int i=arrL[deep];i<=arrR[deep];i++){
            s -= i;
            getNum(n,s,arrL,arrR,deep+1);
            if(s <= 0){
                return;
            }else{
                s += i;
            }
        }
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] L = new int[n];
        int [] R = new int[n];
        for(int i=0;i<n;i++){
            L[i] = in.nextInt();
            R[i] = in.nextInt();
        }
        getNum(n,m,L,R,0);
        System.out.println(count);
    }
}
