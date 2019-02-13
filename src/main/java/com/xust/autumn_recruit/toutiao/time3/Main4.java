package com.xust.autumn_recruit.toutiao.time3;


import java.util.Scanner;

public class Main4 {
    public static boolean isUTF8(int[] data) {
        int cnt = 0;
        for (int num : data){
            if (cnt == 0){
                if ((num & 0x80) == 0){
                    cnt = 0;
                }else if ((num & 0xe0) == 0xc0){
                    cnt = 1;
                }else if ((num & 0xf0) == 0xe0){
                    cnt = 2;
                }else if ((num & 0xf8) == 0xf0){
                    cnt = 3;
                }else {
                    return false;
                }
            }else {
                if ((num & 0xc0) != 0x80) return false;
                cnt --;
            }
        }
        return cnt == 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int [n];
        Boolean bool = new Boolean(false);
        for (int i = 0; i < n; i++) {
            array[i]= input.nextInt();
        }
        int result = 0;
        if (isUTF8(array)) {
            result = 1;
        }
        bool.toString();
        System.out.println(result);
    }
}
