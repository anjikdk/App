package com.test;

import java.util.concurrent.Callable;

public class A {

	public static void main(String[] args) {
		
		int arr[] = {76, 43, 100, 65, 4};
		
		for(int i=0; i<arr.length-1; i++)
		{
			int temp;
			if(arr[i] > arr[i+1])
			{
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println(arr[arr.length-1]);
		
		Thread.getDefaultUncaughtExceptionHandler();
		
//		Callable<V>
	}
}
