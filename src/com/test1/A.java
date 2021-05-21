package com.test1;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Integer sum = Arrays.asList(numbers).stream().map(s -> s*s).reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
	}
}
