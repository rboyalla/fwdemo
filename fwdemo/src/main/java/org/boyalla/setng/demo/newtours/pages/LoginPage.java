package org.boyalla.setng.demo.newtours.pages;

import org.boyalla.setng.fw.api.pom.htmelements.Button;
import org.boyalla.setng.fw.api.pom.htmelements.TextField;
import org.boyalla.setng.fw.api.pom.page.BasePage;

/**
 * 
 * 
 * @author Raveendra Boyalla
 * 
 * 
 *
 */

public class LoginPage extends BasePage {

	TextField uidTxtField = TextField.byName("userName");
	TextField pwdTxtField = TextField.byName("password");
	Button signInButton = Button.byName("login");

	public void login(String uid, String pwd) {
		uidTxtField.setText(uid);
		pwdTxtField.setText(pwd);
		signInButton.click();
		page(FlightFinder.class).assertPageDisplay();
	}

	public void assertPageDisplay() {
		assertTrue(signInButton.isDisplayed());
	}

}
