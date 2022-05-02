package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.WebDriverCommonLib;

public class CreateNewAccount {
	@FindBy(xpath="//input[@name='property(Account Name)']")private WebElement accountName;
	@FindBy(xpath="//input[@name='property(Account Number)']")private WebElement accountNumber;
	@FindBy(xpath="//select[@name='property(Account Type)']")private WebElement accountType;
	@FindBy(xpath="//select[@name='property(Ownership)']")private WebElement ownerShip;
	@FindBy(xpath="//select[@name='property(Industry)']")private WebElement industry;
	@FindBy(xpath="//input[@value='Save']")private WebElement saveBtn;
	
	public CreateNewAccount()
	{
     PageFactory.initElements(BaseTest.driver, this);
}

	public WebElement getAccountName() {
		return accountName;
	}

	
	public WebElement getAccountNumber() {
		return accountNumber;
	}

	

	public WebElement getOwnerShip() {
		return ownerShip;
	}

	

	public WebElement getIndustry() {
		return industry;
	}

	

	public WebElement getSaveBtn() {
		return saveBtn;
	}
public void CreateNewAccount(String accn,String accno,String acct,String owns,String inds)
{
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	accountName.sendKeys(accn);
	accountNumber.sendKeys(accno);
	wlib.selectedOptions(owns, ownerShip);
	wlib.selectedOptions(acct, accountType);
	wlib.selectedOptions(inds, industry);
	
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	saveBtn.click();
	
}
}