package com.xust.autumn_recruit.toutiao.time3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static int max_Value(ArrayList<Integer>[] list, int[] array, int k){
        int maxValue = 0;
        for(int i = 0; i < list[k].size(); i++){
            if(array[list[k].get(i)] == 0) {
                maxValue++;
                array[list[k].get(i)] = 1;
                maxValue += max_Value(list, array, list[k].get(i));
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<Integer>[] list = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            list[b].add(a);
        }
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            int t = 1;
            int[] b = new int[n+1];
            b[i] = 1;
            t += max_Value(list, b, i);
            if(t == n){
                cnt++;
            }
        }
        System.out.println(cnt+"");
    }
}
