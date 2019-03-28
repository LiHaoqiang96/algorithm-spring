package com.xust.spring_recruit2018.Tencent.T2;

import java.util.Scanner;

public class Main {
    public static int A(int m,int n){
        int i,res;
        res = 1;
        for(i=m;i>m-n;i--)
            res =res*i%1000000007;
        return res;
    }
    public static int C(int m,int n){
        return A(m,n)/A(n,n)%1000000007;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int la,lb,a,b;
        la=input.nextInt();
        a=input.nextInt();
        lb=input.nextInt();
        b=input.nextInt();
        int i,j;
        int count=0;
        for(i=0;i<=a;i++) {
            for(j=0;j<=b;j++) {
                if(i*la+j*lb==k) {
                    count++;

                }
            }
        }
        int[] x=new int[count];
        int[] y=new int[count];
        count=-1;
        for(i=0;i<=a;i++) {
            for(j=0;j<=b;j++) {
                if(i*la+j*lb==k) {
                    x[++count]=i;
                    y[count]=j;

                }
            }
        }
        int sum=0;
        for(i=0;i<count+1;i++) {
            sum=(sum+(C(a, x[i])*C(b ,y[i])))%1000000007;
        }
        System.out.println(sum);
    }
}

