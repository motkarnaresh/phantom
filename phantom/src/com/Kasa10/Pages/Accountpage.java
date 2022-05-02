package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;

public class Accountpage {
	@FindBy(xpath="//td[contains(text(),'Accounts: ')]")private WebElement accounttext;
	@FindBy(xpath="//input[@value='New Account']") private WebElement newAccountButton;
	
	public Accountpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAccounttextAddr() {
		return accounttext;
	}


	public WebElement getNewAccountButton() {
		return newAccountButton;
	}
	public void clickNewAccountButton() {
		newAccountButton.click();
		
	}

	

}
