package com.pro.zurich;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after");
	}
}
