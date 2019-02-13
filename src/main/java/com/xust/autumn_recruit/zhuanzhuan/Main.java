package com.xust.autumn_recruit.zhuanzhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "a:1#b:2#c:3@x:8#y:9#z:10";
        String[] splitStrArray = {"[@,#,:]"};
        String[][][] result = strToArray(str, splitStrArray);
        /*for(int i = 0; i < result.length; i++) {
            System.out.print(result[i][0][0] + " ");
        }*/
        for(int i=0;i<result.length;i++) {
            for(int i1=0;i1<result[i].length;i1++) {
                for(int i2=0;i2<result[i][i1].length;i2++) {
                    System.out.print(result[i][i1][i2]);
                }
                System.out.println();//二维换行
            }
            System.out.println();//三维换行
        }
    }
    public static String[][][] strToArray(String str, String[] splitStrArray) {
        String split = "";
        for (int i = 0; i < splitStrArray.length; i++) {
            split = split + splitStrArray[i] + '|';
        }
        String[] temp = str.split(split);
        String[] array = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
        String[][][] res = new String[array.length][5][5];

        for (int i = 0; i < res.length; i++) {
            for (int i1 = 0; i1 < res[i].length; i1++) {
                for (int i2 = 0; i2 < res[i][i1].length; i2++) {
                    res[i][i1][i2] = array[i];
                }
                System.out.println();//二维换行
            }
        }
        return res;
    }
}
