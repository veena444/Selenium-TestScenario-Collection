package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser: "+browserName);
			throw new BrowserException("Browser not supported!");
		}
		return driver;
	}
	
	public void launchURL(String url) {
		if(url.indexOf("http") != 0) {
			throw new BrowserException("http(s) missing in the url");
		}
		driver.get(url);
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
