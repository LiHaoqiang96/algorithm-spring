package com.xust.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。FutureTask是Future接口的实现类
 */
public class TestCallable {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        FutureTask<Integer> result = new FutureTask<>(threadDemo);
        new Thread(result).start();
        try {
            Integer sum = result.get();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
}