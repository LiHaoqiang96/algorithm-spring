package com.xust.autumn_recruit.didi;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Boolean bool = new Boolean(false);
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (bool == false) {
            bool = true;
        }
        if (a - b - c > 1) {
            System.out.println(0);
        } else if (b - a - c > 1) {
            System.out.println(0);
        } else if (c - b - a > 1) {
            System.out.println(0);
        }else {
            System.out.println(6);
        }
    }
}
