package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Find all the links from footer section of 'Get to Know Us', 'Make Money with Us','Amazon Payment Products','Let Us Help You'.
 */
public class AmazonFindLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		String firstColumnValues = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'][1]")).getText();
		System.out.println("First column values from footer section:\n" +firstColumnValues);
		
		
		String secondColumnValues = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'][2]")).getText();
		System.out.println("Second column values from footer section:\n"+secondColumnValues);
		
		
		String thirdColumnValues = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'][3]")).getText();
		System.out.println("Third column values from footer section:\n"+thirdColumnValues);
		
		
		String fourthColumnValues = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'][4]")).getText();
		System.out.println("Fourth column values from footer section:\n"+fourthColumnValues);
		
		driver.quit();

	}

}
