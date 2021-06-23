package com.java11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("abc");
		l.add("xyz");
		
		
		l.stream().filter((var s) -> s.startsWith("a")).collect(Collectors.toList());
	}
}
