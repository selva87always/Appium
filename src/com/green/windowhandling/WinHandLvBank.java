package com.green.windowhandling;

import java.util.Set;

import com.green.factory.Base;

public class WinHandLvBank extends Base{
 
	public static void main(String[] args) throws InterruptedException {
		
		driver=getDriver("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		windowHandleLakshmiVilas page=new windowHandleLakshmiVilas();
		
		btnClick(page.getRestLoginPasswprd());
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> childWindows=driver.getWindowHandles();
		
		for (String eachChild : childWindows) 
		{
			if (!parentWindow.equals(eachChild)) 
			{
				driver.switchTo().window(eachChild);
			}
		}
		
		btnClick(page.getResetLoginPasswordLink());
		
		setText(page.getNetBankingLoginId(), "sfghsfkjbn");
		
		btnClick(page.getSubmitLink());
		
		System.out.println(getText(page.getErrorTextWhileLogin()));
		
		driverQuit(driver);
	}

}
