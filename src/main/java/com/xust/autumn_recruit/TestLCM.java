package com.xust.autumn_recruit;

public class TestLCM {
    /**
     * 1-N的最小公倍数
     * LCM:最小公倍数
     * 说明:循环并依次整除,当全部整除时得到的值即为最小公倍数
     */
    public void testLCM() {
        int result = 0;
        int countNum = 20;//需要计算的数目:1-20的最小公倍数
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int num = countNum;
            while (num > 0) {
                int count = 0;
                for (int j = 1; j <= countNum; j++) {
                    if (i % j != 0) {
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == countNum) {
                    result = i;
                    break;
                }
                num--;
            }
            if (result > 0) {
                System.out.println(result);
                break;
            }
        }
    }
}
