package com.xust.autumn_recruit.pingduoduo;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int L = input.nextInt();

        String[] strArray = new String[N];
        for (int i = 0; i < strArray.length; i++) {
            String s = input.next();
            if (s.length() == L) {
                strArray[i] = s;
            }
        }

        String s = "";
        for (int i = 0; i < strArray.length; i++) {
            s += strArray[i];
        }

        String result = "";
        /*for (int i = 0; i < s.length(); i++) {
            result = "";
            result += (s.charAt(i) + s.charAt()
        }*/

    }
}
