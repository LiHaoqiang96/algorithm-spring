package com.xust.algorithm.sort;

/**
 * 快速排序(交换排序)
 */
public class Quick_Sort_06 {

    public static void QuickSort(int[] array, int low, int high) {

        int i, j;
        if (high - low > 1) {
            i = low + 1;
            j = high - 1;
            while (i <= j) {
                while (i < high && array[i] < array[low]) {
                    i++;
                }
                while (j > low && array[j] >= array[low]) {
                    j--;
                }
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            if ((j - low) != 0) {
                int temp = array[low];
                array[low] = array[j];
                array[j] = temp;
                QuickSort(array, low, j);
                QuickSort(array, j + 1, high);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 5, 4, 7, 6, 9, 2};
        QuickSort(array, 0, array.length);
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}
