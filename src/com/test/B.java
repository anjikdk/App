package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class B {

	public static void main(String[] args) {
		
		int arr[] = {26, 42, 39, 27, 10, 42, 6, 11, 1, 32};
		
		Arrays.sort(arr);
		
//		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i : arr)
		{
			if(!list.contains(i))
			{
				list.add(i);
			}
		}
		
		System.out.println(list.get(list.size()-3));
		
		
		String s = "Ram";
		String s1 = new String("Ram");
		String s2 = s1;
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s));
		System.out.println(s.equals(s1));
		
		System.out.println(s1 == s2); // true
		System.out.println(s2 == s);  // false
		System.out.println(s == s1); // flase
	}
}
