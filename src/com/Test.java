package com;

public class Test{

	public static void main(String[] args) {
		
		String s = "abc xyz  Ram	Rakesh                       abs";
		String s1[] = s.split("\\s+");
		for(String s2 : s1)
		{
			System.out.println(s2);
		}
		
//		Predicate<T>
	}
}
