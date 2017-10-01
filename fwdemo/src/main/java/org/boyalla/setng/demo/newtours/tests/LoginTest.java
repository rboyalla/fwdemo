package org.boyalla.setng.demo.newtours.tests;

import java.net.MalformedURLException;

import org.boyalla.setng.demo.newtours.pages.LoginPage;
import org.boyalla.setng.fw.api.tests.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 
 * 
 * @author Raveendra Boyalla
 *  
 *
 */

public class LoginTest extends BaseTest {

	@Test(dataProvider = DATA_PROVIDER)
	public void loginTest(String uid, String pwd) throws MalformedURLException {
		page(LoginPage.class).login(uid, pwd);

	}

	@DataProvider(name = DATA_PROVIDER)
	public Object[][] getData() {
		return new Object[][] { { "rboyalla@gmail.com", "tanusha" } };
	}
}
