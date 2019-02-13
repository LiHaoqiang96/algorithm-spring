package com.xust.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "1").start();
        new Thread(ticket, "2").start();
        new Thread(ticket, "3").start();
    }
}

class Ticket implements Runnable {
    private int tick = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                Thread.sleep(10);
                if (tick > 0) {
                    System.out.println(Thread.currentThread().getName() + " 号窗口售出一张票，余票为：" + --tick);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

        }
    }
}