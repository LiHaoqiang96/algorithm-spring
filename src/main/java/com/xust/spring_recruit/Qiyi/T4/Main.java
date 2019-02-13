package com.xust.spring_recruit.Qiyi.T4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.length()<1 || str.length()>50){
            System.exit(0);
        }
        char[] c = new char[str.length()+1];
        for(int i=0; i<str.length(); i++){
            c[i] = str.charAt(i);
        }
        List<String> list = new ArrayList<>();
        int choose = 0;
        while(choose<=str.length()){
            for(int i=0; i<c.length-1; i++){
                for(int j=0; j<c.length-1; j++){
                    String s = "";
                    for(int k=choose; (j+k)<c.length-1 && k>0; k--){
                        s += c[j]+"";
                    }
                    list.add(s);
                }
            }
            choose++;
        }
        for(String a: list){
            System.out.print(a+" ");
        }
//        Collections.sort(list);
//        System.out.println(list.get(list.size()-1));
    }
}
