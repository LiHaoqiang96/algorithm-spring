package com.xust.autumn_recruit.didi;

import java.util.*;

public class Main {
    public static void MapValueSort(Map<String, Integer> map) {
        Comparator<Map.Entry<String, Integer>> value = new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        };
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list, value);

        int cnt = 0;
        for (Map.Entry<String, Integer> entry : list) {
            if (cnt < 3) {
                cnt++;
                System.out.print(entry.getKey() + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] temp = str.split(" ");
        String[] array = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
        Map<String, Integer> map = new TreeMap<>();
        int length = array[0].length();
        for (int i = 1; i < array.length; i++) {
            int sum = 0;
            if (array[i].length() == length) {
                for (int j = 0; j < length; j++) {
                    if (array[i].charAt(j) != array[0].charAt(j)) {
                        sum += 1;
                    }
                }
            } else {
                sum += 3;
            }
            map.put(array[i], sum);
        }
        MapValueSort(map);
    }
}