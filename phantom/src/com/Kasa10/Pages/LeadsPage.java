package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;

public class LeadsPage {
	@FindBy(xpath="//td[contains(text(),'Leads: ')]")private WebElement leadstext;
    @FindBy(xpath="//input[@onclick=\"createAction()\"]")private WebElement newLeadsButton;
    
    public LeadsPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }

	public WebElement getLeadstextAddr() {
		return leadstext;
	}

	
	public void clicknewLeadsButton() {
		newLeadsButton.click();
	}

	

}
