package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.util.constants;

public class register {
	WebDriver driver;
	public register(WebDriver d) {
		driver=d;
	}
	
	String arr[]=constants.arr;
	
	@FindBy(name = constants.firstName)
	WebElement firstName;
	@FindBy(name = constants.lastName)
	WebElement lastName;
	@FindBy(name = constants.phone)
	WebElement phone;
	@FindBy(css = constants.email)
	WebElement email;
	@FindBy(name=constants.address)
	WebElement address;
	@FindBy(name=constants.city)
	WebElement city;
	@FindBy(name=constants.state)
	WebElement state;
	@FindBy(css = constants.userName)
	WebElement userName;
	@FindBy(name = constants.password)
	WebElement password;
	@FindBy(name = constants.confirmPassword)
	WebElement confirmPassword;
	@FindBy(name = constants.country)
	WebElement country;
	@FindBy(css= constants.imageSubmit)
	WebElement submit;
	
	
	
	public void regPage() {
		String regUrl="http://newtours.demoaut.com/mercuryregister.php";
		driver.get(regUrl);
		firstName.sendKeys(arr[0]);
		lastName.sendKeys(arr[1]);
		phone.sendKeys(arr[2]);
		email.sendKeys(arr[3]);
		address.sendKeys(arr[6]);
		city.sendKeys(arr[7]);
		state.sendKeys(arr[8]);
		Select drpCountry = new Select(country);
		drpCountry.selectByVisibleText(arr[9]);
		userName.sendKeys(arr[4]);
		password.sendKeys(arr[5]);
		confirmPassword.sendKeys(arr[5]);
		submit.click();
		
		
	}
}
