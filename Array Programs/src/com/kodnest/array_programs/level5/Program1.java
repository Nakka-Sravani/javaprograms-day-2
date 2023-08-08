package com.kodnest.array_programs.level5;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array-1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" number of elements which includes both +ve and -ve numbers");
		for(int i=0;i<=arr1.length-1;i++){
			arr1[i]=scan.nextInt();
		}
		System.out.println("Array Elements Before Replacing negative numbers with zero");
		for (int x : arr1) {
			System.out.print(x+" ");
		}
		Program1 replace=new Program1();
		replace.arrayReplace(arr1);
		System.out.println();
		System.out.println("Array Elements After Replacing negative numbers with zero");
		for (int x : arr1) {
			System.out.print(x+" ");
		}
	}
	void arrayReplace(int arr[]){
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]<0){
				arr[i]=0;
			}
		}
	}
}