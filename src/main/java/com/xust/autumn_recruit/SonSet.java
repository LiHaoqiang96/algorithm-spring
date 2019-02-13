package com.xust.autumn_recruit;

import java.util.ArrayList;
import java.util.List;

public class SonSet {

    public static void main(String[] args){
        int[] arr={1,1,2};

        List<Integer> aList=new ArrayList<Integer>();
        List<Integer> bList=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            aList.add(arr[i]);
        }
        getSonSet1(0,aList,bList); //方法1，递归法

        System.out.println("----数组arr公用，分割线-----");

        getSonSet2(arr,arr.length); //方法2，按位对应法
    }

    /*
     * 递归法
     */
    public static void getSonSet1(int i,List<Integer> aList,List<Integer> bList){
        if(i>aList.size()-1){
            if(bList.size()<=0){
                System.out.print("@");
            }else {
                /*for(int v:bList){
                    System.out.print(v+",");//可以直接用这种方法输出bList数组里所有值，但是每个子数组最后就会带逗号
                }*/
                System.out.print(bList.get(0));
                for(int m=1;m<bList.size();m++){
                    System.out.print(","+bList.get(m));
                }
            }
            System.out.println();
        }else {
            bList.add(aList.get(i));
            getSonSet1(i+1, aList, bList);
            int bLen=bList.size();
            bList.remove(bLen-1);
            getSonSet1(i+1, aList, bList);
        }
    }


    /*
     *按位对应法。
     */
    private static void getSonSet2(int[] arr, int length) {
        int mark=0;
        int nEnd=1<<length;
        boolean bNullSet=false;
        for(mark=0;mark<nEnd;mark++){
            bNullSet=true;
            for(int i=0;i<length;i++){
                if(((1<<i)&mark)!=0){//该位有元素输出
                    bNullSet=false;
                    System.out.print(arr[i]+",");
                }
            }
            if(bNullSet){//空集合
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
