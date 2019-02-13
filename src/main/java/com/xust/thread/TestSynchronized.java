package com.xust.thread;

public class TestSynchronized {
    private static Object obj = new Object();

    public static void testSynchronized1() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 10; ++i) {
                    Thread.sleep(500);
                    System.out.println(String.format("T1:%d", i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void testSynchronized2() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 10; ++i) {
                    Thread.sleep(500);
                    System.out.println(String.format("T2:%d", i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void testSynchronized3() {
        synchronized (new Object()) {
            try {
                for (int i = 0; i < 10; ++i) {
                    Thread.sleep(500);
                    System.out.println(String.format("T3:%d", i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void testSynchronized() {
        for (int i = 0; i < 10; ++i) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    testSynchronized1();
                    testSynchronized3();
                }
            }).start();
        }
    }
    public static void main(String[] args) {
        testSynchronized();
    }
}
