package com.xust.autumn_recruit.meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    private static int fun(int[] array, int k, int t) {
        int result = 0;
        if (k > array.length){
            return result;
        }
        for (int i = 0; i < array.length - k + 1; ++i) {
            Map<Integer,Integer> map = new HashMap<>();
            boolean b = false;
            for (int j = 0; j < k; ++j) {
                if (map.containsKey(array[j+i])){
                    int num = map.get(array[j+i]);
                    map.put(array[j+i], num+1);
                }else {
                    map.put(array[j+i],1);
                }
            }
            for (Integer value : map.values()) {
                b = value >= t;
                if (b) {
                    break;
                }
            }
            if (b){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int t = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; ++i) {
            array[i] = input.nextInt();
        }

        int result = fun(array, k, t);
        System.out.println(result);
    }
}
