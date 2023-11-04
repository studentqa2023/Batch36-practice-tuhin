package com.testngpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestng {
	@Test
	@Parameters({"myName","a"})
	public void parameterTesting(String myName,int a) {
		System.out.println(myName);
		System.out.println(a);
		
	
	
		
	}

}
