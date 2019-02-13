package com.xust.thread;

import java.util.concurrent.*;

public class TestFutrue {
    public static void sleep(int mills) {
        try {
            Thread.sleep(mills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testFutrue() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                sleep(1000);
                return 1;
//                throw new IllegalArgumentException("异常");
            }
        });

        service.shutdown();

        try {
            System.out.println(future.get());
            System.out.println(future.get(100, TimeUnit.MILLISECONDS));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testFutrue();
    }
}
