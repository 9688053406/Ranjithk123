package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
public WebDriver driver;
	
	public Logout_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	

}
