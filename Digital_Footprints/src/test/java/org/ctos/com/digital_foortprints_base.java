package org.ctos.com;

import java.awt.Robot;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class digital_foortprints_base {
	public static Robot r;
	public static ExtentReports reports;
	public static ExtentSparkReporter htmlreport;
	public static ExtentTest test;
	public static FileReader filereader;
	public static Properties props;
	public static String randamtext,updateemail;
	public static String currentDir = System.getProperty("user.dir");
	
	@BeforeSuite
	public void setup() {

		reports = new ExtentReports();
		htmlreport = new ExtentSparkReporter(currentDir+"\\target\\APIreports\\API_Report"+".html");
		reports.attachReporter(htmlreport);
		htmlreport.config().setReportName("CTOS_DIGITAL_FOOTPRINT");
		htmlreport.config().setDocumentTitle("CTOS_DIGITAL_FOOTPRINT");
		htmlreport.config().setTheme(Theme.STANDARD);
		
	}
	
	@BeforeMethod
	public void configdatareader() throws IOException {
		filereader=new FileReader(currentDir+"\\config.properties");
        props=new Properties();
        props.load(filereader);
       
            randamtext = "abcdefghijklmnopqrstuvwxyz";
            int length = 4;
            updateemail = RandomStringUtils.random(length, randamtext);
            
          
       
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
