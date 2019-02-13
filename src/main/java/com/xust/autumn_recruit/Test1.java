package com.xust.autumn_recruit;

public class Test1 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = subsequences(s);
        System.out.println(s1);
    }
    public static String subsequences(String word) {
        if (word.isEmpty()) {
            return ""; // base case
        } else {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);

            String subsequencesOfRest = subsequences(restOfWord);

            String result = "";
            for (String subsequence : subsequencesOfRest.split(",", -1)) {
                result += "," + subsequence;
                result += "," + firstLetter + subsequence;
            }
            result = result.substring(1); // remove extra leading comma
            return result;
        }
    }
}
