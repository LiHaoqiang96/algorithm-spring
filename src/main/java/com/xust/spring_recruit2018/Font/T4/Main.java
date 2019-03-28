package com.xust.spring_recruit2018.Font.T4;

import java.util.*;

/***
 * 给定一个长度小于50且包含字母和数字的任意字符串，
 * 要求按顺序取出当中的数字和英文字母，数字需要去重，
 * 重新排列后的字符串数字排前面字母排后面
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Set<Character> set = new LinkedHashSet<>();
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if ((s.charAt(i) >= 48) && (s.charAt(i) <= 57))
                set.add(s.charAt(i));
            if(  ((s.charAt(i) >= 65) && (s.charAt(i) <= 90))   ||
                    ((s.charAt(i) >= 97) && (s.charAt(i) <= 122)) )
                list.add(s.charAt(i));
        }
        List<Character> str = new ArrayList<>();
        str.addAll(set);str.addAll(list);
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<str.size(); i++){
            s1.append(str.get(i));
        }
        System.out.println(s1);
    }
}
