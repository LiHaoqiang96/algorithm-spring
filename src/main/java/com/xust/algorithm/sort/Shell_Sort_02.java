package com.xust.algorithm.sort;

/**
 * 希尔排序(插入排序)
 */
public class Shell_Sort_02 {


    public static void ShellSort(int[] array) {

        int n = array.length;
        int h;
        for (h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                for (int j = i - h; j >= 0; j -= h) {
                    if (array[j] > array[j + h]) {
                        int temp = array[j];
                        array[j] = array[j + h];
                        array[j + h] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 8, 4, 7, 6, 9};
        ShellSort(a);
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }
}
