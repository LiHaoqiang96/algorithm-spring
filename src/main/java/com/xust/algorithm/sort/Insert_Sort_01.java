package com.xust.algorithm.sort;
/**
 * 直接插入(插入排序)
 * */
public class Insert_Sort_01 {

    public static void InsertSort(int[] array){

        for(int i=1; i<array.length; i++){
            if(array[i] < array[i-1]){
                int temp = array[i],j;
                for(j=i-1; j>-1 && temp <array[j]; j--){
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3,2,5,8,4,7,6,9};
        InsertSort(a);

        for(int i: a){
            System.out.print("  "+i);
        }
    }

}
