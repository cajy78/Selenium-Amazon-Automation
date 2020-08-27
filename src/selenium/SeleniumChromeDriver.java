package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumChromeDriver {

	private static WebDriver driver;
	
	public static WebDriver initiateChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/cajetanfernandes/Project Resources/Java Project Resouces/chromedriver");
		ChromeOptions cmo = new ChromeOptions();
		cmo.addArguments("start-maximized");
		driver = new ChromeDriver(cmo);
		return driver;
	}
}
