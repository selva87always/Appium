package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailRegisration {
 
	public static void main(String[] args) throws InterruptedException {
		Base b=new Base();
		WebDriver driver=b.getDriver("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtFirstName=driver.findElement(By.id("firstName"));
		b.setText(txtFirstName, "Selvakumar");
		WebElement txtLastName=driver.findElement(By.id("lastName"));
		b.setText(txtLastName, "Murugesan");
		WebElement txtUserName=driver.findElement(By.id("username"));
		b.setText(txtUserName, "bapassion1987");
		WebElement txtPassword=driver.findElement(By.name("Passwd"));
		b.setText(txtPassword, "chandra1987");
		WebElement txtConfirmPassword=driver.findElement(By.name("ConfirmPasswd"));
		b.setText(txtConfirmPassword, "chandra1987");
		WebElement btnNext=driver.findElement(By.xpath("//span[contains(text(), 'Next')]"));
		b.btnClick(btnNext);
		Thread.sleep(2000);
		WebElement txtVerifyNumber=driver.findElement(By.id("phoneNumberId"));
		b.setText(txtVerifyNumber, "8056603711");
		WebElement btnNext1=driver.findElement(By.xpath("//span[contains(text(), 'Next')]"));
		b.btnClick(btnNext1);
		b.driverQuit(driver);
	}

}
