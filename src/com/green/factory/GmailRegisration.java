package com.green.factory;

public class GmailRegisration extends Base{
 
	public static void main(String[] args) throws InterruptedException {
		
		driver=getDriver("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		GmailPageFactory page=new GmailPageFactory();
		
		setText(page.getTxtFirstName(), "Selvakumar");
		
		setText(page.getTxtLastName(), "Murugesan");
		
		setText(page.getTxtUserName(), "bapassion1987");
		
		setText(page.getTxtPassword(), "chandra1987");
		
		setText(page.getTxtConfirmPassword(), "chandra1987");
		
		btnClick(page.getDrpDownBirthMonth());
		
		Thread.sleep(2000);
		
		for (int i = 0; i < page.getDrpDownBirthMonth1().size(); i++) {
			
			if(page.getDrpDownBirthMonth1().get(i).getText().equalsIgnoreCase("january")){
				
				page.getDrpDownBirthMonth1().get(i).click();
			}
		}
		
		setText(page.getTxtBirthDay(), "08");
		
		setText(page.getTxtBirthYear(), "1987");
		
		setText(page.getTxtMobileNumber(), "8056603711");
		
		setText(page.getTxtRecoveryEmailAddressr(), "zhgk@ad.com");
		
		btnClick(page.getBtnNextbutton());
		
		driverQuit(driver);
	}

}
