package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicElementsHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/signin");
		
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement usernameDropdown =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'demouser')]")));
		usernameDropdown.click();
		
		WebElement password = driver.findElement(By.id("password"));
		password.click();
		
		WebElement passwordDropdown =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'testingisfun99')]")));
		passwordDropdown.click();
		
		driver.findElement(By.id("login-btn")).click();


		

		
		

	}

}
