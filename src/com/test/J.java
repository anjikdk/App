package com.test;

import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		
		String val = ""+((int)(Math.random()*9000)+1000);
		System.out.println(val);
		
		System.out.println("Enter 4 digit number");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		if(num.equals(val))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
	}
}
