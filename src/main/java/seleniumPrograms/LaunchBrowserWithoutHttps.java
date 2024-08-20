package seleniumPrograms;

public class LaunchBrowserWithoutHttps {

	public static void main(String[] args) {
		
		BrowserUtil bUtil = new BrowserUtil();
		bUtil.launchBrowser("chrome");
		bUtil.launchURL("www.google.com");
		bUtil.quitBrowser();


	}

}
