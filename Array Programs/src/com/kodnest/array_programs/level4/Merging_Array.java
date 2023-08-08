package com.kodnest.array_programs.level4;

import java.util.Scanner;

public class Merging_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array 1 length");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("enter array 2 length");
		int arr2[]=new int[sc.nextInt()];
		int arr3[]=new int[arr1.length+arr2.length];
		System.out.println("enter array 1 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter array 2 elements");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		System.out.println("enter array 3 elements");
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
