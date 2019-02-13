package com.xust.autumn_recruit.toutiao.time3;


import java.util.ArrayList;
import java.util.Scanner;

public class Main3{

    private static void fun(String s, int start, int part, String ip, ArrayList<String> result){
        if(s.length() - start > (4 - part) * 3) return;
        if(s.length() - start < (4 - part)) return;
        if(start == s.length() && part == 4) {
            result.add(ip.substring(0, ip.length() - 1));
            return;
        }
        int number = 0;
        for(int i = start; i < Math.min(start + 3, s.length()); i++){
            number = number * 10 + (s.charAt(i) - '0');
            if(number <= 255){
                ip += s.charAt(i);
                fun(s,i+1,part+1,ip+'.', result);
            }
            if(number == 0) {
                break;
            }
        }
    }

    public static ArrayList<String> restoreIP(String s) {
        ArrayList<String> result = new ArrayList<String>();
        String ip = "";
        Boolean bool = new Boolean(false);
        fun(s,0,0, ip, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        ArrayList<String> list = restoreIP(s);
        System.out.println(list.size());
    }
}