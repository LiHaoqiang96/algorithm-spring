package com.xust.thread;

public class MultiThread2 {
    public static void testThread() {
        for (int i = 0; i < 10; ++i) {
            final int tid = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                        try {
                            for (int i = 0; i < 10; ++i) {
                                Thread.sleep(1000);
                            System.out.println(String.format("T%d:%d", tid, i));

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        testThread();
    }
}
