package seleniumPrograms;
/*
 * What happens if we launch the browser without http or https?
 * 
 * It will throw an exception : InvalidArgumentException: Malformed URL: URL constructor: www.google.com is not a valid URL.
 * 
 * We can handle this case by throwing our own custom exception.
 */
public class LaunchBrowserWithoutHttps {

	public static void main(String[] args) {
		
		BrowserUtil bUtil = new BrowserUtil();
		bUtil.launchBrowser("chrome");
		bUtil.launchURL("www.google.com");
		bUtil.quitBrowser();


	}

}
