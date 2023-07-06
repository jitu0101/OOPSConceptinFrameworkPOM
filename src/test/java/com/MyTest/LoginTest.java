package com.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.Homepgae;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void verifyLoginPageHeaderTest()
	{
		System.out.println("2nd test case execution");

	}
	
	@Test(priority=3)
	public void dologintest()
	{
		Homepgae homepage = page.getInstance(LoginPage.class).doLogin("jitendra.sonia12@gmail.com", "Ishani19!");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title1 = homepage.getHomePageTitle();
		System.out.println(title1);
		

	}

}
