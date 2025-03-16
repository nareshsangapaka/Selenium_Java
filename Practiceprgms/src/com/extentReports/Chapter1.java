package com.extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter1 {
	
	public static void main(String[] args) {
		
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter("C:\\Users\\user\\eclipse-workspace\\Practiceprgms\\report.html");
		extentReports.attachReporter(sparkReporter);
		
		extentReports.flush();
	}

}
