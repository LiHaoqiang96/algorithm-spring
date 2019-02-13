package com.xust.autumn_recruit.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] score = new int[n];
        int[] status = new int[n];
        for(int i=0; i<n; i++){
            score[i] = input.nextInt();
        }
        for(int i=0; i<n; i++){
            status[i] = input.nextInt();
        }

        int[] max = new int[n];
        int y=-1;
        for(int i=0; i<n; i++){
            int maxValue = 0;
            for(int j=i; j<n; j++){
                if(status[j] == 0){
                    int m;
                    for(m=j; m<k+j && m<n; m++){
                        maxValue +=score[m];
                    }
                    if(m==k+j && m<n-1 && status[m+1]==1){
                        for(int l=m+1; l<n && status[l]==1 ; i++){
                            maxValue +=score[l];
                        }
                    }
                    break;
                }
                if(status[j]==1){
                    maxValue +=score[j];
                }
            }
            max[++y] = maxValue;
        }
        Arrays.sort(max);
        System.out.print(max[max.length-1]);
    }
}
