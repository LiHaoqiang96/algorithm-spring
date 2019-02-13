package com.xust.algorithm.day;

import java.util.Scanner;

/**
 * 算法：求一个整数序列的最长递增子序列。
 输入：第一行为序列长度，第二行给出整数序列。
 输出：第一行为最长递增子序列的长度，第二行为最长递增子序列。
 例输入：
 5 
 3 1 4 2 3 
 输出：
 3
 1 2 3
 * */
public class Topic_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        for(int i=0 ;i<n;i++){
            array[i] = input.nextInt();
        }

        int[] d = Topic_03.get_d(array);
        int[] str = Topic_03.getStr(array,d);
        System.out.println(str.length);
        for(int i:str){
            System.out.print(i+" ");
        }

    }
    public static int[] get_d(int[] array){
        int[] d = new int[array.length];
        for(int i=0;i<array.length;i++){
            d[i]=1;
            for(int j=0;j<i;j++){
                if( array[i] > array[j] ){
                    d[i] = d[i]>(d[j]+1) ? d[i] : (d[j]+1);
                }
            }
        }
        return d;
    }
    public static int[] getStr(int[] array, int[] d){
        int Max_len = 0,index=0;
        for(int i=0;i<array.length;i++){
            if(d[i]>Max_len){
                Max_len = d[i];
                index = i;
            }
        }

        int[] list = new int[Max_len];
        list[--Max_len] = array[index];
        for(int i=index;i>=0;i--){
            if(array[i]<array[index] && d[i]==d[index]-1){
                list[--Max_len] = array[i];
                index = i;
            }
        }
        return list;
    }
}
