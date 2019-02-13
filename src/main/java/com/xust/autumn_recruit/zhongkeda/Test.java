package com.xust.autumn_recruit.zhongkeda;

public class Test {

    public static void main(String[] args) {
        int index = 0;
        boolean flag = false;
        System.out.println((flag!=!flag?index--:index++)==index ? flag:++index);
    }
}
