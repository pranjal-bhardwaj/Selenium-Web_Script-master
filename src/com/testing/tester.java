package com.testing;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.*;

public class tester extends testbase{
	@BeforeSuite
	public void start()
	{
		init();
	}
	
	@Test
	public void testing() throws InterruptedException
	{	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ytube yt1 = PageFactory.initElements(driver, ytube.class);
		yt1.search();
		Thread.sleep(5000);
		mouse m1 = PageFactory.initElements(driver, mouse.class);
		m1.jqui();
		
		Thread.sleep(3000);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		register reg = PageFactory.initElements(driver, register.class);
		reg.regPage();
		
		booking book =PageFactory.initElements(driver, booking.class);
		book.bookflight();
		
		screenShot scr=PageFactory.initElements(driver, screenShot.class);
		scr.screenCapture();
		
		gmailStarter gms=PageFactory.initElements(driver, gmailStarter.class);
		try {
			gms.sender();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		wikipedia w1 =PageFactory.initElements(driver, wikipedia.class);
		w1.searchwiki();
		
	}
	
	
	@AfterSuite
	public void end()
	{
		driver.close();
	}
	
}
