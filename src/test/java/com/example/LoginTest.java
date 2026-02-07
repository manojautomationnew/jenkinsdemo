package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void validLogin() {
		String env = System.getProperty("env", "staging");
		System.out.println("Running tests on environment: " + env);
		Assert.assertTrue(true);
	}
	
	@Test
	public void invalidLogin() {
		System.out.println("testing there");
		Assert.assertTrue(true);
	}
}
