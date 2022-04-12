package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POManager {
	
	public WebDriver driver;
	
	private Login_Page login;
	
	private Search_Hotel searchhotel;
	
	private Select_Hotel selecthotel;
	
	private Book_Hotel bookhotel;
	
	private Logout_Page logout;
	
	public POManager(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
				
		
	}

	public Login_Page getLogin() {
		
		login= new Login_Page(driver);
		return login;
	}

	public Search_Hotel getSearchhotel() {
		
		searchhotel=new Search_Hotel(driver);
		return searchhotel;
	}

	public Select_Hotel getSelecthotel() {
		
		selecthotel=new Select_Hotel(driver);
		return selecthotel;
	}

	public Book_Hotel getBookhotel() {
		
		bookhotel=new Book_Hotel(driver);
		return bookhotel;
	}

	public Logout_Page getLogout() {
		
		logout=new Logout_Page(driver);
		return logout;
	}

	
	
	

}
