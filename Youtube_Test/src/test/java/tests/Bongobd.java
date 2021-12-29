package tests;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class Bongobd {
	Base base=new Base();
	WebDriver driver=base.setup();
	CommonMethods commonMethods=new CommonMethods(driver);
	HomePage homepage=new HomePage(driver);
	Timeout time=new Timeout();
	
	@BeforeClass
	public void start() {
		driver.get(homepage.Homepage());
		driver.manage().window().maximize();
	}
	
	@Test
	public void Bongobd_test(){
		
	//Match Title
		assertEquals(commonMethods.getTitle(),Locators.pageTitle);
		time.timeout();
		
		commonMethods.ClickOnButton(Locators.content);
		time.timeout();
		
		base.teardown();
	}
}
