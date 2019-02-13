package com.xust.algorithm.sort;

public class Main {

    public static void main(String[] args) {
        String[] str = {"aba","aba","abc","cba","def"};
        for(int i=0; i<str.length-1; i++){
            String s1 = str[i];
            for(int j=i+1; j<str.length; j++){
                String s2 = str[j];
                String s3 = s1+s2;
                if(isHuiWen(s3)){
                    System.out.print("["+s1+","+s2+"]");
                }
            }
        }
    }

    public static boolean isHuiWen(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
