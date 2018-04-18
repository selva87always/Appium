package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoQA {

	public static void main(String[] args) {
		
		Base b=new Base();
		WebDriver driver=b.getDriver("http://demoqa.com/registration/");
		WebElement txtFirstName=driver.findElement(By.id("name_3_firstname"));
		b.setText(txtFirstName, "Selva");
		WebElement txtLastName=driver.findElement(By.id("name_3_lastname"));
		b.setText(txtLastName, "Kumar");
		WebElement rdioMaritalStatus=driver.findElement(By.xpath("(//input[@name='radio_4[]'])[2]"));
		b.btnClick(rdioMaritalStatus);
		WebElement chkHobbyDance=driver.findElement(By.xpath("(//input[@name='checkbox_5[]'])[1]"));
		b.btnClick(chkHobbyDance);
		WebElement chkHobbyCricket=driver.findElement(By.xpath("(//input[@name='checkbox_5[]'])[3]"));
		b.btnClick(chkHobbyCricket);
		WebElement DrpDowncountry=driver.findElement(By.id("dropdown_7"));
		b.setText(DrpDowncountry, "India");
		WebElement drpDownDobMonth=driver.findElement(By.name("date_8[date][mm]"));
		b.dropDown(drpDownDobMonth, "1");
		WebElement drpDownDobDay=driver.findElement(By.name("date_8[date][dd]"));
		b.dropDown(drpDownDobDay, "8");
		WebElement drpDownDobYear=driver.findElement(By.name("date_8[date][yy]"));
		b.dropDown(drpDownDobYear, "1987");
		WebElement txtPhoneNumber=driver.findElement(By.id("phone_9"));
		b.setText(txtPhoneNumber, "8056603711");
		WebElement txtUserName=driver.findElement(By.id("username"));
		b.setText(txtUserName, "Selvawin87");
		WebElement txtEmail=driver.findElement(By.id("email_1"));
		b.setText(txtEmail, "selva@maantt.com");
		WebElement txtAbtYourself=driver.findElement(By.id("description"));
		b.setText(txtAbtYourself, "I am The Organization of the owner");
		WebElement txtPassword=driver.findElement(By.id("password_2"));
		b.setText(txtPassword, "chandra1987");
		WebElement txtConfirmPassword=driver.findElement(By.id("confirm_password_password_2"));
		b.setText(txtConfirmPassword, "chandra1987");
		WebElement btnSubmit=driver.findElement(By.name("pie_submit"));
		b.btnClick(btnSubmit);
		b.driverQuit(driver);
	}
}
