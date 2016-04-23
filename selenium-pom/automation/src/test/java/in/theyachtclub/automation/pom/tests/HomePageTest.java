package in.theyachtclub.automation.pom.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import in.theyachtclub.automation.pom.driver.BaseClass;
import in.theyachtclub.automation.pom.pages.HomePage;

public class HomePageTest extends BaseClass{
	
	
	
	@BeforeTest(enabled=true)
	public void startWebdriverSession()
	{ 
		startSession();
	}
		
	/*@Test
	public void testLearnToSail()
	{
		HomePage hp = new HomePage(driver);
		hp.NavigateToLearnSailing();
		Assert.assertTrue(driver.getCurrentUrl().contains("http://theyachtclub.in/courses-and-tutorials"),"Filed to navigate");		
	}*/
	
	/*@Test
	public void testNavigateToAboutPage()
	{
		HomePage hp = new HomePage(driver);
		hp.NavigateToQuickExp();
		Assert.assertTrue(driver.getCurrentUrl().contains("http://theyachtclub.in/how-it-all-started/"),"Failed to navigate");		
	}*/
	
	@Test
	public void m1()
	{
		HomePage hp = new HomePage(driver);
		hp.m1();
				
	}
	

}
