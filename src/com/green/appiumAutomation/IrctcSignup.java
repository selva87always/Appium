package com.green.appiumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrctcSignup {

	public static void main(String[] args) throws Throwable {
		
		Base b=new Base();
		WebDriver driver=b.getDriver("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement txtUserId=driver.findElement(By.id("userRegistrationForm:userName"));
		b.setText(txtUserId, "selvamurugan");
		
		WebElement txtPassword=driver.findElement(By.id("userRegistrationForm:password"));
		b.setText(txtPassword, "chandra1987");
		
		WebElement txtConfirmPassword=driver.findElement(By.id("userRegistrationForm:confpasword"));
		b.setText(txtConfirmPassword, "chandra1987");
		
		WebElement drpDownSecurityQuestion=driver.findElement(By.id("userRegistrationForm:securityQ"));
		b.dropDown(drpDownSecurityQuestion, "What is your pet name?");
		
		WebElement drpDownSecurityAnswer=driver.findElement(By.id("userRegistrationForm:securityAnswer"));
		b.setText(drpDownSecurityAnswer, "sathish");
		
		WebElement drpDownPreferedLanguage=driver.findElement(By.id("userRegistrationForm:prelan"));
		b.dropDown(drpDownPreferedLanguage, "English");
		
		WebElement txtFirstname=driver.findElement(By.id("userRegistrationForm:firstName"));
		b.setText(txtFirstname, "Selvakumar");
		
		WebElement txtMiddlename=driver.findElement(By.id("userRegistrationForm:middleName"));
		b.setText(txtMiddlename, "");
		
		WebElement txtLastname=driver.findElement(By.id("userRegistrationForm:lastName"));
		b.setText(txtLastname, "Murugesan");
		
		WebElement rdioGenderMale=driver.findElement(By.id("userRegistrationForm:gender:0"));
		b.btnClick(rdioGenderMale);
		
		WebElement rdioMaritalStatusUnmarried=driver.findElement(By.id("userRegistrationForm:maritalStatus:1"));
		b.btnClick(rdioMaritalStatusUnmarried);
		
		WebElement dobDay=driver.findElement(By.id("userRegistrationForm:dobDay"));
		b.dropDown(dobDay, "08");
		
		WebElement dobMonth=driver.findElement(By.id("userRegistrationForm:dobMonth"));
		b.dropDown(dobMonth, "JAN");
		
		WebElement dobYear=driver.findElement(By.id("userRegistrationForm:dateOfBirth"));
		b.dropDown(dobYear, "1987");
		
		WebElement drpDownOcupation=driver.findElement(By.id("userRegistrationForm:occupation"));
		b.dropDown(drpDownOcupation, "Private");
		
		WebElement txtAdharNo=driver.findElement(By.id("userRegistrationForm:uidno"));
		b.setText(txtAdharNo, "392669072603");
		
		WebElement txtPanNo=driver.findElement(By.id("userRegistrationForm:idno"));
		b.setText(txtPanNo, "EBCPS2011E");
		
		WebElement drpDownCountry=driver.findElement(By.id("userRegistrationForm:countries"));
		b.dropDown(drpDownCountry, "India");
		
		WebElement txtEmail=driver.findElement(By.id("userRegistrationForm:email"));
		b.setText(txtEmail, "adhitycholan@gmail.com");
		
		WebElement txtMobile=driver.findElement(By.id("userRegistrationForm:mobile"));
		b.setText(txtMobile, "8056603711");
		
		WebElement drpDownNatiopnality=driver.findElement(By.id("userRegistrationForm:nationalityId"));
		b.dropDown(drpDownNatiopnality, "India");
		
		WebElement txtDoorNo=driver.findElement(By.id("userRegistrationForm:address"));
		b.setText(txtDoorNo, "689");
		
		WebElement txtStreet=driver.findElement(By.id("userRegistrationForm:street"));
		b.setText(txtStreet, "Chinnapulikudikkadu");
		
		WebElement txtArea=driver.findElement(By.id("userRegistrationForm:area"));
		b.setText(txtArea, "Vaduvur");
		
		WebElement txtPinCode=driver.findElement(By.id("userRegistrationForm:pincode"));
		b.setText(txtPinCode, "614019");
		Thread.sleep(3000);
		
		WebElement drpDownCity=driver.findElement(By.id("userRegistrationForm:cityName"));
		b.dropDown(drpDownCity, "Thanjavur");
		
		WebElement drpDownPostOffice=driver.findElement(By.id("userRegistrationForm:postofficeName"));
		b.dropDown(drpDownPostOffice, "Ragavambalpuram B.O");
		
		WebElement txtPhone=driver.findElement(By.id("userRegistrationForm:landline"));
		b.setText(txtPhone, "04372 291019");
		
		WebElement rdioCopyResidentialNo=driver.findElement(By.id("userRegistrationForm:resAndOff"));
		b.btnClick(rdioCopyResidentialNo);
		
		WebElement rdioNewsLetterNo=driver.findElement(By.id("userRegistrationForm:newsletter:1"));
		b.btnClick(rdioNewsLetterNo);
		
		WebElement rdioCommercialPromoNo=driver.findElement(By.id("userRegistrationForm:commercialpromo:1"));
		b.btnClick(rdioCommercialPromoNo);
		
		WebElement linkSubmitForm=driver.findElement(By.id("userRegistrationForm:j_idt502"));
		b.btnClick(linkSubmitForm);
		
		b.driverQuit(driver);
	}

}
