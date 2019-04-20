package com.xust.spring_recruit2019.qihu360;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String s = sc.nextLine();
            String[] nums1 = s.split(" ");
            int[] nums = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                nums[i] = Integer.valueOf(nums1[i]);
            }
            System.out.println(checkPossibility(nums));
        } while (sc.hasNext());
    }

    static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            count++;
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return count <= 1;
    }
}
