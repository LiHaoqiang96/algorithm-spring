package com.xust.thread;

class MyThread extends Thread {
    private int tid;

    public MyThread(int tid) {
        this.tid = tid;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(500);
                System.out.println(String.format("T%d:%d", tid, i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread1 {
    public static void testThread() {
        for(int i = 0; i < 10; ++i) {
            new MyThread(i).start();
        }
    }
    public static void main(String[] args) {
        testThread();
    }
}
