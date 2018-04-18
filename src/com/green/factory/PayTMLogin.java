package com.green.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayTMLogin extends Base{
	public PayTMLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@data-reactid='47']")
	private WebElement loginLink;
	public WebElement getLoginLink() {
		return loginLink;
	}
	@FindBy(id="input_0")
	private WebElement mobileOREmail;
	public WebElement getMobileOREmail() {
		return mobileOREmail;
	}
	@FindBy(id="input_1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//span[text()='Login Securely']")
	private WebElement loginSecurely;
	public WebElement getLoginSecurely() {
		return loginSecurely;
	}
	
}
