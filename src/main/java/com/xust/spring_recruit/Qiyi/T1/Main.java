package com.xust.spring_recruit.Qiyi.T1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String string = input.next();
        if(string.length()<1 || string.length()>50){
            System.exit(0);
        }
        System.out.println(getString(string));
    }

    public static String getString(String string){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<string.length(); i++){
            if(stack.isEmpty() || string.charAt(i)>=string.charAt(stack.peek()) ){
                stack.push(i);
            }
        }
        String result = "";
        String temp = "";
        int index = stack.peek();
        if(index != string.length()-1){
            temp = getString(string.substring(index+1, string.length()));
        }
        while (!stack.isEmpty() && string.charAt(stack.peek()) == string.charAt(index)){
            result += string.charAt(stack.pop());
        }
        return result+temp;
    }
}
