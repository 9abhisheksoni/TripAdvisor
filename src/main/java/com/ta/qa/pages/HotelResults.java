package com.ta.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.qa.base.TestBase;

public class HotelResults extends TestBase{

	@FindBy(xpath="(//div[@class='location-meta-block'])[1]")
	WebElement firstHotel;
	
	
	public HotelResults() {
		PageFactory.initElements(driver, this);
	}
	
	public HotelPage clickFirstHotel() {
		firstHotel.click();
		return new HotelPage();
	}
}
