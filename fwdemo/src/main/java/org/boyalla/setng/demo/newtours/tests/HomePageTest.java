package org.boyalla.setng.demo.newtours.tests;

import java.net.MalformedURLException;

import org.boyalla.setng.demo.newtours.pages.HomePage;
import org.boyalla.setng.fw.api.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * 
 * 
 * @author Raveendra Boyalla
 *  
 *
 */

public class HomePageTest extends BaseTest {

	@Test
	public void homePageTest() throws MalformedURLException {
		page(HomePage.class).displayHomePage();
	}
}
