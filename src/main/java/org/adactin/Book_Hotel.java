package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
public WebDriver driver;
	
	public Book_Hotel(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement firstnmae;
	
	@FindBy(id = "last_name")
	private WebElement lastnmae;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cardnumber;
	
	@FindBy(id = "cc_type")
	private WebElement cardtyper;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cardexpmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cardexpyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getFirstnmae() {
		return firstnmae;
	}

	public WebElement getLastnmae() {
		return lastnmae;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtyper() {
		return cardtyper;
	}

	public WebElement getCardexpmonth() {
		return cardexpmonth;
	}

	public WebElement getCardexpyear() {
		return cardexpyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	

}
