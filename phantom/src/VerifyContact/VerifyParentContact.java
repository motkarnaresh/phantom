package VerifyContact;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.FileLib;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.Contacts;
import com.Kasa10.Pages.CreateNewContact;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.validLogin.ValidLoginTest;

public class VerifyParentContact extends BaseTest {
	public void VerifyContactTest() throws Throwable {
		ValidLoginTest v1=new ValidLoginTest();
		v1.LoginToAPP();
		
		HomePge p1=new HomePge();
		p1.clickContactTab();
		
		Thread.sleep(2000);
		Contacts ct=new Contacts();
		ct.ClicknewContactTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(ct.getContactTextAddr(), "ContactPage");
		
		
		CreateNewContact cc=new CreateNewContact();
		cc.clickParentContactImage();
		Thread.sleep(2000);
		FileLib flib=new FileLib();
		wlib.swithcToWindow(cc.getaccountNameLink(),flib.readPropertyData(PROP_PATH, "AccountNamelookup"));
	}
	

}
