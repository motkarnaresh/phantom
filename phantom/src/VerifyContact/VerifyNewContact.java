package VerifyContact;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.FileLib;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.Contacts;
import com.Kasa10.Pages.CreateNewContact;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.validLogin.ValidLoginTest;

@Listeners(com.Kasa10.GenericLib.MyListeners.class)
public class VerifyNewContact extends BaseTest {
	@Test
	public void verifyNewContact() throws Throwable {
		ValidLoginTest v1=new ValidLoginTest();
		v1.LoginToAPP();
		
		HomePge hm=new HomePge();
		hm.clickContactTab();
		
		Contacts ct=new Contacts();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(ct.getContactTextAddr(), "contact page");
		
		Thread.sleep(2000);
		ct.ClicknewContactTab();
		Thread.sleep(2000);
		 
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "createdContactTitle"),
				wlib.getPageTitle(), "create contact page");
		Thread.sleep(2000);
		
		CreateNewContact nc=new CreateNewContact();
		String lead=flib.readExcelData(Excel_PATH, "Contacts", 0, 1);
		String fname=flib.readExcelData(Excel_PATH, "Contacts", 1, 1);
		String fnamet=flib.readExcelData(Excel_PATH, "Contacts", 2, 1);
		String lname=flib.readExcelData(Excel_PATH, "Contacts", 3, 1);
		String email=flib.readExcelData(Excel_PATH, "Contacts", 4, 1);
		String dept=flib.readExcelData(Excel_PATH, "Contacts", 5, 1);
		String phno=flib.readExcelData(Excel_PATH, "Contacts", 6, 1);
		String dob=flib.readExcelData(Excel_PATH, "Contacts", 7, 1);
		nc.CreateNewContact(lead,fname,fnamet,lname,email,dept,phno,dob,flib.readPropertyData(PROP_PATH, "AccountNamelookup"));
	}

}
