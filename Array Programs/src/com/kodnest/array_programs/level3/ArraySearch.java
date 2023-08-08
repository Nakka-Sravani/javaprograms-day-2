package com.kodnest.array_programs.level3;

import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	 int arr[]=new int[sc.nextInt()];
	 System.out.println("enter elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
	System.out.println("enter target:");
	int target=sc.nextInt();
	ArraySearch_1 ob=new ArraySearch_1();
	boolean res=ob.ispresent(arr,target);
	if(res==true) {
		System.out.println("target found in array");
	}
	else {
		System.out.println("target found in array");
	}
}
}