package com.kodnest.array_programs.level2;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		 int arr[]=new int[sc.nextInt()];
		 System.out.println("enter elements");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<=arr.length-1;i++) {
				sum+=arr[i];
			}
			System.out.println("sum of array elements is :"+sum);
	}

}
