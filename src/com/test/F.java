package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class F {

public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(4);
		list.add(0);
		list.add(8);
		list.add(9);
		
		System.out.println(list);
		
		list.stream().filter(s -> s.equals("")).collect(Collectors.toList());
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			list.add(8);
		}
		
		System.out.println(list);
	}
}
