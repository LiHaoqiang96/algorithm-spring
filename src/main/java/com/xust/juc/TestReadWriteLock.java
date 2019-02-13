package com.xust.juc;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {
    public static void main(String[] args) {
        ReadWriteLockDemo rw = new ReadWriteLockDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                rw.set((int)(Math.random()*101));
            }
        }, "Write: ").start();

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    rw.get();
                }
            }).start();
        }
    }
}

class ReadWriteLockDemo {
    private int number = 0;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void get() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " :" + number);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void set(int number) {
        lock.writeLock().lock();
        try {
            this.number = number;
            System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}