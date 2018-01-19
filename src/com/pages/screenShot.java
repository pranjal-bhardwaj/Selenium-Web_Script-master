package com.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class screenShot {
	WebDriver driver;
	public screenShot(WebDriver d) {
		driver=d;
	}
	
	public void screenCapture() {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(SrcFile, new File("/home/pranjal/book.png"));//give your desired address to store pic with filename.
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
