package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum()
	{	System.out.println("sum");
		int a= 10;
		int b = 20;
		int c =a+b;
		Assert.assertEquals(30, c);
		
	}
	@Test
	public void sub()
	{	System.out.println("sup");
		int a= 10;
		int b = 20;
		
		Assert.assertEquals(10, b-a);
		
	}
	@Test
	public void div()
	{	System.out.println("div");
		int a= 10;
		int b = 20;
		
		Assert.assertEquals(2, b/a);
		
	}
	@Test
	public void mul()
	{	System.out.println("mul");
		int a= 10;
		int b = 20;
		
		Assert.assertEquals(200, a*b);
		
	}
}
