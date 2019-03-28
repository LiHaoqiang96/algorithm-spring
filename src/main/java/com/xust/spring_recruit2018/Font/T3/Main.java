package com.xust.spring_recruit2018.Font.T3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = input.nextInt();
        Main.BubbleSort(a);
        long niu = 0;
        long yang = 0;
        for(int i=0, j=n-1; i<j; i++,j--){
            niu+=a[i];
            yang+=a[j];
        }
        System.out.println(niu-yang);
    }

    public static void BubbleSort(int[] array){
        int len = array.length;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<len-1; i++){
                if(array[i] <= array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
            len--;
        }
    }
}
