package com.xust.autumn_recruit;

import java.util.*;

public class Test {
    public static void print(int index, Object obj){
        System.out.println(String.format("{%d}:%s",index, obj));
    }
    public static void main(String[] args) {
        Integer[] array = {3, 2, 5, 8, 4, 7, 6, 9};
//        Arrays.sort(array);
        List<Integer> list1 = Arrays.asList(array);

        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i: list1){
            print(1, i);
        }

        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(3);list.add(2);list.add(5);
        list.add(8);list.add(4);list.add(7);
        list.add(6);list.add(9);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i: list){
            print(2, i);
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
