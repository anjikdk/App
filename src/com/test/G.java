package com.test;

import java.util.HashMap;
import java.util.Map;

public class G {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "abc");
		map.put(2, "abc");
		map.put(3, "abc");
		map.putIfAbsent(1, "zzz");
		
		System.out.println(map.get(1));
		
		
	}
}
