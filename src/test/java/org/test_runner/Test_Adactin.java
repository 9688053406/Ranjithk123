package org.test_runner;

import org.base.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\org\\adactin\\feature\\Adactin.feature",
		
		glue = "org.sd",
		
		plugin = "html:Cucumber_Reports/Rep"
		
		)


public class Test_Adactin {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		driver=Base_Class.browser_configuration("chrome");

	}
	
	@AfterClass
	public static void tear_Down() {
		driver.close();

	}

}
