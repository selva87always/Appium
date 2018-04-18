package com.green.factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPageFactory extends Base{

	public GmailPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="FirstName")
	private WebElement txtFirstName;
	
	@FindBy(id="LastName")
	private WebElement txtLastName;
	
	@FindBy(id="GmailAddress")
	private WebElement txtUserName;
	
	@FindBy(id="Passwd")
	private WebElement txtPassword;
	
	@FindBy(id="PasswdAgain")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath="//div[@title='Birthday']")
	private WebElement drpDownBirthMonth;
	
	@FindBy(xpath="//div[@role='option' and @class='goog-menuitem']")
    private List<WebElement> drpDownBirthMonth1;
	
	@FindBy(id="BirthDay")
	private WebElement txtBirthDay;
	
	@FindBy(id="BirthYear")
	private WebElement txtBirthYear;
	
	@FindBy(xpath="//div[@title='Gender']")
	private WebElement drpDownGenderClick;
	
	@FindBy(id="RecoveryPhoneNumber")
	private WebElement txtMobileNumber;
	
	@FindBy(id="RecoveryEmailAddress")
	private WebElement txtRecoveryEmailAddressr;
	
	@FindBy(id="submitbutton")
	private WebElement btnNextbutton;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public WebElement getDrpDownBirthMonth() {
		return drpDownBirthMonth;
	}
	
	public List<WebElement> getDrpDownBirthMonth1() {
		
		return drpDownBirthMonth1;
	}

	public WebElement getTxtBirthDay() {
		return txtBirthDay;
	}

	public WebElement getTxtBirthYear() {
		return txtBirthYear;
	}

	public WebElement getDrpDownGenderClick() {
		return drpDownGenderClick;
	}

	public WebElement getTxtMobileNumber() {
		return txtMobileNumber;
	}

	public WebElement getTxtRecoveryEmailAddressr() {
		return txtRecoveryEmailAddressr;
	}

	public WebElement getBtnNextbutton() {
		return btnNextbutton;
	}

	public void setBtnNextbutton(WebElement btnNextbutton) {
		this.btnNextbutton = btnNextbutton;
	}
	
	
	
}
