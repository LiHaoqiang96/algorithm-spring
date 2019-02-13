package com.xust.algorithm.day;

import java.util.Scanner;
import java.util.Stack;

/**
 * 题目：
 验证括号是否能正常闭合。包含 () [] {}。
 例如： {[()]}{}()[] 这个是能正常闭合的。(})]{ 这个是不能正常闭合的。
 输入：字符串s。
 输出：YES或者NO。
 * */
public class Topic_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        System.out.println(Topic_02.judgment(s));
    }
    public static String judgment(String s){
        if (s==null){
            return "No";
        }
        Stack<Character> stack=new Stack<>();
        for (int i=0 ;i<s.length() ;i++){
            if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if (s.charAt(i)=='}'&&!stack.isEmpty()){
                if (stack.pop()!='{'){
                    return "No";
                }
            }else if (s.charAt(i)==']'&&!stack.isEmpty()){
                if (stack.pop()!='['){
                    return "No";
                }
            }else if (s.charAt(i)==')'&&!stack.isEmpty()){
                if (stack.pop()!='('){
                    return "No";
                }
            }else {
                return "No";
            }
        }
        if (stack.isEmpty()){
            return "Yes";
        }
        return "No";
    }
}
