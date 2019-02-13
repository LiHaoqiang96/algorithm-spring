package com.xust.autumn_recruit.jd;

import java.util.ArrayList;

public class Main2 {
    public static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Thread t1 = new Main2().new MyThread();
        Thread t2 = new Thread(new Main2().new MyRunable());
        t1.setPriority(3);
        t2.setPriority(8);
        t1.start();
        t2.start();
        t2.join();
        for (int i = 0; i < 100000; i++) {
            i++;
        }
        list.add("main");

        t1.join();
        for (String s : list) {
            System.out.println(s);
        }
    }
    class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 100000; i++) {
                i++;
            }
            list.add("Thread 1");
        }
    }
    class MyRunable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                Thread.yield();
                i++;
            }
            list.add("Thread 2");
        }
    }
}
