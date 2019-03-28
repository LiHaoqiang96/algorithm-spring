package com.xust.spring_recruit2018.Weizhon.T2;

import java.util.Scanner;

public class Main {

	private static int sum;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		Main t=new Main();
		
		int[] a = new int [n-1];
		for(int i=2,j=0; i<n+1; j++,i++) {
			sum = 0;
			a[j] = t.transform(n, i);
		}
		
		for(int i=1; i<a.length; i++){
            if(a[i] < a[i-1]){
                int temp = a[i],j;
                for(j=i-1; j>-1 && temp <a[j]; j--){
                    a[j+1] = a[j];
                }
                a[j+1] = temp;
            }
        }
		
		System.out.println(a[a.length-1]);
	}
	
	public int transform(int num,int n){
		int array[]=new int[100];
		int location=0;
		while(num!=0){
			int remainder=num%n;
			num=num/n;
			array[location]=remainder;
			location++;
		}
		return show(array,location-1);

	}
	private int show(int[] arr,int n){
		for(int i=n;i>=0;i--){
			sum+=arr[i];
		}
		return sum;
	}
}
