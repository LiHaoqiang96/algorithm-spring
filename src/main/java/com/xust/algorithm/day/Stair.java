package com.xust.algorithm.day;

import java.util.HashMap;
import java.util.Map;

/**
 * 有一座高度是10级台阶的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶。
 * 要求求出一共有多少种走法
 * */
public class Stair {
    public static void main(String[] args) {
        System.out.println(Stair.Method_01(10));
        System.out.println(Stair.Method_02(10));
        System.out.println(Stair.Method_03(10));
    }


    /**
     * 方法一：递归求解
     *
     * 把状态转移方程式翻译成递归程序，递归的结束的条件就是方程式当中的边界。
     * 因为每个状态有两个最优子结构，所以递归的执行流程类似于一颗高度为N的二叉树。
     * 方法的时间复杂度是O(2^N)。
     *
     * F(N) = F(N-1) + F(N-2),
     * 其中F(1) = 1,F(2) = 2，即边界条件
     * */
    public static int Method_01(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return Method_01(n-1)+Method_01(n-2);
    }


    /**
     * 方法二：备忘录算法
     * 存入HashMap<Integer,Integer>中，如果F(N)存在，就不用计算
     * */
    public static int Method_02(int n){

        Map<Integer,Integer> map = new HashMap<>();

        if(n < 1){
            return  0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            int value = Method_02(n-1)+Method_02(n-2);
            map.put(n,value);
            return value;
        }
    }


    /**
     * 动态规划求解
     * */
    public static int Method_03(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        int a = 1;
        int b = 2;
        int temp = 0;
        for(int i=3;i<n+1;i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return temp;
    }

}
