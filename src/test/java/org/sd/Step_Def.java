package org.sd;

import org.adactin.POManager;
import org.base.Base_Class;
import org.configuration.data.File_Reader_Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.test_runner.Test_Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends Base_Class {
	

	public static WebDriver driver = Test_Adactin.driver;
	
	public static POManager pom=new POManager(driver);
	
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_url();		
		getUrl(url);

	}

	@When("^user Enter The UserName In UserName Field$")
	public void user_Enter_The_UserName_In_UserName_Field() throws Throwable {
		String username = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_email();		
		inputValueElement(pom.getLogin().get_username(), username);

	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		String password = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_password();
		inputValueElement(pom.getLogin().getPassword(), password);
	}

	@Then("^user Click On The Login Button And Navigate To The Search Hotel$")
	public void user_Click_On_The_Login_Button_And_Navigate_To_The_Search_Hotel() throws Throwable {

		ClickOnElement(pom.getLogin().clicklogin());
	}

	@When("^user Enter The Hotel Location$")
	public void user_Enter_The_Hotel_Location() throws Throwable {
		
		String location = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_location();
		dropdown("byvalue", pom.getSearchhotel().getLocation(), location);
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		
		String hotel = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_hotels();
		dropdown("byvalue", pom.getSearchhotel().getHotel(), hotel);

	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		
		String room = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_room();
		dropdown("byvalue", pom.getSearchhotel().getRoomtype(), room);


	}

	@When("^user Enter The Number Of Rooms$")
	public void user_Enter_The_Number_Of_Rooms() throws Throwable {

		String number = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_number();
		dropdown("byvalue", pom.getSearchhotel().getNumberofrooms(), number);

	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {

		String date1 = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_date1();
		inputValueElement(pom.getSearchhotel().getDatein(), date1);

		
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {

		String date2 = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_date2();
		inputValueElement(pom.getSearchhotel().getDatein(), date2);
		
	}

	@When("^user Enter The Adults Per Room$")
	public void user_Enter_The_Adults_Per_Room() throws Throwable {
	 
		String adult = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_adult();
		dropdown("byvalue", pom.getSearchhotel().getAdultroom(), adult);
	}

	@When("^user Enter The Children Per Room$")
	public void user_Enter_The_Children_Per_Room() throws Throwable {

		String child = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_child();
		dropdown("byvalue", pom.getSearchhotel().getAdultroom(), child);
		
	}

	@Then("^user Click On The Search Button And Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	  
		ClickOnElement(pom.getSearchhotel().getSumbit());
	}

	@When("^user Select On Ratio Button$")
	public void user_Select_On_Ratio_Button() throws Throwable {
	  
		ClickOnElement(pom.getSelecthotel().getRadiobtn());
	}

	@Then("^user Click On The Continue Button And Navigate To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_Navigate_To_The_Book_Hotel_Page() throws Throwable {
	   
		ClickOnElement(pom.getSelecthotel().getContinuebtn());
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
	  
		String fname = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_fname();
		inputValueElement(pom.getBookhotel().getFirstnmae(), fname);
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		
		String lname = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_lname();
		inputValueElement(pom.getBookhotel().getLastnmae(), lname);
		
	}
	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
	  
		String address = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_address();
		inputValueElement(pom.getBookhotel().getAddress(), address);
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
	  
		String card = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_cardnumber();
		inputValueElement(pom.getBookhotel().getCardnumber(), card);
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
	  
		String cardtype = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_cardtype();
		dropdown("byvalue", pom.getBookhotel().getCardtyper(), cardtype);
	}

	@When("^user Select The Credit Card Expiry Month$")
	public void user_Select_The_Credit_Card_Expiry_Month() throws Throwable {
	   
		String month = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_month();
		dropdown("byvalue", pom.getBookhotel().getCardexpmonth(), month);
		
		
	}
	@When("^user Select The Credit Card Expiry Year$")
	public void user_Select_The_Credit_Card_Expiry_Year() throws Throwable {
	   
		
		
		String year = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_year();
		dropdown("byvalue", pom.getBookhotel().getCardexpyear(), year);
		
	}

	@When("^user Enter The Credit Card CVV Number$")
	public void user_Enter_The_Credit_Card_CVV_Number() throws Throwable {
	   
		String cvv = File_Reader_Manager.get_instance_FRM().get_instance_CR().get_config_cvv();
		inputValueElement(pom.getBookhotel().getCvvnumber(), cvv);
	}

	@Then("^Click On The Book Now Button And Navugate To The Booking Confirmation Page$")
	public void click_On_The_Book_Now_Button_And_Navugate_To_The_Booking_Confirmation_Page() throws Throwable {
	   
		ClickOnElement(pom.getBookhotel().getBooknow());
	}

//	@Then("^user Click On The Logout Button And Navigate To The Login Page$")
//	public void user_Click_On_The_Logout_Button_And_Navigate_To_The_Login_Page() throws Throwable {
//	   
//		ClickOnElement(pom.getLogout().getLogout());
//	}



}
