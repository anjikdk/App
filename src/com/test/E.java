package com.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class E {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 14, 10, 5, 4, 3, 7, 9, 2);
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			list.remove(4);
		}
		
	}
}
