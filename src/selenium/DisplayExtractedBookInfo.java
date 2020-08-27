package selenium;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class DisplayExtractedBookInfo {

	public static void displayData(List<String> categories, List<String> names, WebDriver driver)
	{
		try
		{
			PrintStream fw = new PrintStream("/Users/cajetanfernandes/eclipse-workspace"
					+ "/Selenium-Amazon-Automation/bin/AmazonExtractedBookInfo.txt");
			fw.println("");
			fw.println("Book categories from Amazon");
			for(String i:categories)
			{
				fw.println(i);
			}
			fw.println("");
			fw.println("Most Gifted Action and Adventure book names");
			for(String i:names)
			{
				fw.println(i);
			}
			fw.flush();
			fw.close();
			driver.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}
