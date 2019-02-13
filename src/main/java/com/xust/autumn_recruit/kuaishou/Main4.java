package com.xust.autumn_recruit.kuaishou;

import java.util.Arrays;
import java.util.Scanner;

class JIMU {
    private int W;
    private int L;

    public JIMU(int w, int l) {
        W = w;
        L = l;
    }
}
public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        JIMU[] obj = new JIMU[n];
        int[][] array = new int[n][2];
        int w, l;
        for (int i = 0; i < n; i++) {
            w = array[i][0] = input.nextInt();
            l = array[i][1] = input.nextInt();
            obj[i] = new JIMU(w, l);
        }
        int[] tempW = new int[n];
        int[] tempL = new int[n];
        for (int i = 0; i < n; i++) {
            tempW[i] = array[i][0];
            tempL[i] = array[i][1];
        }
        Arrays.sort(tempW);
        Arrays.sort(tempL);
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp;

            temp = tempW[i];
            tempW[i] = tempW[j];
            tempW[j] = temp;

            temp = tempL[i];
            tempL[i] = tempL[j];
            tempL[j] = temp;
        }
    }
}
