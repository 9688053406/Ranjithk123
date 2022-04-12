package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement usernmae;
	public WebElement get_username() {
		return usernmae;
		
	}
	
	@FindBy(id = "password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "login")
	private WebElement login;
	public WebElement clicklogin() {
		return login;
		

	}
	
	

	
	
	

}
