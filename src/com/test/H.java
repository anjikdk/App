package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class H {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
		
		List<Integer> squareList = list.stream().map(s -> s*s).collect(Collectors.toList());
		System.out.println(squareList);
		
		Stream<Integer> stream = list.stream().map(s -> s*s);
		Stream<Integer> stream1 = stream.filter(s -> s >= 10);
		stream1.collect(Collectors.toList());
//		List<Integer> squareList1 = stream1.collect(Collectors.toList());
//		System.out.println(squareList1);
		
		Optional<Integer> sum = list.stream().map(s -> s*s).reduce((x,y) -> x+y);
		if(sum.isPresent())
		{
			System.out.println(sum.get());
		}
		
		
		Optional<Integer> evenSum = list.stream().filter(s -> s%2 == 0).map(s -> s*s).reduce((x,y) -> x+y);
		Optional<Integer> oddSum = list.stream().filter(s -> s%2 != 0).map(s -> s*s).reduce((x,y) -> x+y);
		
		System.out.println(evenSum.get());
		System.out.println(oddSum.get());
		
		
		
	}
}
