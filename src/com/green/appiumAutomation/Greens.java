package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Greens {

	public static void main(String[] args) {
		
		Base b=new Base();
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		WebElement linkCertification=driver.findElement(By.xpath("//a[@href='Certifications.html']"));
		b.btnClick(linkCertification);
		b.driverQuit(driver);
		
	}


}
