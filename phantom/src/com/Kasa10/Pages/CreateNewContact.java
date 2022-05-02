package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.WebDriverCommonLib;

public class CreateNewContact {
	@FindBy(xpath="//select[@name='property(Lead Source)']")private WebElement LeadSource;
	@FindBy(xpath="//select[@name='property(saltName)']")private WebElement firstnameDropdown;
	@FindBy(xpath="//input[@name='property(First Name)']")private WebElement firstNameTextBox;
	@FindBy(xpath="//input[@name='property(Last Name)']")private WebElement lastName;
	@FindBy(xpath="//input[@name='property(Email)']")private WebElement emaill;
	@FindBy(xpath="//input[@name='property(Department)']")private WebElement department;
	@FindBy(xpath="//input[@name='property(Phone)']")private WebElement phoneno;
	@FindBy(xpath="//input[@name='property(Date of Birth)']")private WebElement dateOfBirth;
	@FindBy(xpath="//input[@value='Save']")private WebElement saveBtn;
	@FindBy(xpath="//img[@title='Account Name Lookup']")private WebElement ParentContactImage;
	@FindBy(xpath="(//table)[4]//tr[2]//td[1]")private WebElement accountNameLink;
	
	public CreateNewContact() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}

	public WebElement getLeadSource() {
		return LeadSource;
	}


	public WebElement getFirstnameDropdown() {
		return firstnameDropdown;
	}


	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getEmail() {
		return emaill;
	}


	public WebElement getDepartment() {
		return department;
	}


	public WebElement getPhoneno() {
		return phoneno;
	}


	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
public void CreateNewContact(String lead,String fname,String fnamet,String lname,String email,String dept,
		String phno,String dob,String expectedTitle) throws Throwable {
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	String parentWindow = BaseTest.driver.getWindowHandle();
	wlib.selectedOptions(lead, LeadSource);
	wlib.selectedOptions(fname, firstnameDropdown);
	firstNameTextBox.sendKeys(fnamet);
	lastName.sendKeys(lname);
	emaill.sendKeys(email);
	department.sendKeys(dept);
	phoneno.sendKeys(phno);
	dateOfBirth.sendKeys(dob);
	
	ParentContactImage.click();
	wlib.swithcToWindow(accountNameLink, expectedTitle);
		Thread.sleep(2000);
	BaseTest.driver.switchTo().window(parentWindow);
	Thread.sleep(2000);
	saveBtn.click();
}
  public WebElement getParentContactImage() {
	  return ParentContactImage;
  }
    public void clickParentContactImage() {
    	ParentContactImage.click();
    }
    public WebElement getaccountNameLink() {
    	return accountNameLink;
    }
}
