package com.ui.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TOI {
	

	@Test
	public void Test1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/");
		List<WebElement > locators =driver.findElements(By.xpath("//nav[contains(@class,'nav_links_wrapper')]//li[contains(@class,'col')]/a"));
		List<WebElement> webs= null;
		Actions action = new Actions(driver);
		for(WebElement loc:locators) {
			String col=loc.getText().toLowerCase();
			
			action.moveToElement(loc).build().perform();
			System.out.println(col);
			webs = driver.findElements(By.xpath("//nav[contains(@class,'nav_links_wrapper')]//li[contains(@class,'col')]/a/following-sibling::div//li//a[contains(@href,'/"+col+"')]"));
			for(WebElement web:webs) {
				System.out.println(web.getAttribute("href"));
			}
			
		}
		
		driver.quit();
	}

}
