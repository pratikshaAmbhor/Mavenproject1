package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

 public class ListenersClass implements ITestListener {
           //Test Case repeat this method
//	public void onTestStart(ITestResult result) {
//		System.out.println("On start");
//	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Failure");
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("on Finish");
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	
 
 
 }


