package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LVBankLogin {

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver driver=b.getDriver("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement txtLoginId=driver.findElement(By.id("fldLoginUserId"));
		b.setText(txtLoginId, "e74683");
		WebElement txtPassword=driver.findElement(By.id("fldPassword"));
		b.setText(txtPassword, "hdgfja");
		WebElement btnSubmit=driver.findElement(By.name("imageField"));
		b.btnClick(btnSubmit);
		b.driverQuit(driver);
	}

}
