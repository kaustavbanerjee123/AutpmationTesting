package com.automation.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MR {
	
	 static WebDriver driver;

   public void scrollDown() throws InterruptedException{
	   
   System.setProperty("webdriver.chrome.driver",".WebDriver/chromedriver.exe");
	   
   driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   Thread.sleep(2000);
   
   driver.get("http://toolsqa.com/iframe-practice-page/");
   
   Thread.sleep(2000);
   
   JavascriptExecutor js = (JavascriptExecutor) driver;
   
   js.executeScript("window.scrollBy(0,5000)");
   
 }
}

		// TODO Auto-generated method stub

	


