package seleniumPrograms;
/*
 * Find the footer links in a web page.
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFooterLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerLinks = By.xpath("//footer//a");
		findFooterLinks(footerLinks);
		driver.quit();


	}
	//generic method
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void findFooterLinks(By locator) {
		List<WebElement> footerLinksList = getElements(locator);
		System.out.println("Total no. of footer links: "+footerLinksList.size());
		
		for(WebElement e:footerLinksList) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
