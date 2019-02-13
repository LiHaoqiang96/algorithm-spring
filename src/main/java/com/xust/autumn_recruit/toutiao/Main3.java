package com.xust.autumn_recruit.toutiao;

import java.util.Scanner;
public class Main3 {
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

        int result = longest(array);
        System.out.print(result);

    }

    public static int longest(int[] a)
    {
        int n = a.length;
        int[] num = new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            num[i]=1;
            for(j=0;j<i;j++)
            {
                if(a[j]<a[i]&&num[j]+1>num[i])
                    num[i]=num[j]+1;
            }
        }
        int max=0;
        for(i=0;i<n;i++)
            if(max<num[i])
                max=num[i];
        return max;
    }
}
