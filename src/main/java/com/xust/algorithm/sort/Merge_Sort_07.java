package com.xust.algorithm.sort;

/**
 * 归并排序
 */

public class Merge_Sort_07 {

    public static void MergeSort(int[] a, int low, int high) {
        int mid, i, j, k;
        int[] c = new int[100];
        if (high - low > 1) {
            mid = (low + high) / 2;
            MergeSort(a, low, mid);
            MergeSort(a, mid, high);
            k = i = low;
            j = mid;
            while (i < mid || j < high) {
                if (j >= high || i < mid && a[i] < a[j]) {
                    c[k++] = a[i++];
                } else {
                    c[k++] = a[j++];
                }
            }
            for (k = low; k < high; k++) {
                a[k] = c[k];
            }
        }
    }

    public static void main(String[] args) {
        int N = 9;
        int i;
        int[] a = {3, 2, 5, 8, 4, 7, 6, 9, 1};
        MergeSort(a, 0, N);
        for (i = 0; i < N; i++) {
            System.out.print("  " + a[i]);
        }
    }
}
