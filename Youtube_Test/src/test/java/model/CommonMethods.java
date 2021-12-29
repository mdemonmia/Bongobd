package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	WebDriver driver;
	public CommonMethods(WebDriver driver) {
		this.driver=driver;
	}
	
	//GetTitle
	public String getTitle() {
		return driver.getTitle();
	}
	
	//clickonbutton
	public void ClickOnButton(By Btn) {
		 driver.findElement(Btn).click();
	}
	
	//sendKeys
	public void sendText(By element,String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	//GetText
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	


}
