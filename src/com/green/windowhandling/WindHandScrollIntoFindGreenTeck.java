package com.green.windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.green.factory.Base;

public class WindHandScrollIntoFindGreenTeck extends Base{
	
	public static void main(String[] args) {
		driver=getDriver("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=o5TMWoLrONCL8QevvKegDg");
		WndHndScrlIntoFndGreenTecFactory page=new WndHndScrlIntoFndGreenTecFactory();
		setText(page.getSearchTxtBox(), "selenium training in chennai");
		/*Below line  Working even we do not Scroll also*/
		//btnClick(page.getGreensTechLink());
		/*Below line  also Working even we do not Scroll also*/
		//js.executeScript("arguments[0].click();", page.getGreensTechLink());
		WebElement link = driver.findElement(By.xpath("(//cite[@class='iUh30'])[5]"));
		/*Below line  for Scroll Down Type*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", link);
		btnClick(page.getGreensTechLink());
	}
}
