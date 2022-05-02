package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;

public class Contacts {
	@FindBy(xpath="//td[contains(text(),'Contacts: ')]")private WebElement ContactText;
	@FindBy(xpath="//input[@value='New Contact']")private WebElement newContactTab;
	
	public Contacts() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getContactTextAddr() {
		return ContactText;
	}
     
	public WebElement getnewContactTab() {
		return newContactTab;
	}

	
	
	public void ClicknewContactTab() {
	 newContactTab.click();
	}

	

}
