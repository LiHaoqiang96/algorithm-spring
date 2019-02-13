package com.xust.autumn_recruit.meituan;

import java.util.*;

public class Main3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();   //滑动窗口大小
        int t = in.nextInt();   //出现次数
        int num = 0;

        List<Integer> window = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < k ; i++){
            int x = in.nextInt();
            window.add(x);
            map.put(x,map.get(x)==null?1:map.get(x)+1);
        }
        if(time(map.values().iterator(),t)){
            num++;
        }
        for(int i = k ; i < n ; i++){
            int temp = window.get(0);
            map.put(temp,map.get(temp)-1);
            window.remove(0);

            int x = in.nextInt();
            window.add(x);
            map.put(x,map.get(x)==null?1:map.get(x)+1);

            if(time(map.values().iterator(),t)){
                num++;
            }
        }
        System.out.println(num);
    }

    public static boolean time(Iterator<Integer>iterator,int t){
        int max = 0;
        while (iterator.hasNext()){
            max = Math.max(max,iterator.next());
        }
        return max >= t;
    }
}
