package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void validLogin() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void invalidLogin() {
		Assert.assertTrue(false);
	}
}
