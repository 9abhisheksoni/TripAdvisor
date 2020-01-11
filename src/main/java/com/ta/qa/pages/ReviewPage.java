package com.ta.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.qa.base.TestBase;

public class ReviewPage extends TestBase{

	@FindBy(xpath = "//span[@class='ui_bubble_rating fl bubble_50']")
	WebElement starBubble;

	public ReviewPage() {
		PageFactory.initElements(driver, this);
	}
	public void hoverStarBubble() {
		Actions action = new Actions(driver);
		action.moveToElement(starBubble).build().perform();
	}
	
}
