package com.xust.spring_recruit2019.zijietiaodong.main_1;

import java.util.Scanner;
public class Main {
    public static int method(int n){
        int count = 0;
        for (;n >= 64;) {
            count++;
            n -= 64;
        }
        for (;n >= 16;) {
            count++;
            n -= 16;
        }
        for (;n >= 4;) {
            count++;
            n -= 4;
        }
        for (;n >= 1;) {
            count++;
            n -= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(method(1024 - n));
    }
}
