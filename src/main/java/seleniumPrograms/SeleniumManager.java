package seleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Selenium Manager is the official driver manager of the Selenium project.
 * 
 * Selenium uses native support implemented by each browser to carry out the automation process.Because of this reason, Selenium users need 'driver'
 * (chromedriver,geckodriver,msedgedriver etc) between the script using the Selenium API & the browser.
 * 
 * Earlier we have to manually download the driver for a required browser and keep it in the 'path' and need to set the system property.Because of 
 * version incompatibility when the browser upgrades its version & doesn't match with the manually downloaded driver version Selenium scripts used
 * to fail.
 * 
 * Because of above reason Selenium team came up with Selenium Manager which comes after every release from Selenium 4.6.
 * 
 * Selenium Manager acts as a binding when the drivers(geckodriver,chromedriver) are not available.
 * 
 * User's can continue manage their drivers manually, if no driver is provided Selenium Manager will come to the rescue.
 * 
 *  Selenium Manager automatically discovers,downloads & caches the drivers required by Selenium when these drivers are unavailable.
 *  
 *  Selenium Manager is used for Data Collection, custom Configuration,Caching,Versioning etc. 
 * 
 */
public class SeleniumManager {

	public static void main(String[] args) {
		//Before 4.6 version setting the driver
		
//		System.setProperty("webdriver.chrome.driver", "path of chromedriver.exe");
		
		//After Selenium 4.6 version
		
		ChromeDriver driver = new ChromeDriver();
	}

}
