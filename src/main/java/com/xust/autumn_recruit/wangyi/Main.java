package com.xust.autumn_recruit.wangyi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static  List<List> res = new ArrayList<List>();
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int n,m,k;
        n=sca.nextInt();
        m=sca.nextInt();
        k=sca.nextInt();
        List list=new ArrayList();
        char[]s=new char[n+m];
        for(int i=0;i<n;++i){
            s[i]='a';
        }
        for(int i=n;i<n+m;++i){
            s[i]='z';
        }
        Main mi=new Main();
        mi.permuteUnique(s);
        String re="";
        if (k>res.size()){
            re="-1";
        }
        else {
            for(int i=0;i<n+m;++i){
                re+=res.get(k-1).get(i);
            }
        }
        System.out.println(re);
    }




    public List<List> permuteUnique(char[] nums) {
        int len = nums.length;
        if(len==0||nums==null)  return res;

        boolean[] used = new boolean[len];
        List list = new ArrayList();

        dfs(nums, used, list, len);
        return res;
    }

    public void dfs(char[] nums, boolean[] used, List list, int len) {
        if(list.size()==len) {
            res.add(new ArrayList(list));
            return ;
        }
        for (int i=0; i<len; i++) {
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1])   continue;
            used[i]=true;
            list.add(nums[i]);
            dfs(nums, used, list, len);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}

