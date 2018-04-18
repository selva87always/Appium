package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignUp {
	Base b=new Base();
	public static void main(String[] args) {
		
		AmazonSignUp mo=new AmazonSignUp();
		mo.amazonBooksAllBooks();
		
	}
	
   public void amazonBooksAllBooks(){
	   
	    WebDriver driver=b.getDriver("https://www.amazon.in/");
	    WebElement amazonHelloSignIn=driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	    Actions acc=new Actions(driver);
		acc.moveToElement(amazonHelloSignIn).build().perform();
		WebElement btnSignIn=driver.findElement(By.xpath("//a[text()='Start here.']"));
	    b.btnClick(btnSignIn);
	    WebElement txtName=driver.findElement(By.id("ap_customer_name"));
	    b.setText(txtName, "Selvakumar");
	    WebElement txtMobileNo=driver.findElement(By.id("ap_phone_number"));
	    b.setText(txtMobileNo, "9600854130");
	    WebElement txtEmail=driver.findElement(By.id("ap_email"));
	    b.setText(txtEmail, "selvawin87@gmail.com");
	    WebElement txtPassowrd=driver.findElement(By.id("ap_password"));
	    b.setText(txtPassowrd, "chandra1987");
	    WebElement btnContinue=driver.findElement(By.id("continue"));
	    b.btnClick(btnContinue);
	    WebElement txtOTPVerify=driver.findElement(By.id("auth-pv-enter-code"));
	    b.setText(txtOTPVerify, "8888");
	    WebElement btnSubmit=driver.findElement(By.id("auth-verify-button"));
	    b.btnClick(btnSubmit);
	    //b.driverQuit(driver);
   }

}
