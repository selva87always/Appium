package com.green.junit;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

import com.green.factory.Base;
import com.green.windowhandling.windowHandleLakshmiVilas;

public class LVBTaskGetFooterTextByJUnit extends Base{

	@Test
	public void footerCopyWriteVerification() {
		
		driver=getDriver("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		windowHandleLakshmiVilas page=new windowHandleLakshmiVilas();
		
		btnClick(page.getTroublelogin());
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> childWindows=driver.getWindowHandles();
		
		for (String eachChild : childWindows) 
		{
			if (!parentWindow.equals(eachChild)) 
			{
				driver.switchTo().window(eachChild);
			}
		}
		
		String actual=getText(page.getFooterCopyRightsText());
		
		System.out.println(actual);
		
		String expected="   © 2008 The Lakshmi Vilas Bank Ltd. All rights reserved";
		
		assertEquals(actual, expected);
	}
	
}
