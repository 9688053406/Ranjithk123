package org.configuration.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		// TODO Auto-generated constructor stub
		
		File f = new File("C:\\Users\\gopal\\eclipse-workspace\\Cucumber_Practtices\\src\\main\\java\\org\\test\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p= new Properties();
		
		p.load(fis);
	}
	
	public String get_config_url() {
		// TODO Auto-generated method stub
		String url = p.getProperty("url");
		return url;

	}
	
	public String get_config_email() {
		// TODO Auto-generated method stub
		String email = p.getProperty("username");
		return email;	

	}
	
	public String get_config_password() {
		// TODO Auto-generated method stub
		String password = p.getProperty("password");
		return password;

	}
	
	public String get_config_location() {
		
		String location = p.getProperty("location");
		return location;

	}
	
    public String get_config_hotels() {
		
		String hotel = p.getProperty("hotels");
		return hotel;

	}
    
    public String get_config_room() {
		
		String room = p.getProperty("room");
		return room;

	}
    
    public String get_config_number() {
		
		String number = p.getProperty("number");
		return number;

	}

	
    public String get_config_date1() {
		
		String date1 = p.getProperty("date1");
		return date1;

	}
    
    public String get_config_date2() {
		
		String date2 = p.getProperty("date2");
		return date2;

	}
    
    public String get_config_adult() {
		
		String adult = p.getProperty("adult");
		return adult;

	}
    
    public String get_config_child() {
		
		String child = p.getProperty("child");
		return child;

	}
	
    public String get_config_fname() {
		
		String fname = p.getProperty("fname");
		return fname;

	}
    
    public String get_config_lname() {
		
		String lname = p.getProperty("lname");
		return lname;

	}
    
    public String get_config_address() {
		
		String address = p.getProperty("address");
		return address;

	}
    
    public String get_config_cardnumber() {
		
		String cardnumber = p.getProperty("cardnumber");
		return cardnumber;

	}
    
    public String get_config_cardtype() {
		
		String cardtype = p.getProperty("cardtype");
		return cardtype;

	}
    
    public String get_config_month() {
		
		String month = p.getProperty("month");
		return month;

	}
    
    public String get_config_year() {
		
		String year = p.getProperty("year");
		return year;

	}
    
    public String get_config_cvv() {
		
		String cvv = p.getProperty("cvv");
		return cvv;

	}

}
