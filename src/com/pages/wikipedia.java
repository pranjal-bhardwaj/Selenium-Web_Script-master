package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class wikipedia {
	WebDriver driver;
	public wikipedia(WebDriver d) {
		driver=d;
	}
	
	public void searchwiki() throws InterruptedException {
		String wiki="apple inc";
		String wikiUrl="https://en.wikipedia.org/wiki/Main_Page";
		driver.get(wikiUrl);
		Thread.sleep(3000);
		driver.findElement(By.id("searchInput")).sendKeys(wiki);
		driver.findElement(By.id("searchButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Official website")).click();
		
	}
		
}
