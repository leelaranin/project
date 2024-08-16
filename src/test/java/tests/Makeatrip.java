package tests;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.Hotelbooking;
import resources.Base;

public class Makeatrip extends Base {
	public Hotelbooking hotel;
	
	public Makeatrip () {
		driver = intializeDriver();
		//driver.get(prop.getProperty("url"));
		LoadingPage loadingpage = new LoadingPage(driver);
		loadingpage.hotel().click();
		loadingpage.citylocation().click();
		loadingpage.cityselection().sendkeys("singapore");
		
	}
	

}
