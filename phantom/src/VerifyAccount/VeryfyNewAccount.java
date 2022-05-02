package VerifyAccount;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.FileLib;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.Accountpage;
import com.Kasa10.Pages.CreateNewAccount;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.validLogin.ValidLoginTest;

@Listeners(com.Kasa10.GenericLib.MyListeners.class)
public class VeryfyNewAccount extends BaseTest {

@Test

public void veryfyNewAccount() throws Throwable
{
	ValidLoginTest v1=new ValidLoginTest();
	v1.LoginToAPP();
	HomePge hp=new HomePge();
	hp.clickAccountTabAddr();
	
	Accountpage ap=new Accountpage();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.elementDisplayed(ap.getAccounttextAddr(), "accountpage");
	
	Thread.sleep(2000);
	
	ap.clickNewAccountButton();
	Thread.sleep(2000);
	
	FileLib flib=new FileLib();
	wlib.verify(flib.readPropertyData(PROP_PATH, "createAccountTitle"),
			wlib.getPageTitle(), "created Account page");
	Thread.sleep(2000);
	CreateNewAccount cn=new CreateNewAccount();
	String accn=flib.readExcelData(Excel_PATH, "Accounts1", 0, 1);
	String accno=flib.readExcelData(Excel_PATH, "Accounts1", 1, 1);
	String acct=flib.readExcelData(Excel_PATH, "Accounts1", 2, 1);
	String inds=flib.readExcelData(Excel_PATH, "Accounts1", 3, 1);
	String owns=flib.readExcelData(Excel_PATH, "Accounts1", 4, 1);
	cn.CreateNewAccount(accn, accno, acct, inds, owns);
} 
}
