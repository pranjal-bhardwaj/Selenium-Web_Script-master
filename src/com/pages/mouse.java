package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.util.constants;

public class mouse {
		
		WebDriver driver;
		public mouse(WebDriver d) {
			driver=d;
		}
		
		@FindBy(id = constants.draggable)
		WebElement draggable;
		@FindBy(id = constants.dropsrc)
		WebElement dropsrc;
		@FindBy(id = constants.dropdst)
		WebElement dropdst;
		@FindBy(css = constants.selected1)
		WebElement selected1;
		@FindBy(css = constants.selected2)
		WebElement selected2;
		@FindBy(id = constants.upload)
		WebElement upload;
		
		
		public void jqui() throws InterruptedException {
			//draggable
			driver.navigate().to("https://jqueryui.com/draggable/");
			driver.switchTo().frame(0);
	        Actions builder = new Actions(driver);
	        Action d= builder.dragAndDropBy(draggable, 180, 49).build();
	        d.perform();
	        
	        //droppable
	        driver.navigate().to("https://jqueryui.com/droppable/");
	        driver.switchTo().frame(0);
	        d= builder.dragAndDrop(dropsrc, dropdst).build();
	        d.perform();
	        
	        //selectable
	        driver.navigate().to("https://jqueryui.com/selectable/");
	        driver.switchTo().frame(0);
	        builder.clickAndHold(selected1).moveToElement(selected2).release().build().perform();

	        //upload
	        driver.navigate().to("http://demo.guru99.com/selenium/upload/ ");
	        upload.sendKeys("/home/pranjal/eclipse/eclipse.ini");
	        driver.findElement(By.cssSelector("#terms")).click();
	        driver.findElement(By.cssSelector("#submitbutton")).click();
		}

}
