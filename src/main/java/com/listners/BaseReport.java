package com.listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseReport {
	
	private static ExtentTest extentTest;
	private static ExtentReports extentReports;
	private static ExtentHtmlReporter extentHtmlReporter;
	
	public static ExtentReports getExtentReports() {
		return extentReports;
	}
	public static void setExtentReports(ExtentReports extentReports) {
	   BaseReport.extentReports = extentReports;
	}
	public static ExtentHtmlReporter getExtentHtmlReporter() {
		return extentHtmlReporter;
	}
	public static void  setExtentHtmlReporter(ExtentHtmlReporter extentHtmlReporter) {
		BaseReport.extentHtmlReporter = extentHtmlReporter;
	}
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
	public static void setExtentTest(ExtentTest extentTest) {
		BaseReport.extentTest = extentTest;
	}

}
