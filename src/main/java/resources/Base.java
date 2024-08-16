package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException {
		Properties prop = new Properties();
		String proPath = System.getProperty("user.dir")+("src\\main\\java\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(proPath);
		prop.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		//WebDriverManager.chromedriver().setup();
		return driver;
	}

}
