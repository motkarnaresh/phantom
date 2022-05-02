package com.Kasa10.validLogin;

import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.FileLib;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.LoginPage;

public class ValidLoginTest extends BaseTest {

	@Test
	public void LoginToAPP() throws Throwable{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		
		Thread.sleep(3000);
		lp.login(flib.readPropertyData(PROP_PATH, "untb"),
				flib.readPropertyData(PROP_PATH, "pwtb"));
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "HomePgeTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH, "HomePgeTitle"),
				wlib.getPageTitle(),
				"CRM Home");
	}

}
