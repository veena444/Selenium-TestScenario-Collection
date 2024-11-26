package seleniumPrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarouselHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center' });", element);
		
		getCarouselItems();
		driver.quit();

	}
	

	public static void getCarouselItems() {
		
		String xpath = "//span[text()='Best Sellers in Home & Kitchen']/../../..//following-sibling::div//div/ul/li/span/a/img";
		String nextXpath = "//span[text()='Best Sellers in Home & Kitchen']/ancestor::div[contains(@class,'product-shoveler')]/div[2]/a[2][@aria-label='Carousel next slide']";

		List<WebElement> productList = driver.findElements(By.xpath(xpath));
		System.out.println(productList.size());

		Set<String> productSet = new HashSet<String>();

		while (!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("feed-control-disabled")) {

			for (WebElement e : productList) {
				String productName = e.getAttribute("alt");
				productSet.add(productName);
			}

			driver.findElement(By.xpath(nextXpath)).click();
		}
		
		// print the products

		for (String e : productSet) {
			System.out.println(e);
		}
		
	}
}
