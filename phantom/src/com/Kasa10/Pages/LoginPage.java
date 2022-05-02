package com.Kasa10.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Kasa10.GenericLib.BaseTest;

public class LoginPage {
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
    @FindBy(xpath="//input[@title='Sign In']") private WebElement SigninBtn;
    
    public LoginPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    public void login(String username,String password) {
    	untb.sendKeys(username);
    	pwtb.sendKeys(password);
    	SigninBtn.click();
    	}
	public WebElement getUntb() {
		return untb;
	}
	
	
	public WebElement getPwtb() {
		return pwtb;
	}
	
	public WebElement getSigninBtn() {
		return SigninBtn;
	}
	
	}
  