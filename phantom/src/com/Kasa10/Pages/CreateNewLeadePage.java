package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.WebDriverCommonLib;

public class CreateNewLeadePage {
@FindBy(xpath="//select[@name='property(saltName)']")private WebElement firstnameDropdown;
@FindBy(xpath="//input[@name='property(First Name)']")private WebElement firstNameTextBox;
@FindBy(xpath="//input[@name='property(Company)']")private WebElement companyNameTextBox;
@FindBy(xpath="//input[@name='property(Last Name)']")private WebElement lastNameTextBox;
@FindBy(xpath="//select[@name='property(Lead Source)']")private WebElement leadssourceDropdown;
@FindBy(xpath="//input[@value='Save']")private WebElement savebtn;

public CreateNewLeadePage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getFirstnameDropdown() {
	return firstnameDropdown;
}



public WebElement getFirstNameTextBox() {
	return firstNameTextBox;
}




public WebElement getCompanyNameTextBox() {
	return companyNameTextBox;
}



public WebElement getLastNameTextBox() {
	return lastNameTextBox;
}



public WebElement getLeadssourceDropdown() {
	return leadssourceDropdown;
}



public WebElement getSavebtn() {
	return savebtn;
}

public void CreateNewLead(String salText,String fn,String company,String ln,String leadSource)
{
           WebDriverCommonLib wlib=new WebDriverCommonLib(); 
           wlib.selectedOptions(salText, firstnameDropdown);
           firstNameTextBox.sendKeys(fn);
           companyNameTextBox.sendKeys(company);
           lastNameTextBox.sendKeys(ln);
           try {
        	   Thread.sleep(2000);
           } catch(InterruptedException e) {
        	   e.printStackTrace();
           }
           wlib.selectedOptions(leadSource, leadssourceDropdown);
           savebtn.click();
}
}
