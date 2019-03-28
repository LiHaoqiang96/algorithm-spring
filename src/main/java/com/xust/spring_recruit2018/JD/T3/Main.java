package com.xust.spring_recruit2018.JD.T3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void recursive(ArrayList<String> res, char[] cs, int size, int len, int flag) {
        if (flag < 0) {
            return;
        }
        if (len == size) {
            if (flag == 0) {
                res.add(new String(cs));
            }
            return;
        }
        size++;
        cs[size - 1] = '(';
        recursive(res, cs, size, len, flag + 1);
        cs[size - 1] = ')';
        recursive(res, cs, size, len, flag - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt() * 2;
        ArrayList<String> res = new ArrayList<>();
        recursive(res, new char[len], 0, len, 0);
        if (res.size() > 0) {
            System.out.print(res.get(0));
        }
        for (int i = 1; i < res.size(); i++) {
            System.out.print(","+res.get(i));
        }
    }
}
