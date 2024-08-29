package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Find the total no. of links in a web page and print the text of each link.
 */
public class FindTotalNoOfLinksInAWebPage {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//links will starts with the HTML tag <a>
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		//to print the total no. of links in a web page
		System.out.println("Total no. of links in a page: "+linksList.size());
		
		//print all the links with their text
		
//		for(WebElement e:linksList ) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		//ignore the links without text
		int count=0;
		for(WebElement e: linksList) {
			String text = e.getText();
			if(text.length() !=0) {
				System.out.println(count+" "+text);
			}
			count++;
		}
		
		driver.quit();
		
	}

}
