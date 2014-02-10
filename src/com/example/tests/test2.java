package com.example.tests;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class test2 {
	WebDriver driver;
	  DesiredCapabilities cap=null;
	  public String baseUrl;
	 
	
	public static void main(String[] args) throws MalformedURLException {
	
			 test2 ob = new test2();
			 ob.test3();
		  
	}
	public void test3() throws MalformedURLException{
		 cap=DesiredCapabilities.firefox();
		   cap.setBrowserName("firefox ");
		   driver=new RemoteWebDriver(new URL("http://192.168.1.32:4444/wd/hub"),cap);
		 
	   // driver = new FirefoxDriver();
	    baseUrl = "http://www.gwos.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  

	
	    driver.get(baseUrl + "/");
	    
	    driver.findElement(By.linkText("Pricing ")).click();
	   
	    		
	}

}
