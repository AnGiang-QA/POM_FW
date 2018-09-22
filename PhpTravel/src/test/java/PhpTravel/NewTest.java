package PhpTravel;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.phptravel.core.DriverInit;
import com.phptravel.pages.AccountPage;
import com.phptravel.pages.LandingPage;
import com.phptravel.pages.LoginPage;

public class NewTest {
	
	LandingPage landingPage;
	LoginPage loginPage;
	AccountPage accPage;
	@DataProvider(name="UserProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
//            { "angiang@gmail.com", "123456789" },
//            { "vihoang@gmail.com", "987654321" },
            { "user@phptravels.com", "demouser" }
        };

    }
	@BeforeSuite
	public void setup() {	
		DriverInit.getDriverInit();
		DriverInit.openBroser("https://www.phptravels.net/");
	}
	
	@Test(priority = 0)
	public void verifyLandingPage() {
		landingPage = new LandingPage();
		loginPage = landingPage.goToLoginPage();
//		Assert.assertEquals("a","a");
	}
	
	@Test(priority = 1, dataProvider="UserProvider")
	public void verifyloginPage(String userName,String passWord) {
		accPage = loginPage.login(userName, passWord);
	}
	
//	@AfterSuite
//	public void teardown() {	
//		DriverInit.closeBroser();
//	}	
	
		
		
}
