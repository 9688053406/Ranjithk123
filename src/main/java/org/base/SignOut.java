package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	
	public WebDriver driver;
	
	public SignOut(WebDriver driver2) {
		
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;
	
	public WebElement getsignout() {
		return signout;
	}

}
	
