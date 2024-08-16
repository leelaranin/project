package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;
public class Hotelbooking extends Base {
	
	/*WebDriver driver;
	public Hotelbooking(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		/*@FindBy(xpath ="(//span[@class='headerIconWrapper']//span)[2]")
		WebElement hotel;
		
		public WebElement hotel() {
			return hotel;
		}*/
		
		@FindBy(xpath="//input[@id='city']")
		WebElement citylocation;
		public WebElement citylocation() {
			return citylocation;
		}
		@FindBy(xpath="//input[@type='text'][@autocomplete='nope']")
		WebElement cityselection;
		 public WebElement cityselection() {
			return cityselection;
		}
		 
		 @FindBy(xpath="//span[@class='headerIconWrapper']//span)[2]")
		 WebElement hotel;
		 
	}












