package com.green.appiumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public WebDriver getDriver(String url){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selva\\Selva\\MAANT\\Appium\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    return driver;
	}
	
	public void setText(WebElement element, String name){
		element.clear();
		element.sendKeys(name);
	}
	public void btnClick(WebElement element){
		element.click();
	}
	public void dropDown(WebElement element, String name){
		Select d=new Select(element);
		d.selectByVisibleText(name);
	}
	public void driverQuit(WebDriver driver){
		driver.quit();
		
	}
	public String getText(WebElement element){
		
		return element.getText();
		
	}

}
