package com;

import java.util.HashMap;

public class C {

	public static void main(String[] args) {
		
		HashMap<Person, String> map = new HashMap<Person, String>();
		
		Person p1 = new Person();
		Person p2 = p1;
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		map.put(p1, "abc");
		map.put(p2, "xyz");
		
		System.out.println(map.get(p2));
		System.out.println(map.get(p1));
	}
}
