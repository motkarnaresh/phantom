package VerifyContact;

import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.Contacts;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.validLogin.ValidLoginTest;

public class VerifyContact extends BaseTest {
	@Test
	public void verifyContact() throws Throwable {
		ValidLoginTest v1=new ValidLoginTest();
		v1.LoginToAPP();
		
		HomePge p1=new HomePge();
		p1.clickContactTab();
		
		Thread.sleep(2000);
		Contacts ct=new Contacts();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(ct.getContactTextAddr(), "ContactPage");
		
		ct.ClicknewContactTab();
	}
	

}
