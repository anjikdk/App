package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicates {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		list.addAll(list1);
		System.out.println(list);
		
		List<String> duplicateList = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for(String s : list)
		{
			if(list2.contains(s))
			{
				duplicateList.add(s);
			}
			else
				list2.add(s);
		}
		
		System.out.println(duplicateList);
		
		Set<String> set = new HashSet<String>();
		List<String> list3 = new ArrayList<String>();
		
		for(String s : list)
		{
			if(!set.add(s))
			{
				list3.add(s);
			}
		}
		
		System.out.println(list3);
		
		Set<String> set1 = new HashSet<String>();
		List<String> list4 = list.stream().filter(s -> !set1.add(s)).collect(Collectors.toList());
		System.out.println(list4);
	}
}
