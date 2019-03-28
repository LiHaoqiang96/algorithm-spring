package com.xust.spring_recruit2018.Qiyi;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        char[] str={'A','B','C','D','E'};

        ArrayList<Character> t=new ArrayList<Character>();
        ArrayList<ArrayList<Character>> res=new ArrayList<ArrayList<Character>>();
        //求组合数
        Combination(str,5,3,t,res);
        System.out.println(res);
        //求全排列
        System.out.println(Permutation(str,5,3));
    }


    //全排列方法1
    public static void permulation(int[] list, int start, int length) {
        int i;
        if (start == length) {
            for (i = 0; i < length; i++)
                System.out.print(list[i] + " ");
            System.out.println();
        } else {
            for (i = start; i < length; i++) {
                swap(list, start, i);
                permulation(list, start + 1, length);
                swap(list, start, i);
            }
        }
    }

    public static void swap(int[] list, int start, int i) {
        int temp;
        temp = list[start];
        list[start] = list[i];
        list[i] = temp;
    }

    //全排列方法2
    public static ArrayList<ArrayList<Character>> Permutation(char[] A,int n)
    {
        if(n==1)
        {
            ArrayList<Character> t=new ArrayList<Character>();
            ArrayList<ArrayList<Character>> temp=new ArrayList<ArrayList<Character>>();
            t.add(A[0]);
            temp.add(t);
            return temp;
        }
        else
        {
            ArrayList<ArrayList<Character>> temp=Permutation(A,n-1);
            ArrayList<ArrayList<Character>> res=new ArrayList<ArrayList<Character>>();
            for(int i=0;i<temp.size();i++)
            {

                for(int j=0;j<n;j++)
                {
                    ArrayList<Character> t=new ArrayList<Character>(temp.get(i));
                    if(j<n-1)
                    {
                        t.add(j,A[n-1]);
                        res.add(t);
                    }
                    else
                    {
                        t.add(A[n-1]);
                        res.add(t);
                    }

                }
            }
            return res;
        }
    }

    //指定个数元素的排列
    public static ArrayList<ArrayList<Character>> Permutation(char[] A,int n,int m)
    {
        ArrayList<ArrayList<Character>> temp=new ArrayList<ArrayList<Character>>();
        ArrayList<Character> t=new ArrayList<Character>();
        Combination(A,n,m,t,temp);

        ArrayList<ArrayList<Character>> res=new ArrayList<ArrayList<Character>>();
        for(int i=0;i<temp.size();i++)
        {

            char[] tc=new char[temp.get(i).size()];
            for(int j=0;j<tc.length;j++)
            {
                tc[j]=temp.get(i).get(j);
            }
            res.addAll(Permutation(tc,tc.length));
        }
        return res;
    }


    //组合数，通过参数返回结果
    public static void Combination(char[] A,int n,int m,ArrayList<Character> t,ArrayList<ArrayList<Character>> res)
    {
        if(m==0)
        {
            ArrayList<Character> temp=new ArrayList<Character>(t);
            res.add(temp);
        }
        else
        {
//          for(int i=n-1;i>=m-1;i--)
//          {
//              t.add(A[i]);
//              Combination(A,i,m-1,t,res);
//              t.remove(t.size()-1);
//          }

            for(int i=A.length-n;i<=A.length-m;i++)
            {
                t.add(A[i]);
                Combination(A,A.length-i-1,m-1,t,res);
                t.remove(t.size()-1);
            }
        }
    }

    //组合数，通过返回值返回结果
    public static ArrayList<ArrayList<Character>>  Combination(char[] A,int n,int m,ArrayList<Character> t)
    {
        ArrayList<ArrayList<Character>> res=new ArrayList<ArrayList<Character>>();
        if(m==0)
        {
            ArrayList<Character> temp=new ArrayList<Character>(t);
            res.add(temp);
            return res;
        }
        else
        {
//          for(int i=n-1;i>=m-1;i--)
//          {
//              t.add(A[i]);
//              Combination(A,i,m-1,t,res);
//              t.remove(t.size()-1);
//          }

            for(int i=A.length-n;i<=A.length-m;i++)
            {
                t.add(A[i]);
                res.addAll(Combination(A,A.length-i-1,m-1,t));
                t.remove(t.size()-1);
            }
            return res;
        }
    }

}
