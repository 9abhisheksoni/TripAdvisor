package com.ta.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ta.qa.base.TestBase;
import com.ta.qa.pages.HomePage;
import com.ta.qa.pages.HotelResults;
import com.ta.qa.pages.ReviewPage;
import com.ta.qa.utils.TestUtils;

public class HotelReviewTest extends TestBase {

	HomePage homepage;
	HotelResults hotelRslt;
	TestUtils utils;
	ReviewPage reviewPg;

	public HotelReviewTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initializtion();
		homepage = new HomePage();
		hotelRslt = new HotelResults();
		utils = new TestUtils();
		reviewPg = new ReviewPage();
	}

	@Test
	public void hotelStayReviewTest() throws InterruptedException {
		homepage.hotelSearch();
		hotelRslt.clickFirstHotel();
		utils.windowHandle();
		driver.switchTo().window("hotelResultWindow");
		reviewPg.hoverStarBubble();
	}

	/*@AfterTest
	public void tearDown() {
		driver.quit();

	}*/

}
