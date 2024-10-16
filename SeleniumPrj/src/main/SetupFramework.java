package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SetupFramework {
	public static WebDriver driver;

	public SetupFramework() {
		
	}

	public WebDriver setupBrowser() throws InterruptedException {

		
		 System.setProperty( "webdriver.chrome.driver",
		 "C:\\Users\\Sreenath\\Documents\\jar_files\\chromedriver.exe"); //
		  //Instantiate a ChromeDriver class. driver = new ChromeDriver();
		 driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://www.geeksforgeeks.org/");
		return driver;
		// driver.wait(5);

	}

	public void clickMenu() throws InterruptedException {
		WebElement Ele = driver.findElement(By.xpath("//li/span[text()='Courses']"));
		Actions action = new Actions(driver);
		action.moveToElement(Ele).perform();
		Thread.sleep(5);
	}

	public void clickSubMenu() {
		WebElement ele = driver.findElement(By.xpath("//li//a[text()='DSA to Development']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		action.click().build().perform();
	}
}
