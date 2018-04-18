package com.green.windowhandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.green.factory.Base;

public class WndHndScrlIntoFndGreenTecFactory extends Base{
	public WndHndScrlIntoFndGreenTecFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lst-ib")
	private WebElement searchTxtBox;
	public WebElement getSearchTxtBox() {
		return searchTxtBox;
	}
	
	@FindBy(xpath="//a[text()='Selenium Training In Chennai |Best Selenium Testing Institutes ...']")
	private WebElement greensTechLink;
	public WebElement getGreensTechLink() {
		return greensTechLink;
	}
	
	
}
