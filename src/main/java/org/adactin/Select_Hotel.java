package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	public Select_Hotel(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	
	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	public WebElement getContinuebtn() {
		return continuebtn;
	}


}
