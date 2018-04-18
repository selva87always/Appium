package com.green.junit;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.green.factory.Base;
import com.green.factory.PayTMLogin;

public class PaytmTaskSignInByJunit extends Base{

	@Before
	public void paytmLogin() throws Throwable {
		driver=getDriver("https://paytm.com/");
		Thread.sleep(4000);
	}
	@Test
	public void loginPaytm() throws Throwable{
		PayTMLogin page=new PayTMLogin();
		btnClick(page.getLoginLink());
		Thread.sleep(3000);
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow.length());
		Set<String> childWindows=driver.getWindowHandles();
		System.out.println(childWindows.size());
		for (String eachChild : childWindows) 
		{
			if (!parentWindow.equals(eachChild)) 
			{
				driver.switchTo().window(eachChild);				
			}
		}
		setText(page.getMobileOREmail(), "9600854130");
		setText(page.getPassword(), "chandra1987");
		btnClick(page.getLoginSecurely());
	}
	
	
}
