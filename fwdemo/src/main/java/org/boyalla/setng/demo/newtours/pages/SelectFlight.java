package org.boyalla.setng.demo.newtours.pages;

import org.boyalla.setng.fw.api.pom.htmelements.Button;
import org.boyalla.setng.fw.api.pom.htmelements.Font;
import org.boyalla.setng.fw.api.pom.htmelements.RadioGroup;
import org.boyalla.setng.fw.api.pom.page.BasePage;

/**
 * 
 * @author Raveendra Boyalla
 * 
 *
 */

public class SelectFlight extends BasePage {

	String flightDetailsHeadingText = "Flight Details";

	Font headingImage = Font.byXpath("//form[@name=\"findflight\"]//font[@color=\"#000000\"]");
	RadioGroup tripType = RadioGroup.byName("tripType");
	Button contimue = Button.byName("reserveFlights");

	public void assertPageDisplay() {
		assertEquals(headingImage.isDisplayed(), true, "The Select Flight Page is not Displayed.");
	}

	public void reserveFlights() {

		contimue.click();
		page(BookFlight.class).assertPageDisplay();
	}
}
