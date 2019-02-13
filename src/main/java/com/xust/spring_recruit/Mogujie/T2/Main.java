package com.xust.spring_recruit.Mogujie.T2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c==',')
                continue;
            list.add(Integer.parseInt(String.valueOf(c)));
        }
        int[] a = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            a[i] = list.get(i);
        }
        System.out.println(fun(a));
    }
    public static int fun(int[] ratings) {
        int pre = 1, count = 0, total = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] >= ratings[i - 1]) {
                if (count > 0) {
                    total += count * (count + 1) / 2;
                    if (count >= pre) {
                        total += count - pre + 1;
                    }
                    pre = 1;
                    count = 0;
                }
                pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1;
                total += pre;
            }
            else {
                count++;
            }
        }
        if (count > 0) {
            total += count * (count + 1) / 2;
            if (count >= pre) {
                total += count - pre + 1;
            }
        }
        return total;
    }
}
