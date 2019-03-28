package com.xust.spring_recruit2018.Mogujie.T1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String str = input.next();
        ArrayList<String> list = Function(str);
        System.out.println(list);
    }

    public static ArrayList<String> Function(String str) {
        ArrayList<String> list = new ArrayList<String>();
        char[] ch = str.toCharArray();
        Fun(ch, 0, list);
        Collections.sort(list);
        return  list;
    }

    public static void Fun(char[] str, int i, ArrayList<String> list) {
        if (str == null) {
            return;
        }
        if (i == str.length - 1) {
            if(list.contains(String.valueOf(str))){
                return;
            }
            list.add(String.valueOf(str));
        } else {
            for (int j = i; j < str.length; j++) {
                char c = str[j];
                str[j] = str[i];
                str[i] = c;
                Fun(str, i + 1, list);
                c = str[j];
                str[j] = str[i];
                str[i] = c;
            }
        }
    }
}