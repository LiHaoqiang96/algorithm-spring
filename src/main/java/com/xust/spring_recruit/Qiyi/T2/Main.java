package com.xust.spring_recruit.Qiyi.T2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        for(int i=0 ; i<3; i++){
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        int result = 0;
        result += (array[1]-array[0]+1)/2;
        result += array[2]-array[1];
        result += (array[1]-array[0])%2;
        System.out.println(result);
    }
}
