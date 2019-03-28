package com.xust.algorithm.sort;

/**
 * 基数排序
 *
 * @param //array 待排序数组
 * @param //d     表示最大的元素的位数
 */
public class Radix_Sort_08 {

    public static void RadixSort(int[] array, int d) {
        int n = 1;
        int times = 1; // 排序次数，由位数最多的元素决定
        int[][] temp = new int[10][array.length]; //数组的第一维表示可能的余数0-9
        int[] order = new int[10]; //数组order用来表示该位是i的元素个数
        while (times <= d) {
            for (int i = 0; i < array.length; i++) {
                int lsd = ((array[i] / n) % 10);
                temp[lsd][order[lsd]] = array[i];
                order[lsd]++;
            }
            int k = 0;
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        array[k] = temp[i][j];
                        k++;
                    }
                    order[i] = 0;
                }
            }
            n *= 10;
            times++;
        }
    }

    public static int Maximum(int[] array) {     //计算出数组中最大元素的位数

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        int digit = 0;
        while (max > 0) {
            max /= 10;
            digit++;
        }

        return digit;
    }

    public static void Group(int[] array) {

        int negative_num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative_num++;
            }
        }

        int[] negative = new int[negative_num];
        int[] positive = new int[array.length - negative_num];

        int n = 0, p = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative[n++] = array[i] * (-1);
            } else {
                positive[p++] = array[i];
            }
        }

        if (negative.length > 0) {
            RadixSort(negative, Maximum(negative));
            for (int i = negative.length - 1; i > -1; i--) {
                System.out.print(negative[i] * (-1) + "  ");
            }
        }

        if (positive.length > 0) {
            RadixSort(positive, Maximum(positive));
            for (int i : positive) {
                System.out.print(i + "  ");
            }
        }

    }

    public static void main(String[] args) {

        int[] array = {-3, -2, 5, -8, -0, 0, 6, 9};
        Group(array);

    }

}
