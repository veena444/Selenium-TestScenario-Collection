package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DfiierentWaysToCreateDriverObject {
/*
 * What are the different ways we can create the driver object?
 * 
 * WebDriver Hierarchy: 
 * 
 * SearchContext() is a parent Interface which contains two methods findElement() & findElements().
 * 
 * Then comes WebDriver() Interface which is a child ,which extends SearchContext() Interface. WebDriver() contains many abstract methods(methods without body)
 * which are get(url),getTitle(),getCurrentUrl(),getPageSource(),close(),quit(),findElement(),findElements(),getWindowHandle(),getWindowHanles() 
 * & many more.
 * 
 * We can't create an object of Interface. So we can't write WebDriver driver = new WebDriver();
 * 
 * 
 * Then comes RemoteWebDriver() class which implements WebDriver() Interface, it is the child of WebDriver Interface(). Whatever the abstract 
 * methods are available in WebDriver() Interface,it has to implement those methods. Because it is the child class responsibility to implement 
 * those methods.It has its own separate methods.
 * 
 * 
 * Then we have ChromiumDriver() class. It extends RemoteWebDriver() class. ChromeDriver() & EdgeDriver() extends ChromiumDriver() class.
 * 
 * FirefoxDriver(), SafariDriver() directly extends RemoteWebDriver() class. These are child of RemoteWebDriver() class.
 * 
 * WebDriver driver = new ChromeDriver();
 * Here ChromeDriver() is the grand child of WebDriver() Interface or WebDriver() is a grand parent Interface of ChromeDriver() class. So we can do the 
 * top-casting or upcasting.
 * It is like child class object is referred by grand parent Interface reference variable. So we can access all methods of RemoteWebDriver() class,
 * WebDriver() & searchContext() Interface.
 * 
 * Why ca't we write RemoteWebDriver driver = new ChromeDriver() ?
 * According to Java, it is possible. Here ChromeDriver() is the child class & RemoteWebDriver() is the parent class. 
 * Child class object is referred by parent class reference variable.
 * 
 * 
 * What is top casting or upcasting? 
 * Child class object is referred by parent class/interface reference variable is called top casting.
 * 
 */
	public static void main(String[] args) {
		
		//1. valid but works only for Chrome browser
//		ChromeDriver driver = new ChromeDriver();
		
		
		//2. valid and recommended, it can be used for cross browser testing. Most preferable way to create driver object.
		WebDriver driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new EdgeDriver();
//		driver = new SafariDriver();		
		
		
		//3. valid and recommended, but we generally don't use it
//		RemoteWebDriver driver = new ChromeDriver();
		
		
		//4. valid but not recommended because it contains only two methods findElement() & findElements()
//		SearchContext driver = new ChromeDriver();
		
		//5.valid but not recommended, it is valid for only chrome/edge browsers, we can't create object of Firefox or Safari.
		
//		ChromiumDriver driver = new ChromeDriver();
		
		//6. valid but not recommended, we can access only two methods findElement() & findElements()
//		SearchContext driver = new ChromeDriver();
		
		//7. valid and recommended, used when we need to connect to remote machine
//		WebDriver driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		driver.quit();

	}

}
