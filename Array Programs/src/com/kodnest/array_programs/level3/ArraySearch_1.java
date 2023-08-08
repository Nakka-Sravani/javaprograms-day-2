package com.kodnest.array_programs.level3;

import java.util.Scanner;

public class ArraySearch_1 {
 public boolean  ispresent(int arr[],int target) {
	 Scanner sc=new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			if(target==arr[i]) {
				return true;
			}
		}
		return false;
		
 }
}