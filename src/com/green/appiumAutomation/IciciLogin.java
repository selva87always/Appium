package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IciciLogin {

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver driver=b.getDriver("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement txtUserId=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		b.setText(txtUserId, "adfgbhk");
		WebElement txtPassword=driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		b.setText(txtPassword, "adkfjakb");
		WebElement btnLogin=driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		b.btnClick(btnLogin);
		b.driverQuit(driver);
	}

}
