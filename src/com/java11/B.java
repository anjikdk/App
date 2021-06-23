package com.java11;

import java.util.ArrayList;
import java.util.List;

public class B {

	public static void main(String[] args) {
		
		String s = "abc";
		var s1 = s.concat("xyz");
		
		System.out.println(s1);
		
		var<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("xyz");
		
		System.out.println(list);
		
		new B().test(list);
	}
	
	public void test(ArrayList<Object> list)
	{
		
	}
	
}
