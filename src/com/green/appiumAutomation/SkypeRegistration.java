package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkypeRegistration {
    Base b=new Base();
	public static void main(String[] args) throws Throwable {
		
		SkypeRegistration obj=new SkypeRegistration();
		obj.registerMobile();
		obj.registerEmail();
	}
	public void registerMobile() throws Throwable{
		
		WebDriver driver=null;
		driver=b.getDriver("https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=13&ct=1522663004&rver=7.0.6730.0&wp=MBI_SSL&wreply=https%3a%2f%2flw.skype.com%2flogin%2foauth%2fproxy%3fform%3dmicrosoft_registration%26site_name%3dlw.skype.com%26fl%3dphone2&lc=1033&id=293290&mkt=en-IN&psi=skype&lw=1&cobrandid=90010&client_flight=hsu%2cReservedFlight33%2cReservedFlight67&fl=phone2&uaid=41ec1ffed8c44bdca3d564d3aba926da&lic=1");
		WebElement txtphoneNum=driver.findElement(By.id("MemberName"));
		b.setText(txtphoneNum, "8056603711");
		WebElement txtPassword=driver.findElement(By.id("Password"));
		b.setText(txtPassword, "l");
		WebElement btnNext=driver.findElement(By.id("iSignupAction"));
		b.btnClick(btnNext);
		WebElement txtFirstName=driver.findElement(By.id("FirstName"));
		b.setText(txtFirstName, "Selva");
		WebElement txtLastName=driver.findElement(By.id("LastName"));
		b.setText(txtLastName, "kumar");
		b.btnClick(btnNext);
		//***Here After asking Verfication code which was sent to Mobile Number
		Thread.sleep(8000);
		b.driverQuit(driver);
	}
	
   public void registerEmail() throws Throwable{
		
		WebDriver driver=null;
		driver=b.getDriver("https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=13&ct=1522663004&rver=7.0.6730.0&wp=MBI_SSL&wreply=https%3a%2f%2flw.skype.com%2flogin%2foauth%2fproxy%3fform%3dmicrosoft_registration%26site_name%3dlw.skype.com%26fl%3dphone2&lc=1033&id=293290&mkt=en-IN&psi=skype&lw=1&cobrandid=90010&client_flight=hsu%2cReservedFlight33%2cReservedFlight67&fl=phone2&uaid=41ec1ffed8c44bdca3d564d3aba926da&lic=1");
		WebElement txtEmail=driver.findElement(By.id("MemberName"));
		b.setText(txtEmail, "selvawin87@gmail.com");
		WebElement txtPassword=driver.findElement(By.id("Password"));
		b.setText(txtPassword, "chandra1987");
		WebElement btnNext=driver.findElement(By.id("iSignupAction"));
		b.btnClick(btnNext);
		WebElement txtFirstName=driver.findElement(By.id("FirstName"));
		b.setText(txtFirstName, "Selva");
		WebElement txtLastName=driver.findElement(By.id("LastName"));
		b.setText(txtLastName, "kumar");
		b.btnClick(btnNext);
		//***Here After asking Verfication code which was sent to Mobile Number
		
		Thread.sleep(8000);
		b.driverQuit(driver);
	}

}
