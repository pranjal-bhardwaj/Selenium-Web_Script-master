package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.constants;

public class ytube {
	
	WebDriver driver;
	public ytube(WebDriver d) {
		driver=d;
	}
	
	@FindBy(id = constants.searchbox)
	WebElement searchbox;

	@FindBy(id = constants.search)
	WebElement search;
	
	public void search() throws InterruptedException {
	String searchtext = "despacito";
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	searchbox.sendKeys(searchtext);
	search.click();
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("#contents > ytd-video-renderer:nth-child(1)")).click();
	}
}
