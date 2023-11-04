package com.testngpractice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertPractrice {
	int a=5;
	int b=9;
	@Test
	public void getSum() {
		System.out.println(a+b);//14
		Assert.assertEquals(a+b,14);
		
	}
	@Test
	public void getMultiply() {
		System.out.println(a*b);//45
		Assert.assertEquals(a*b,50);

	}
	

}
