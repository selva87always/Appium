package com.green.factory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	
	public static WebDriver getDriver(String url){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selva\\Selva\\MAANT\\Appium\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    return driver;
	}
	
	public static void setText(WebElement element, String name){
		element.clear();
		element.sendKeys(name,Keys.ENTER);
	}
	public static void btnClick(WebElement element){
		element.click();
	}
	public static void dropDown(WebElement element, String name){
		Select d=new Select(element);
		d.selectByVisibleText(name);
	}
	public static void driverQuit(WebDriver driver){
		driver.quit();
		
	}
	public static String getText(WebElement element){
		
		return element.getText();
		
	}

}
