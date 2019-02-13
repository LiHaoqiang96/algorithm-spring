package com.xust.algorithm.day;

public class Digging_gold {
    public static void main(String[] args) {
        int n = 5;
        int w = 10;
        int[] g = {500,400,350,300,200};
        int[] p = {5,4,3,4,3};
        System.out.println(Digging_gold.getMostGold_01(n,w,g,p));
    }

    public static int getMostGold_01(int n, int w, int[] g, int[] p){
        int[] preResults = new int[p.length];
        int[] results = new int[p.length];

        //填充边界格子的值
        for(int i=0; i<=n; i++){
            if(i < p[0]){
                preResults[i] = 0;
            }else{
                preResults[i] = g[0];
            }
        }

        //填充其余格子的值，外层循环是金矿数量，内层循环是工人数量
        for(int i=0; i<n; i++){
            for(int j=0; j<=w; j++){
                if(j < p[i]){
                    results[j] = preResults[j];
                }else{
                    results[j] = Math.max(preResults[j],preResults[j-p[i]]+g[i]);
                }
            }
            preResults = results;
        }
        return results[n];
    }

}
