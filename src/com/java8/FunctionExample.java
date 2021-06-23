package com.java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<String, Integer> f = (a) -> a.length();
		
		int len = f.apply("Ram");
		System.out.println(len);
	}
	
//	public static void test()
}
