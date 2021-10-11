package principal;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;
import java.util.concurrent.TimeUnit;


import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.IInvokedMethod;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.annotations.ITest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Module.SmokeTest;
import PageObjects.HomePageObjects;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class MainClass {
	public static WebDriver driver;
	
	 public static ExtentHtmlReporter htmlReporter;
	 public static ExtentReports extent;
	 public static ExtentTest test;


	SoftAssert a1= new SoftAssert();

	
	    @BeforeSuite
	    public void startReport() throws IOException, InterruptedException {
		
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");



			ChromeOptions options = new ChromeOptions ();

			options.addExtensions (new File(System.getProperty("user.dir")+"/MetaMask_v10.0.3.crx"));

			DesiredCapabilities capabilities = new DesiredCapabilities ();

			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(capabilities);
			
			driver.manage().window().maximize();
		 	
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/TestResults.html");
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("Test Results Snapshot ");
	        htmlReporter.config().setReportName("Smoke Test Summary Results");
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	        
	        new SmokeTest().LoginWalletPolygonTechnology();
	    }
	 
	
	    
	 @AfterMethod
	    public void getResult(ITestResult result) throws InterruptedException {
		 
			/*
			 * Object[] ob = result.getParameters();
			 * 
			 * if(result.getParameters().length>2 && (ob[1].equals("yes"))) {
			 */
		    
		 
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else if (result.getStatus() == ITestResult.SKIP){
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	        
	        
			
	    }
	     
	 	@AfterSuite
	    public void tearDown() {
	    	
	        extent.flush();
	        getDriver().quit();
	    }
	 	
	 	public WebDriver getDriver()
	 	{
	 		return MainClass.driver;
	 	}
}
