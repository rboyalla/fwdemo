package org.boyalla.setng.demo.newtours.tests;

import org.boyalla.setng.demo.newtours.pages.LogOutPage;
import org.boyalla.setng.fw.api.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * 
 * 
 * @author Raveendra Boyalla
 * 
 *
 */

public class LogoutTest extends BaseTest {

	@Test
	public void logOutTest() {
		page(LogOutPage.class).logOut();

	}

}
