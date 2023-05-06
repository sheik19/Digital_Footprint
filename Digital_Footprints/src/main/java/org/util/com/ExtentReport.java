package org.util.com;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports reports;
	public static ExtentSparkReporter htmlreport;
	public static ExtentTest test;
	public static String currentDir = System.getProperty("user.dir");

	//To avoid external initialization
	private ExtentReport() {
		reports = new ExtentReports();
		htmlreport = new ExtentSparkReporter(currentDir+"\\target\\APIreports\\API_Report"+".html");
		reports.attachReporter(htmlreport);
		htmlreport.config().setReportName("CTOS_DIGITAL_FOOTPRINT");
		htmlreport.config().setDocumentTitle("CTOS_DIGITAL_FOOTPRINT");
		htmlreport.config().setTheme(Theme.STANDARD);
		
		
	}

	public static void initialize()
	{
		new ExtentReport();
	}

}
