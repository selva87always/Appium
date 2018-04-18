package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignIn {
	Base b=new Base();
	public static void main(String[] args) {
		
		AmazonSignIn mo=new AmazonSignIn();
		mo.amazonSignIn();
		
	}
	
   public void amazonSignIn(){
	   
	    WebDriver driver=b.getDriver("https://www.amazon.in/");
	    WebElement amazonHelloSignIn=driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	    Actions acc=new Actions(driver);
		acc.moveToElement(amazonHelloSignIn).build().perform();
		WebElement btnSignIn=driver.findElement(By.xpath("//span[text()='Sign in']"));
	    b.btnClick(btnSignIn);
	    WebElement txtMobileOrEmail=driver.findElement(By.id("ap_email"));
	    b.setText(txtMobileOrEmail, "selvawin87@gmail.com");
	    WebElement btnContinue=driver.findElement(By.id("continue"));
	    b.btnClick(btnContinue);
	    WebElement txtPassowrd=driver.findElement(By.id("ap_password"));
	    b.setText(txtPassowrd, "chandra1987");
	    WebElement btnLogin=driver.findElement(By.id("signInSubmit"));
	    b.btnClick(btnLogin);
	    //b.driverQuit(driver);
   }

}
