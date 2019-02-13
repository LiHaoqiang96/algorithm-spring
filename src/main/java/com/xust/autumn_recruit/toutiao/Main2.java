package com.xust.autumn_recruit.toutiao;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();
        int[] array = new int[n * t];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int j = 0;
        for (int i = n; i < (n * t); i++) {
            if (j == n) {
                j = 0;
            }
            array[i] = array[j++];
        }

        int result = LIS(array);
        System.out.println(result);

    }

    public static int LIS(int[] array) {
        int len = 1;
        int[] B = new int[array.length];
        B[0] = array[0];
        int i, pos = 0;

        for(i=1; i < array.length; ++i) {
            if(array[i] >= B[len-1]) {
                B[len] = array[i];
                ++len;
            }
            else {
                pos = BiSearch(B, len, array[i]);
                B[pos] = array[i];
            }
        }
        return len;
    }
    public static int BiSearch(int[] b, int len, int w) {
        int left = 0, right = len - 1;
        int mid;
        while (left <= right) {
            mid = left + (right-left)/2;
            if (b[mid] > w) {
                right = mid - 1;
            }
            else if (b[mid] < w) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return left;
    }

}