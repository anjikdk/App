package com.test1;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		String s = "58647";
		
		String arr[] = new String[s.length()-1];
		int j = 0;
		for(int i=0; i<s.length(); i++)
		{
			try
			{
				arr[j] = s.charAt(i)+""+s.charAt(++i);
//				System.out.println(arr[j]);
				i--;
				j++;
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		
		System.out.println(array[array.length-1]);
		
		
	}
}
