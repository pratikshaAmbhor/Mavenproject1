package com.TestngPgm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestng {

	 @Test
	 public void TestCase1() {
		 System.out.println("================First Test Cases1===================");
	 }

	 @Test
	 public void TestCase2() {
		 System.out.println("***************Second Test Cases2*****************");
	 }

	 @Test
	 public void TestCase3() {
		 System.out.println("----------------fail Test Cases3--------------------");
		 Assert.assertTrue(false);
	 }
	 @Test
	 public void TestCase4() {
		 System.out.println("----------------fail Test Cases4--------------------");
		 Assert.assertTrue(false);
	 }
	 
	
	
	
 }
