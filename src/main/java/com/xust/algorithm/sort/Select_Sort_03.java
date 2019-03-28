package com.xust.algorithm.sort;

/**
 * 直接选择(选择排序)
 */
public class Select_Sort_03 {

    public static void SelectSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 8, 4, 7, 6, 9};
        SelectSort(a);
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }

}
