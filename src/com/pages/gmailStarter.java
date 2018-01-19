package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.constants;

public class gmailStarter {

	WebDriver driver;
	public gmailStarter(WebDriver d) {
		driver=d;
	}
	
	String cdn[] = constants.cred;
	
	public void sender()  throws InterruptedException, AWTException{
		
		//String gmailUrl="https://www.gmail.com";
		String gmailUrl="https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(gmailUrl);
		driver.findElement(By.id("identifierId")).sendKeys(cdn[0]);
		driver.findElement(By.cssSelector("#identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(cdn[1]);
		driver.findElement(By.cssSelector("#passwordNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#\\3a j0 > div > div")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("to")).sendKeys(cdn[2]);
		driver.findElement(By.name("subjectbox")).sendKeys("Automated message:Accept the screenshot");
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();		//click on attachment icon
		StringSelection ss = new StringSelection("/home/pranjal/book.png");		//upload your file using RobotClass...so attach your path where file is located.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(6000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
}
