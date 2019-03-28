package com.xust.spring_recruit2018.Lianjia.T3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int res = 5050;
        for(int i = 0 ; i < 99 ; i++){
            res -= in.nextInt();
        }
        System.out.println(res);
    }
}