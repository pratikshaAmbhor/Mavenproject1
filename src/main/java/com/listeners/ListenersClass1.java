package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass1 implements ITestListener{

//	public void onTestStart(ITestResult result) {
//		System.out.println("On Test Start");
//	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed within success Percentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test FailedwithTimeOut");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

//	
	
	

}
