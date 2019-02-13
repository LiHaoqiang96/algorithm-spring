package com.xust.autumn_recruit.beike;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*class Puke {
    private char pai;
    private int count;

    public Puke(char pai, int count) {
        this.pai = pai;
        this.count = count;
    }
}*/
public class Main2 {

    static String reg1="^\\d+$";
    static String reg2="^[a-zA-Z]+$";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        List<Character> number = new ArrayList<>();
        List<Character> character = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= '2' && (s.charAt(i) <= '9')) {
                number.add(s.charAt(i));
            }
            if (s.charAt(i) >= 'A' && (s.charAt(i) <= 'Z')) {
                character.add(s.charAt(i));
            }
        }
        Collections.sort(number);
        Collections.sort(character);
        for (char i:number) {
            System.out.println(i);
        }
        for (char i:character) {
            System.out.println(i);
        }
    }
}
