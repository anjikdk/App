package com;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		
		Set<Person> list = new HashSet<Person>();
		
		Person p = new Person();
		p.setAge(20);
		p.setPhone(123);
		
		Person p1 = new Person();
		p1.setAge(20);
		p1.setPhone(123);
		
		list.add(p1);
		list.add(p);
		
		System.out.println(list);
		
		
	}
}
