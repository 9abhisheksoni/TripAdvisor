package com.ta.qa.utils;

import java.util.Iterator;
import java.util.Set;

import com.ta.qa.base.TestBase;

public class TestUtils extends TestBase{

	public static long Page_Load_Timeout = 20;
	public static long Implicit_Wait = 20;
	
	public static void shortWait() throws InterruptedException{
		Thread.sleep(3000);
	}
	
	public void windowHandle() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String hotelResultWindow = it.next();
		String selectedHotel = it.next();
		driver.switchTo().window(selectedHotel);
		
	}
	
}
