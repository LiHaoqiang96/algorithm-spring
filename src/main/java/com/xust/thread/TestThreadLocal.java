package com.xust.thread;

public class TestThreadLocal {
    public static void sleep(int mills) {
        try {
            Thread.sleep(mills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ThreadLocal<Integer> threadLocalUserIds = new ThreadLocal<>();
    private static int userId;

    public static void testThreadLocal() {
        for(int i = 0; i < 10; ++i) {
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    threadLocalUserIds.set(finalI);
                    sleep(1000);
                    System.out.println("ThreadLocal: " + threadLocalUserIds.get());
                }
            }).start();
        }

        for (int i = 0; i < 10; ++i) {
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    userId = finalI;
                    sleep(1000);
                    System.out.println("NonThreadLocal: " + userId);
                }
            }).start();
        }
    }
    public static void main(String[] args) {
        testThreadLocal();
    }
}
