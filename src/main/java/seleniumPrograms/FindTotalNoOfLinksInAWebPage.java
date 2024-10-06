package seleniumPrograms;

import java.util.ArrayList;
import java.util.ArrayList;
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
		
//		//links will starts with the HTML tag <a>
//		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		//to print the total no. of links in a web page
//		System.out.println("Total no. of links in a page: "+linksList.size());
//		
//		//print all the links with their text
//		
////		for(WebElement e:linksList ) {
////			String text = e.getText();
////			System.out.println(text);
////		}
//		
//		//ignore the links without text
//		int count=0;
//		for(WebElement e: linksList) {
//			String text = e.getText();
//			if(text.length() !=0) {
//				System.out.println(count+" "+text);
//			}
//			count++;
//		}
		
		By links = By.tagName("a");
		int linksCount = getElementsCount(links);
		System.out.println("Total no. of links in a page: "+linksCount);
		
		getElementTextList(links);
		printElementList(links);
		
		
		driver.quit();
		
	}
	
	//creating generic methods for elementCount & getElementTextList
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static List<String> getElementTextList(By locator) {
		List<WebElement> elementLists = getElements(locator);
		List<String> elementTextList = new ArrayList<String>();
		for(WebElement e: elementLists) {
			String elementText = e.getText();
			if(elementText.length() != 0) {
				elementTextList.add(elementText);
			}			
		}
		return elementTextList;
	}
	
	public static void printElementList(By locator) {
		List<String> eleTextList = getElementTextList(locator);
		for(String e: eleTextList) {
			System.out.println(e);
		}
	}

}
