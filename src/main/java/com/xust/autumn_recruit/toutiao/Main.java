package com.xust.autumn_recruit.toutiao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int m=scan.nextInt();
        ArrayList<Integer>[] nums=new ArrayList[m];
        for(int i=0;i<m;++i){
            ArrayList<Integer> num=new ArrayList<Integer>();
            while (true){
                int n=scan.nextInt();
                if (n!=0){
                    num.add(n);
                }else {
                    nums[i]=num;
                    break;
                }
            }
        }
        int res=find(nums);
        System.out.println(res);
    }

    private static int find(ArrayList<Integer>[] nums) {
        int res=0;
        ArrayList<Integer>[] help=doFindArray(nums);
        Set<Integer> h1=new TreeSet<Integer>();
        for (int i=1;h1.size()<nums.length&&i<nums.length+1;++i){
            ArrayList<Integer> h2=new ArrayList<Integer>();
            if (!h1.contains(i)){
                h1.add(i);
                h2.add(i);
                res++;
                for (int j=0;j<h2.size();++j){
                    for (int k=0;k<help[h2.get(j)-1].size();++k){
                        if(!h1.contains(help[h2.get(j)-1].get(k))){
                            h1.add(help[h2.get(j)-1].get(k));
                            h2.add(help[h2.get(j)-1].get(k));
                        }
                    }
                    for (int k=0;k<nums[h2.get(j)-1].size();++k){
                        if(!h1.contains(nums[h2.get(j)-1].get(k))){
                            h1.add(nums[h2.get(j)-1].get(k));
                            h2.add(nums[h2.get(j)-1].get(k));
                        }
                    }
                }
            }

        }
        return res;
    }
    private static ArrayList[] doFindArray(ArrayList<Integer>[] nums) {
        ArrayList<Integer>[] res=new ArrayList[nums.length];
        for (int i=0;i<res.length;++i){
            res[i]=new ArrayList<Integer>();
        }
        for (int i=0;i<nums.length;++i){
            for (int j=0;j<nums[i].size();++j){
                res[nums[i].get(j)].add(i+1);
            }
        }
        return res;
    }
}