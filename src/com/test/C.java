package com.test;

class C implements Runnable
{
	volatile int i;
	public void run()
	{
		for(i=1; i<=50; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String str[])
	{
		C a = new C();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
