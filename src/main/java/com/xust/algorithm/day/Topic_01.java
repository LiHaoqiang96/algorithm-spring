package com.xust.algorithm.day;

import java.util.Scanner;

/**
     题目：在给定n个数中找出两个数的和为固定值k。
     输入n，再输入n个数，最后输入k
     例输入：
     9
     2 3 5 4 6 12 15 13 4
     16
     输出：3 13
 */
public class Topic_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arry = new int[n];
        for(int i=0 ; i<n ;i++){
            arry[i]=input.nextInt();
        }
        int sum = input.nextInt();
        for(int i=0 ; i<n-1 ;i++){
            for(int j=i+1 ; j<n ;j++){
                if(arry[i]+arry[j]==sum){
                    System.out.println(arry[i]+" "+arry[j]);
                    System.exit(1);
                }
            }
        }
    }
}
