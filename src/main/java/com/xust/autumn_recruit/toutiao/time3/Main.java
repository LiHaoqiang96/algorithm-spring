package com.xust.autumn_recruit.toutiao.time3;

import java.util.Scanner;

public class Main {
    public static int maxSubstr(String s){
        if(s == null || s.equals("")){
            return 0;
        }
        char[] c = s.toCharArray();
        int[] array = new int[256];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        int length = 0;
        int p = -1;
        int current = 0;
        for (int i = 0; i < c.length; i++) {
            p = Math.max(p, array[c[i]]);
            current = i - p;
            length = Math.max(length, current);
            array[c[i]] = i;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(maxSubstr(s));
    }
}
