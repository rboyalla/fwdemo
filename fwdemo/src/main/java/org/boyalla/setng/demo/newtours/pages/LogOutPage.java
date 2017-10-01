package org.boyalla.setng.demo.newtours.pages;

import org.boyalla.setng.fw.api.pom.htmelements.Anchor;
import org.boyalla.setng.fw.api.pom.page.BasePage;

/**
 * 
 * 
 * @author Raveendra Boyalla
 * 
 * 
 *
 */

public class LogOutPage extends BasePage {

	private Anchor signout = Anchor.byHref("mercurysignoff.php");

	public LoginPage logOut() {

		signout.click();
		LoginPage loginPage = page(LoginPage.class);
		loginPage.assertPageDisplay();
		return loginPage;

	}

}
