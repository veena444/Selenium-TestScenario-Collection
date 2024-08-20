package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserWithoutHttps {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.get("www.google.com");

	}

}
