package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;

	public Search_Hotel(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	
	@FindBy(id = "room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(id = "room_nos")
	private WebElement numberofrooms;

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}
	
	@FindBy(id = "datepick_in")
	private WebElement datein;
	
	public WebElement getDatein() {
		return datein;
	}
	
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	
	public WebElement getDateout() {
		return dateout;
	}
	
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	public WebElement getAdultroom() {
		return adultroom;
	}	
	

	@FindBy(id = "child_room")
	private WebElement child;
	
	public WebElement getChild() {
		return child;
	}

	
	@FindBy(id = "Submit")
	private WebElement sumbit;

	public WebElement getSumbit() {
		return sumbit;
	}
	
	
	
	

}
