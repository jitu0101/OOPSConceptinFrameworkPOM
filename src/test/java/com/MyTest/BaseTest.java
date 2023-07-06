package com.MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUpTest(String browser) {
		if(browser.equals("chrome"))
		{
			//driver = new ChromeDriver();
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();

			 driver = new ChromeDriver(options);
				//driver = new ChromeDriver();


		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		page = new BasePage(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
