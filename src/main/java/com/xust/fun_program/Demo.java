package com.xust.fun_program;

public class Demo {

    public static void main(String[] args) {

        MyLamdaInterface lamdaInter=System.out::println;

        lamdaInter.doSomeThing("success");

    }
}
