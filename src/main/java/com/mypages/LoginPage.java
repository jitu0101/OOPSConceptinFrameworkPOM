package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	//Page locators
	
	private By emailid = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("");
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}


	/**
	 * @return the emailid
	 */
	public WebElement getEmailid() {
		return getElement(emailid);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);

	}
	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}	
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
  public Homepgae doLogin(String username, String pwd)
   {
	  getEmailid().sendKeys(username);
	  getPassword().sendKeys(pwd);
	  getLoginButton().click();
	  
	  return getInstance(Homepgae.class);
    }
  
  public Homepgae doLogin()
  {
	  getEmailid().sendKeys("");
	  getPassword().sendKeys("");
	  getLoginButton().click();
	  
	  return getInstance(Homepgae.class);
   }
}
