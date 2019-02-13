package com.xust.algorithm.day;

import java.util.Scanner;

/**
 * 今天题目：
 Tom准备转行开花店，所以他进了一大堆花回来打算包装成花束。每个花束要求有m种不一样的花，
 每种花需要放 r 朵。那么问题来了，Tom只进了n种花，每种花分别有 zi 朵。他最多能包装出多少个花束
 输入
 第一行输入n（范围为[0, 100000]）、m（范围为[0, 100000]）、r（范围为[0, 100000].
 第二行输入n个整数，zi代表第i种花有 zi 朵
 输出
 Tom最多能包装出多少个花束

 样例输入
 3 2 3
 7 7 9
 样例输出
 3
 * */
public class Topic_04 {

    public static int solveFlower(int[] arr,int m,int r){
        if (arr==null || arr.length==0 || m<0 || r<0 || m>100000 || r>100000){
            return 0;
        }
        int cnt=0;
        while (true){
            Topic_04.sort(arr);
            for (int i=0;i<m;i++){
                if (arr[i]-r>=0){
                    arr[i]-=r;
                }else {
                    return cnt;
                }
            }
            cnt++;
        }
    }

    public static void sort(int[] arr){
        int t;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        int m=input.nextInt();
        int r=input.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print(Topic_04.solveFlower(arr,m,r));
    }
}

