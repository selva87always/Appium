package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonYourWishList extends AmazonSignIn{

	public static void main(String[] args) {
		AmazonYourWishList awishlist=new AmazonYourWishList();
		awishlist.wishList();
	}
	public void wishList(){
		
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
		WebElement mouseOverYourWishList=driver.findElement(By.xpath("//span[text()='Your']"));
		acc.moveToElement(mouseOverYourWishList).build().perform();
		WebElement createWishList=driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		b.btnClick(createWishList);
		WebElement createAList=driver.findElement(By.id("createList-announce"));
		b.btnClick(createAList);
		try {
		Thread.sleep(2000);
		WebElement createListName=driver.findElement(By.name("create-name"));
		b.setText(createListName, "MyOwn List");
		Thread.sleep(2000);
		WebElement btnCreateList=driver.findElement(By.xpath("//span[text()='Create List']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnCreateList);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
