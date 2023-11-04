package com.testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractriceTestingAnnotation {
	@Test
	public void test() {
		System.out.println("This is @Test");
	}
   @BeforeTest
   public void beforetest() {
	   System.out.println("This is @beforetest");
   }
   @BeforeMethod
   public void beforemethod() {
	   
   }
   @AfterTest
   public void aftertestmethod() {
	   System.out.println("This is @aftertest");
   }
   @AfterMethod
   public void aftersuitmethod() {
	   System.out.println();
   }
}
