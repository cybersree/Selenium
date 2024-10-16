package com.d2;
import 
public class SetupFramework {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Sreenath\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
