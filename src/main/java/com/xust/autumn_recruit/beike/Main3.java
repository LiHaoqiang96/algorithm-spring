package com.xust.autumn_recruit.beike;

import java.util.*;

class Puke {
    private char pai;
    private int count;

    public Puke(char pai, int count) {
        this.pai = pai;
        this.count = count;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        Map<Character, Integer> map = new TreeMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
                set.add(s.charAt(i));
            } else {
                int temp = map.get(s.charAt(i));
                map.put(s.charAt(i), temp+1);
                set.add(s.charAt(i));
            }
        }

        Puke[] array = new Puke[set.size()];
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
