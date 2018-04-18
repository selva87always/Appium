package com.green.windowhandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.green.factory.Base;

public class windowHandleLakshmiVilas extends Base{
	
	public windowHandleLakshmiVilas() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Login Password')]")
	private WebElement restLoginPasswprd;
	public WebElement getRestLoginPasswprd() {
		return restLoginPasswprd;
	}//*[@id="Table10"]/tbody/tr[1]/td/a
	
	@FindBy(xpath="//a[@href='javascript:troubleLogin();']")
	private WebElement troublelogin;
	
	public WebElement getTroublelogin() {
		return troublelogin;
	}

	@FindBy(xpath="//a[text()='Reset Login password']")
	private WebElement resetLoginPasswordLink;
	public WebElement getResetLoginPasswordLink() {
		return resetLoginPasswordLink;
	}
	
	@FindBy(id="fldUId")
	private WebElement netBankingLoginId;
	public WebElement getNetBankingLoginId() {
		return netBankingLoginId;
	}
	
	@FindBy(xpath="//a[text()='submit']")
	private WebElement submitLink;
	public WebElement getSubmitLink() {
		return submitLink;
	}
	
	@FindBy(xpath="/html/body/form[1]/table[4]/tbody/tr[1]/td")
	private WebElement errorTextWhileLogin;
	public WebElement getErrorTextWhileLogin() {
		return errorTextWhileLogin;
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr[3]/td")
	private WebElement footerCopyRightsText;
	public WebElement getFooterCopyRightsText() {
		return footerCopyRightsText;
	}
	
	
}
