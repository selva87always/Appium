package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwitterLogin {

	public static void main(String[] args) throws Throwable {
		Base b=new Base();
		WebDriver driver=b.getDriver("https://twitter.com/login?lang=en");
		WebElement txtPhone=driver.findElement(By.xpath("//input[@class='js-username-field email-input js-initial-focus']"));
		b.setText(txtPhone, "9287927382");
		WebElement txtPassword=driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input"));
		b.setText(txtPassword, "ajdfhjoi");
		Thread.sleep(4000);
		WebElement chkRemeberMe=driver.findElement(By.xpath("//input[@value='1']"));
		b.btnClick(chkRemeberMe);
		WebElement btnLogin=driver.findElement(By.xpath("//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']"));
		b.btnClick(btnLogin);
		b.driverQuit(driver);
	}

}
