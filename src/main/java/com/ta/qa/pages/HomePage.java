package com.ta.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.qa.base.TestBase;
import com.ta.qa.utils.TestUtils;

public class HomePage extends TestBase{

	@FindBy(xpath="//div[@title='Search']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='mainSearch']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@id='SEARCH_BUTTON']")
	WebElement searchButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HotelResults hotelSearch() throws InterruptedException {
		search.click();
		searchBox.sendKeys(prop.getProperty("hotel"));
		TestUtils.shortWait();
		searchButton.click();
		return new HotelResults();
	}
	
	
}
