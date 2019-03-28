package com.xust.spring_recruit2018.ali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String s1 = "";
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i)){
                    for(int k=i; k<j; k++){
                        if(s.charAt(k)!=s.charAt(j+k-i))
                            break;
                        s1+=s.charAt(k);
                    }
                }
                else{
                    break;
                }
            }
        }
        List<String> list = new ArrayList<>();
        list.add(s);
        list.remove(s1);
        System.out.println(s);
    }
}
