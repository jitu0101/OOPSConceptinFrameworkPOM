package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepgae extends BasePage {

	//locators
	private By header = By.xpath("");

	
	public Homepgae(WebDriver driver) {
		super(driver);
	}

	public WebElement getHeader() {
		return getElement(header);
	}	
	
	public String getHomePageTitle() {
		return getPageTitle();
	}

	

}
