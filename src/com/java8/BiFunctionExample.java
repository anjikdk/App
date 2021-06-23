package com.java8;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bif = (a, b) -> a+b;
		
		int k = bif.apply(10, 30);
		System.out.println(k);
	}
}

