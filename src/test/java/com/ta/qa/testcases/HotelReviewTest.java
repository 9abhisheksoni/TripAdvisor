package com.ta.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ta.qa.base.TestBase;
import com.ta.qa.pages.HomePage;
import com.ta.qa.pages.HotelPage;
import com.ta.qa.pages.HotelResults;
import com.ta.qa.pages.ReviewPage;
import com.ta.qa.utils.TestUtils;

public class HotelReviewTest extends TestBase {

	HomePage homepage;
	HotelResults hotelRslt;
	TestUtils utils;
	ReviewPage reviewPg;
	HotelPage hotelpg;

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
		hotelpg = new HotelPage();
	}

	@Test
	public void hotelStayReviewTest() throws InterruptedException {
		homepage.hotelSearch();
		hotelRslt.clickFirstHotel();
		utils.windowHandle();
		utils.shortWait();
		hotelpg.clickOnReviewButton();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
