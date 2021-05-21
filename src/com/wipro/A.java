package com.wipro;

public class A {

	public boolean isCorrectFormat(String formatStr)
	{
		boolean b = false;
		if(formatStr.startsWith(")"))
			b = false;
		if(formatStr.endsWith("("))
			b = false;
		
		int count1 = 0;
		int count2 = 0;				
		for(int i=0; i<formatStr.length(); i++)
		{
			if(formatStr.charAt(i) == '(')
				count1++;
			else if(formatStr.charAt(i) == ')')
				count2++;
		}
		
		if(count1 == count2)
			b = true;			
		
		return b;
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.isCorrectFormat(")()"));
	}
}
