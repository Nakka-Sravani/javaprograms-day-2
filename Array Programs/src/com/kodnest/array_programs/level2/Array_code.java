package com.kodnest.array_programs.level2;

import java.util.Scanner;

public class Array_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[] {10,20,30,40};
    int arr1[]=new int[arr.length];
    System.out.println("array 1 elements");
    for(int i=0;i<=arr.length-1;i++) {
    	System.out.println(arr[i]);
    }
    ArrayCopy(arr);
    
	}
	public static int ArrayCopy(int arr[]) {
		Scanner sc=new Scanner(System.in);
	    int arr1[]=new int[arr.length];
	    System.out.println("array 2 elements");
	    for(int i=0;i<=arr.length-1;i++) {
	    	arr1[i]=arr[i];
	    	System.out.println(arr1[i]);
	    }
	    return 0;
	}

}
