package com.testngpractice;

import org.testng.annotations.Test;

public class PracticeTestngMethod {
	@Test(priority=0,invocationCount=5)
	public void login (){
		System.out.println("This is login method");	
	}
	@Test(priority=1,dependsOnMethods = "login")
  public void dress () {
	  System.out.println("This is dress method");
  }
	@Test(priority=2)
   public void cart () {
	  System.out.println("This is cart method");
  }
	@Test(priority=3,enabled=false)
   public void payment() {
	   System.out.println("This is payment method");
   }
	@Test(priority=4)
   public void placeorder() {
	   System.out.println("This is placeorder method");
	   
   }
  
}
