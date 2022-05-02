package VerifyLeadsTest;

import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.Pages.LeadsPage;
import com.Kasa10.validLogin.ValidLoginTest;

public class VeryfyLeadsTest extends BaseTest{
	
	@Test
	
	public void VerifyLeadsTest() throws Throwable{
		ValidLoginTest v1=new ValidLoginTest();
		v1.LoginToAPP();
		
		HomePge hp=new HomePge();
		hp.clickLeadsTab();
		
		Thread.sleep(2000);
		LeadsPage lp=new LeadsPage();
		lp.clicknewLeadsButton();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(lp.getLeadstextAddr(), "leadspage");
	}

}
