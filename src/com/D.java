package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class D {

	public static void main(String[] args) {
		
		D.test();
	}
	
	public static void test()
	{
		List<Integer> list = new ArrayList<>(Arrays.asList(1000,200,30,400));
		
		List<Integer> list1 = list.stream().map(a -> a*a).filter(a -> a > 10000).collect(Collectors.toList());
		
		System.out.println(list1);
		int sum = list.stream().map(a -> a*a).filter(a -> a > 10000).reduce(0, (a,b) -> a+b);
		System.out.println(sum);
	}
}
