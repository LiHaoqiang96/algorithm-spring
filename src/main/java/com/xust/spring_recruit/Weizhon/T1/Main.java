package com.xust.spring_recruit.Weizhon.T1;

import java.util.Scanner;

public class Main {
	private static int sum;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        sum=0;
        int a = Main.D_System_02(n);
        sum=0;
        int b = Main.D_System_08(n);
        sum=0;
        int c = Main.D_System_12(n);
        
        System.out.println(a>b?a:(b>c?b:c));
	}
	
	public static int D_System_02(int n) {
		if(n>0) {
			D_System_02(n/2);
			sum+=(n%2);
		}
		return sum;
	}
	public static int D_System_08(int n) {
		if(n>0) {
			D_System_08(n/8);
			sum+=(n%8);
		}
		return sum;
	}
	public static int D_System_12(int n) {
		if(n>0) {
			D_System_12(n/12);
			sum+=(n%12);
		}
		return sum;
	}
}
