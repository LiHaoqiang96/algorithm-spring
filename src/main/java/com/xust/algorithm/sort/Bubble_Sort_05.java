package com.xust.algorithm.sort;
/**
 * 冒泡排序(交换排序)
 * */
public class Bubble_Sort_05 {

    public static void BubbleSort_01(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void BubbleSort_02(int[] array){
        int len = array.length;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<len-1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
            len--;
        }
    }

    public static void main(String[] args) {

        int[] array = {3,2,5,8,4,7,6,9};
        BubbleSort_02(array);
        for(int i:array){
            System.out.print(i+"  ");
        }
    }

}
