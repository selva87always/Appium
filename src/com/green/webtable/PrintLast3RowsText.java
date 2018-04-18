package com.green.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.green.appiumAutomation.Base;

public class PrintLast3RowsText{

	public static void main(String[] args) {
		
		Base b=new Base();
		WebDriver driver = b.getDriver("https://money.rediff.com/gainers/bsc/daily/groupa");
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int k=rows.size();
		for (int i = k-3; i < k; i++) {
			List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
			for (WebElement webElement : columns) {
				System.out.println(b.getText(webElement));
			}
		}
		}
	}


