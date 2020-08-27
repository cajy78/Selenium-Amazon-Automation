package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.Alert;
//import java.io.PrintStream;
import java.io.IOException;

public class RunSeleniumAmazon {

	public static void main(String[] args) throws InterruptedException, IOException{
		// Project path variable used to locate project parent directory for accessing files and and storing screenshots
		String projectPath = "/Users/cajetanfernandes/eclipse-workspace/Selenium-Amazon-Automation/bin";
		
		//Selenium Web driver.
		WebDriver driver = SeleniumChromeDriver.initiateChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//Amazon Page POM / Page Factory used to initiated elements.
		AmazonPageObjectModel ap = PageFactory.initElements(driver, AmazonPageObjectModel.class);
		//public function called to extract elements from Amazon page and action accordingly.
		ap.startExtract(driver, projectPath);
		DisplayExtractedBookInfo.displayData(ap.bookCategories, ap.bookNames, driver);
	}
}
