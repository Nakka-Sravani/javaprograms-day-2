package com.kodnest.array_programs.level1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter before Swapping :");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("enter two indexes to swap:");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		System.out.println("after Swapping: ");
		for(int i=0;i<=arr[i]-1;i++) {
			if(i==x) {
				System.out.print(arr[x]+" ");
			}
			else if(i==y) {
				System.out.print(arr[y]+" ");
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
