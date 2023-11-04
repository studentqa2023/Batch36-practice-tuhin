package com.testngpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestngPractrice {

	@Test
	@Parameters("myname")
	public void parameterTest(String myname) {
		System.out.println(myname);
	}
	  }

