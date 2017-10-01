package org.boyalla.setng.demo.newtours.pages;

import java.net.MalformedURLException;

import org.boyalla.setng.fw.api.pom.page.BasePage;

/**
 *
 * @author Raveendra Boyalla
 *
 *
 */

public class HomePage extends BasePage {

	String url = "/mercurywelcome.php";
	String title = "Welcome: Mercury Tours";

	public HomePage displayHomePage() throws MalformedURLException {
		navigateHome();
		assertHomePage();
		return this;
	}

	private void assertHomePage() {
		assertEquals(getTitle(), title);
	}
}
