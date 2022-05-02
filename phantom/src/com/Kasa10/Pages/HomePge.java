package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;

public class HomePge {
	@FindBy(xpath="//a[text()='Leads']") private WebElement LeadsTab; 
    @FindBy(xpath="//a[text()='Contacts']")private WebElement ContactTab;
    @FindBy(xpath="//a[text()='Accounts']")private WebElement AccountsTab;
public WebElement getAccountsTab() {
		return AccountsTab;
	}
public void clickAccountTabAddr() {
	AccountsTab.click();
}
	

public HomePge ()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getLeadstTabAddr() {
	return LeadsTab;
}
public void clickLeadsTab() {
	LeadsTab.click();
	}


public WebElement getContactTabAddr() {
	return ContactTab;
}
public void clickContactTab() {
	ContactTab.click();
}



}
