package com.pro.zurich;

import org.testng.annotations.Test;
public class NewTest extends BaseClass{
	
	
  @Test
  public void f() {
	  
	  System.out.println("first");
	  System.out.println("after commit");
  }
  
  @Test
  public void f1() {
	 
	  System.out.println("updated");
  }
	
	@Test
	 public void f2() {
	   System.out.println("jenkins configuration");
	  System.out.println("updated second");
  }
}
