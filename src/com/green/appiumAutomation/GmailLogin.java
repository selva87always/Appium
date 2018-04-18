package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLogin {
	
	public static void main(String[] args) throws Throwable  {
		Base b=new Base();
		WebDriver driver=b.getDriver("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement txtemailId=driver.findElement(By.id("identifierId"));
		b.setText(txtemailId, "selva87always");
		WebElement btnNext=driver.findElement(By.xpath("//span[contains(text(), 'Next')]"));
		b.btnClick(btnNext);
		Thread.sleep(2000);
		WebElement txtPassword=driver.findElement(By.name("password"));
		b.setText(txtPassword, "chandra1987");
		WebElement btnNext1=driver.findElement(By.xpath("//span[contains(text(), 'Next')]"));
		b.btnClick(btnNext1);
		//b.driverQuit(driver);
	}

}
