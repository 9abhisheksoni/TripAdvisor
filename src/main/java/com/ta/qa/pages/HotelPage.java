package com.ta.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.qa.base.TestBase;

public class HotelPage extends TestBase {

	@FindBy(xpath = "//a[text()='Write a review']")
	WebElement writeReview;

	public HotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ReviewPage clickOnReviewButton() {
		writeReview.click();
		return new ReviewPage();
	}

}
