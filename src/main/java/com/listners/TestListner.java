package com.listners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utilities.AutomationUtils;

public class TestListner implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("=====Test execution started=====");
		 
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("=====Test execution successed=====");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("=====Test execution Failed=====");
		try {
			SuiteListner.extentTest.addScreenCaptureFromPath(AutomationUtils.takeScreenshot(), "Testcase failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
		SuiteListner.extentTest.fail("Testcase failed");
	}
	
	
	public void onStart(ITestContext context) {
		System.out.println("=====Test execution Start=====");	}

	
	public void onFinish(ITestContext context) {
		System.out.println("=====Test execution finish=====");
	}
	
	

	public void onTestSkipped(ITestResult result) {
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}


}
