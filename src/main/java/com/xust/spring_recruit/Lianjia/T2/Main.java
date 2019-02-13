package com.xust.spring_recruit.Lianjia.T2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer>set = new HashSet<Integer>();
        while(n-->0){
            int k = in.nextInt();
            while (k-->0){
                set.add(in.nextInt());
            }
        }
        System.out.println(set.size());
    }
}
