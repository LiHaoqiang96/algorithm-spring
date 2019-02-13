package com.xust.algorithm.sort;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sleep_Sort_09 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for(int i=0; i<8; i++){
            executorService.execute(new Sort());
        }
        executorService.shutdown();
    }
}

class Sort implements Runnable{

    private static int i=-1;

    int[] array = {3,2,5,8,4,7,6,9};
    @Override
    public void run() {
        if(i<array.length){
            synchronized (array){
                i++;
            }
            System.out.print(i+" ");
            try{
                synchronized (array) {
                    Thread.sleep(array[i]);
                    System.out.print(array[i]+" ");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}