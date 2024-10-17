package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import component.SetupBrowser;

import org.junit.Test;
import main.SetupFramework;

public class componentTest extends SetupBrowser{
	WebDriver driver;
	@Test
	public void verifyMenu() throws InterruptedException
	{
		SetupBrowser sub = new SetupBrowser();
		sub.createComponent();
		//WebElement ele= ChromeDriver.findElement(By.xpath("//div/h1/div[text()='DSA to Development:']"));
		
		
		/*
		 * SetupFramework suf = new SetupFramework(); suf.setupBrowser();
		 * suf.clickMenu(); suf.clickSubMenu();
		 */
		
	}

}

