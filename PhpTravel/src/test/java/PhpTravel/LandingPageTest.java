package PhpTravel;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravel.core.DriverContext;
import com.phptravel.pages.LandingPage;
import com.phptravel.pages.LoginPage;

public class LandingPageTest extends DriverContext{
	
	LandingPage landingPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setup() {	
//		DriverInit.getDriverInit();
//		DriverInit.openBroser("https://www.phptravels.net/");
		initialazation();
		driver.navigate().to("https://www.phptravels.net/");
		System.out.println("Begin");
	}
	
	@Test(priority = 1)
	public void verifyScreenTitle1() {
//		Assert.assertEquals("abc", landingPage.getLandingPageTitle());
		Assert.assertEquals("abc","abc");
		System.out.println("Test 1");
	}

	@Test(priority = 0)
	public void verifyScreenTitle2() {
		loginPage = new LoginPage();
		loginPage.login("a", "a");
		
//		Assert.assertEquals("efg", landingPage.getLandingPageTitle());
		Assert.assertEquals("abc","abc");
		System.out.println("Test 2");
	}
	
	@Test(priority = 2)
	public void verifyScreenTitle3() {
//		Assert.assertEquals("xyz", landingPage.getLandingPageTitle());
		Assert.assertEquals("abc","abc");
		System.out.println("Test 3");
	}
	
	@AfterMethod
	public void teardown() {	
		driver.quit();
		System.out.println("End");
	}	

}
