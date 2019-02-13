package com.xust.autumn_recruit.beike;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] array = new int[n][2];
        int[][] array1 = new int[n][2];
        for(int i=0;i<n;i++){
            array[i][0]=input.nextInt();
            array1[i][0]=array[i][0];
            array[i][1]=input.nextInt();
            array1[i][1]=array[i][1];
        }

        Arrays.sort(array,(x,y)->x[0]-y[0]);
        int cnt=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int flag = 1;
            int high=-1;
            for(int j=0;j<n;j++){
                if(j!=i){
                    if(high==-1){
                        high=array[j][1];
                    }else{
                        if(high > array[j][0]){
                            flag=0;
                            break;
                        }else{
                            high=array[j][1];
                        }
                    }
                }
            }
            if(flag==1){
                cnt+=1;
                map.put(array[i][0],array[i][1]);
            }
        }
        System.out.println(cnt);
        for(int i=0;i<n;i++){
            if(map.get(array1[i][0]) != null && map.get(array1[i][0]) == array1[i][1]){
                System.out.print(i+1+" ");
            }
        }
    }
}