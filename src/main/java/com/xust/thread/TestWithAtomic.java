package com.xust.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class TestWithAtomic {
    private static int counter = 0;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void sleep(int mills) {
        try {
            Thread.sleep(mills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testWithAtomic() {
        for(int i = 0; i < 10; ++i) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    sleep(10);
                    for (int j = 0; j < 10; ++j){
                        System.out.println(atomicInteger.incrementAndGet());
                    }
                }
            }).start();
        }
    }

    public static void testWithoutAtomic() {
        for (int i = 0; i < 10; ++i) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    sleep(10);
                    for (int j = 0; j < 10; ++j) {
                        counter++;
                        System.out.println(counter);
                    }
                }
            }).start();
        }
    }

    public static void testAtomic() {
        testWithAtomic();
//        testWithoutAtomic();
    }
    public static void main(String[] args) {
        testAtomic();
    }
}
