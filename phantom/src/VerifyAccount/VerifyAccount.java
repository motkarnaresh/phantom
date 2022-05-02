package VerifyAccount;



import org.testng.annotations.Test;

import com.Kasa10.GenericLib.BaseTest;
import com.Kasa10.GenericLib.WebDriverCommonLib;
import com.Kasa10.Pages.Accountpage;
import com.Kasa10.Pages.HomePge;
import com.Kasa10.validLogin.ValidLoginTest;

public class VerifyAccount extends BaseTest {
	
    @Test
   public void VerifyAccount() throws Throwable {
	ValidLoginTest v1=new ValidLoginTest();
	v1.LoginToAPP();
	
	HomePge hp=new HomePge(); 
	hp.clickAccountTabAddr();
	
	Thread.sleep(2000);
	
	Accountpage ap=new Accountpage();

	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.elementDisplayed(ap.getAccounttextAddr(), "Accountspage");
	 
      Thread.sleep(2000);
      
      ap.clickNewAccountButton();
}
}
