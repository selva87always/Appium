package com.green.appiumAutomation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CountOfEachCharacterGreen {

	public static void main(String[] args) throws Throwable {
		
		Base b=new Base();
		WebDriver driver=b.getDriver("http://www.greenstechnologys.com/");
		WebElement btnCourses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCourses).build().perform();
		WebElement softwareTestingtraing=driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		acc.moveToElement(softwareTestingtraing).build().perform();
		WebElement softwareTestingtraingSelenium=driver.findElement(By.xpath("//span[text()='Selenium']"));
		b.btnClick(softwareTestingtraingSelenium);
		Thread.sleep(2000);
		WebElement getTextParagraph=driver.findElement(By.xpath("//div[@id='article-wrapper']/p[4]"));
		
		String paragraph=b.getText(getTextParagraph);
		int value;
		System.out.println("**************The Given Paragraph:*********************\n"+paragraph+"\n");
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<paragraph.length();i++){
			if(map.containsKey(paragraph.charAt(i))){
				value=map.get(paragraph.charAt(i));
				value++;
				map.put(paragraph.charAt(i), value);
			}else{
				map.put(paragraph.charAt(i),1);
			}
		}
		Set<Entry<Character,Integer>> s=map.entrySet();
		for(Entry<Character,Integer> i:s){
			
			System.out.println("Letter :"+i.getKey()+"\tCount:"+i.getValue());
		}
		
	}

}
