package com.listners;

import java.io.File;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utilities.AutomationUtils;

public class SuiteListner implements ISuiteListener {

	static ExtentTest extentTest;
	static ExtentReports extentReports;
	static ExtentHtmlReporter extentHtmlReporter;


	public void onStart(ISuite suite) {
		System.out.println("=====Suite Started=====");

		extentHtmlReporter = new ExtentHtmlReporter(new File(
"C:\\CountersignTechnology\\StargateMavenProject\\src\\test\\resources\\Reports\\Report"+AutomationUtils.timeStamp()+".html"));
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);

		extentTest = extentReports.createTest("First Test");

		extentTest.info("Start Application");

	}


	public void onFinish(ISuite suite) {
		System.out.println("=====Suite Finished=====");
		extentReports.flush();
	}

}
