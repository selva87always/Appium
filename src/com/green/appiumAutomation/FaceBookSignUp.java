package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookSignUp{

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver driver=b.getDriver("https://www.facebook.com/");
		WebElement txtUserFirstName=driver.findElement(By.name("firstname"));
		b.setText(txtUserFirstName, "selva");
		
		WebElement txtUserLastName=driver.findElement(By.name("lastname"));
		b.setText(txtUserLastName, "kumar"); 
		
		WebElement txtMoblieNumber=driver.findElement(By.name("reg_email__"));
		b.setText(txtMoblieNumber, "8056603711");
		
		WebElement txtNewPassword=driver.findElement(By.name("reg_passwd__"));
		b.setText(txtNewPassword, "chandra1987");
		
		WebElement btnGenderMale=driver.findElement(By.xpath("//input[@id='u_0_8' and @value='2']"));
		b.btnClick(btnGenderMale);
		
		WebElement dropDownbirthDay=driver.findElement(By.id("day"));
		b.dropDown(dropDownbirthDay, "8");
		
		WebElement dropDownbirthMonth=driver.findElement(By.id("month"));
		b.dropDown(dropDownbirthMonth, "Jan");
		
		WebElement dropDownbirthYear=driver.findElement(By.id("year"));
		b.dropDown(dropDownbirthYear, "1987");
		
		WebElement btnSignup=driver.findElement(By.name("websubmit"));
		b.btnClick(btnSignup); 
		b.driverQuit(driver);
	}

}
