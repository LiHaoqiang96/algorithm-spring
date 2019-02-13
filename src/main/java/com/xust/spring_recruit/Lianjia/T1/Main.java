package com.xust.spring_recruit.Lianjia.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = str1.replaceAll(" ","");

        int[] a = new int[str2.length()+1];
        for(int i=1; i<str2.length()+1; i++){
            a[i] = str2.charAt(i-1)-48;
        }
        for(int i=1; i<str2.length()+1; i++){
            if(i!=a[i])
                System.out.print(i+" ");
        }
    }
}
