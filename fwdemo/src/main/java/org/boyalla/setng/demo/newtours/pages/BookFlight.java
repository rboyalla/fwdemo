package org.boyalla.setng.demo.newtours.pages;

import org.boyalla.setng.demo.newtours.data.Address;
import org.boyalla.setng.demo.newtours.data.CrediCardDetails;
import org.boyalla.setng.demo.newtours.data.Passengers;
import org.boyalla.setng.fw.api.pom.htmelements.Button;
import org.boyalla.setng.fw.api.pom.htmelements.CheckBox;
import org.boyalla.setng.fw.api.pom.htmelements.DropdownList;
import org.boyalla.setng.fw.api.pom.htmelements.Font;
import org.boyalla.setng.fw.api.pom.htmelements.RadioGroup;
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

public class BookFlight extends BasePage {

	String summary = "Summary";

	Font headingImage = Font.byXpath("//font[@face=\"ARIAL, HELVETICA\"]//font[@color=\"#000000\"]");
	RadioGroup tripType = RadioGroup.byName("tripType");
	
	TextField firstName = TextField.byName("passFirst0");
	TextField lastName = TextField.byName("passLast0");
	DropdownList meal = DropdownList.byName("pass.0.meal");
	DropdownList creditCardType = DropdownList.byName("creditCard");
	TextField cardNumber = TextField.byName("creditnumber");

	DropdownList expirationDate = DropdownList.byName("cc_exp_dt_mn");
	DropdownList expirationYear = DropdownList.byName("cc_exp_dt_yr");
	TextField cc_frst_name = TextField.byName("cc_frst_name");
	TextField cc_mid_name = TextField.byName("cc_mid_name");
	TextField cc_last_name = TextField.byName("cc_last_name");

	TextField billAddress1 = TextField.byName("billAddress1");
	TextField billCity = TextField.byName("billCity");
	TextField billState = TextField.byName("billState");
	TextField billZip = TextField.byName("billZip");
	DropdownList billCountry = DropdownList.byName("billCountry");

	CheckBox sameAsBilling = CheckBox.byXpath("//input[@name=\"ticketLess\"]");
	// book[descendant::title[@lang='it']]
	
	Button securePurchase = Button.byName("buyFlights");
	
 	

	public void enterCardDetails(Passengers pd, Address ad, CrediCardDetails cd) {
		// Enter Passengers
 		firstName.setText(pd.firstNmae);
		lastName.setText(pd.lastName);
		meal.selectByValue("HNML");
		// Enter card details
		creditCardType.selectByValue(cd.creditCardType);
		cardNumber.setText(cd.cardNumber);
		expirationDate.selectByVisibleText(cd.expirationDate);
		expirationYear.selectByVisibleText(cd.expirationYear);
		cc_frst_name.setText(cd.cc_frst_name);
		cc_mid_name.setText(cd.cc_mid_name);
		cc_last_name.setText(cd.cc_last_name);
		// Billing Address
		billAddress1.setText(ad.billAddress1);
		billCity.setText(ad.billCity);
		billState.setText(ad.billState);
		billZip.setText(ad.billZip);
		billCountry.selectByVisibleText(ad.billCountry);
		securePurchase.click();
		

	}

	public void assertPageDisplay() {
		assertEquals(headingImage.isDisplayed(), true, summary);
	}
}
