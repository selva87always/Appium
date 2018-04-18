package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	Base b=new Base();
	public static void main(String[] args) {
		
		MouseOver mo=new MouseOver();
		mo.OraclePerformanceTuning();
		mo.courseEthicalHacking();
		mo.sftwareTestingTrainingSelenium();
		mo.amazonBooksAllBooks();
		
	}
	public void OraclePerformanceTuning(){
		
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		WebElement btnCourses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCourses).build().perform();
		WebElement btnOracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		acc.moveToElement(btnOracle).build().perform();
		WebElement btnOraclePerfomanceTuning=driver.findElement(By.xpath("//span[text()='Performance Tuning Training']"));
		b.btnClick(btnOraclePerfomanceTuning);
		b.driverQuit(driver);
	}
	
   public void courseEthicalHacking(){
	   
	    WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		WebElement btnCourses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCourses).build().perform();
		WebElement btnEthicalHacking=driver.findElement(By.xpath("//span[text()='Ethical Hacking Training']"));
		b.btnClick(btnEthicalHacking);
		b.driverQuit(driver);
   }
   public void sftwareTestingTrainingSelenium(){
	   
	    WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		WebElement btnCourses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCourses).build().perform();
		WebElement softwareTestingtraing=driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		acc.moveToElement(softwareTestingtraing).build().perform();
		WebElement softwareTestingtraingSelenium=driver.findElement(By.xpath("//span[text()='Selenium']"));
		b.btnClick(softwareTestingtraingSelenium);
		b.driverQuit(driver);
   }
   public void amazonBooksAllBooks(){
	   
	    WebDriver driver=b.getDriver("https://www.amazon.in/");
	    WebElement shopbyCcategory=driver.findElement(By.xpath("//span[text()='Category']"));
	    Actions acc=new Actions(driver);
		acc.moveToElement(shopbyCcategory).build().perform();
		WebElement shopbyCcategoryBooks=driver.findElement(By.xpath("//span[text()='Books']"));
	    acc.moveToElement(shopbyCcategoryBooks).build().perform();
	    WebElement shopbyCcategoryBooksAllBooks=driver.findElement(By.xpath("//span[text()='All Books']"));
	    b.btnClick(shopbyCcategoryBooksAllBooks);
	    b.driverQuit(driver);
   }

}
