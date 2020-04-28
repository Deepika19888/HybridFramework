package com.qa.beartax.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.beartax.model.BearTaxTestSuite;
//import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class DriverScript {
	public static WebDriver driver;
	public static Properties prop;
	private BearTaxTestSuite regressionTestSuite;

	public DriverScript() {

		try {
			regressionTestSuite = new BearTaxTestSuite();
			System.out.println("Constructor called.");
			// Crate the Object for properties and put it in file
			prop = new Properties();
			File file = new File(
					"/Users/arunkumarhariharan/Desktop/FebClass/Class/com.qa.beartax/Config/config");
			FileInputStream files = new FileInputStream(file);
			prop.load(files);
		
			for(Object key : prop.keySet())
			{
				System.out.println("Key : " + key + " , Value : " + prop.get(key));
			}
			//initialization();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No File" + e.getMessage());
			e.printStackTrace();
		}
	}

	
	public  void initialization() {
		
		String Browser = prop.getProperty("Browser");
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/arunkumarhariharan/Desktop/FebClass/chromedriver80");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String url = prop.getProperty("LunchURL");
		System.out.println(url);
		driver.get(url);
	}
public void signinInitialization(){
	String Browser = prop.getProperty("Browser");
	if (Browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarhariharan/Desktop/FebClass/chromedriver80");
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	String url1 = prop.getProperty("SigninURL");
	System.out.println(url1);
	driver.get(url1);
}

public void signupInitialization(){
	String Browser = prop.getProperty("Browser");
	if (Browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarhariharan/Desktop/FebClass/chromedriver80");
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	String url1 = prop.getProperty("SignupURL");
	System.out.println(url1);
	driver.get(url1);
}
	public BearTaxTestSuite getRegressionTestSuite() {
		return regressionTestSuite;
	}


	public void setRegressionTestSuite(BearTaxTestSuite regressionTestSuite) {
		this.regressionTestSuite = regressionTestSuite;
	} 
	
	
}


