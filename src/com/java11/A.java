package com.java11;

import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		
		Character c = '\u2001';
        String s = c + "abc" + c;
        
        System.out.println(s);
        
        String s1 = s.trim();
        System.out.println(s1);
        
        String s2 = s.repeat(0);
        System.out.println(s2);
        
        
        var s3 = "abc\nxyz\naaa";
        System.out.println(s3);
        
        
        List<String> list = s3.lines().collect(Collectors.toList());
        System.out.println(list);
	}
}
