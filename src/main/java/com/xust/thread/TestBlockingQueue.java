package com.xust.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Prouducer implements Runnable {
    private BlockingQueue<String> queue;

    public Prouducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; ++i) {
                Thread.sleep(50);
                queue.put(String.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ":" + queue.take());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class TestBlockingQueue {
    public static void testBlockingQueue() {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        new Thread(new Prouducer(queue)).start();
        new Thread(new Consumer(queue), "Consumer1").start();
        new Thread(new Consumer(queue), "Consumer2").start();
    }

    public static void main(String[] args) {
        testBlockingQueue();
    }
}
