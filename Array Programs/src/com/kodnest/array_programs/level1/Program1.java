package com.kodnest.array_programs.level1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter array contents ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("array contents are :");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
