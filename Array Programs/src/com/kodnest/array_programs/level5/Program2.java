package com.kodnest.array_programs.level5;

import java.util.Iterator;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array 1 length");
		int arr1[]=new int[sc.nextInt()];
		int arr2[]=new int[arr1.length];
		System.out.println("enter array 1 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter array 2 elements");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("array 1 elements are : ");
		for(int x:arr1) {
			System.out.println(x+" ");
		}
		System.out.println("array 2 elements are : ");
		for(int x:arr2) {
			System.out.println(x+" ");
		}
		Program2_1 S=new Program2_1();
		S.Sum(arr1,arr2);
		
	}

}
