package VerifyLeadsTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.FileLib;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.CreateNewLeadePage;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.Pages.LeadsPage;
import com.Kasa10.validLogin.ValidLoginTest;
 
@Listeners(com.Kasa10.GenericLib.MyListeners.class)

public class VerifyNewLeadTest extends BaseTest {
@Test

public void verifyNewLeadTest() throws Throwable
{
	ValidLoginTest v1=new ValidLoginTest();
	v1.LoginToAPP();
	HomePge hp=new HomePge();
	hp.clickLeadsTab();
	
	LeadsPage lp=new LeadsPage();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.elementDisplayed(lp.getLeadstextAddr(), "leadsPage");
	
	Thread.sleep(2000);
	
	lp.clicknewLeadsButton();
	
	
	Thread.sleep(2000);
	

	FileLib flib=new FileLib(); 
	wlib.verify(flib.readPropertyData(PROP_PATH, "createLeadTitle"),
			wlib.getPageTitle(),"create leads page");
	Thread.sleep(2000);
	
	
	
	CreateNewLeadePage C1=new CreateNewLeadePage();
	String salText=flib.readExcelData(Excel_PATH, "Leads", 0, 1);
	String fn=flib.readExcelData(Excel_PATH, "Leads", 1, 1);
	String company=flib.readExcelData(Excel_PATH, "Leads", 2, 1);
	String ln=flib.readExcelData(Excel_PATH, "Leads", 3, 1);
	String leadsource=flib.readExcelData(Excel_PATH, "Leads", 4, 1);
	C1.CreateNewLead(salText,fn,company,ln,leadsource);
	}
}
