package com.java11;

public class C {

	public static void main(String[] args) {
		
		var fname = "abc";
		var lname = "xyz";
		var age = 25;
		
		new C().test(fname, lname, age);
	}
	
	public void test(String fname, String lname, int age)
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(age);
	}
}
