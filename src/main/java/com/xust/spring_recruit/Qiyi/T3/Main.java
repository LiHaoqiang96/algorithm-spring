package com.xust.spring_recruit.Qiyi.T3;

import java.util.Scanner;

public class Main {
    public static int MAXSIZE=1000;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str = input.nextLine();
        if(str.length()<1 || str.length()>50){
            System.exit(0);
        }
        char[] res=new char[MAXSIZE];
        int i, len = str.length(), max = 0;
        int id = MAXSIZE;
        for(i=len-1;i>=0;i--){
            if(str.charAt(i)>=max) {
                res[--id] = str.charAt(i);
                max = str.charAt(i);
            }
        }
        for(i=id;i<MAXSIZE;i++){
            System.out.print(res[i]);
        }
    }
}

