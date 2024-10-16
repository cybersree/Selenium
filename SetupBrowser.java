package component;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.Assert;
import main.SetupFramework;

public class SetupBrowser {

	
	
	public static void main(String[] args) throws InterruptedException {
		SetupBrowser sub = new SetupBrowser();
		sub.createComponent();
	}
	public void verifyComponent()
	{
		//WebElement ele= driver.findElement(By.xpath("//div/h1/div[text()='DSA to Development:']"));
	}
	public void createComponent() throws InterruptedException {
		// TODO Auto-generated method stub
		SetupFramework suf = new SetupFramework();
		WebDriver driver=suf.setupBrowser();
		suf.clickMenu();
		suf.clickSubMenu();
		WebElement ele= driver.findElement(By.xpath("//div/h1/div[text()='DSA to Development:']"));
		boolean flag=ele.isDisplayed();
		if(flag==true)
			System.out.println("Working fine");
		System.out.println("Element is "+ele);
		Assert.assertTrue("Working fine!", ele.isDisplayed());
		driver.close();
		//Assert.assertEquals("DSA to Development:", ele.toString());
	}
	
}
