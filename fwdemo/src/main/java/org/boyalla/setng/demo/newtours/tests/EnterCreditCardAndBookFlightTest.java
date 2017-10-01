package org.boyalla.setng.demo.newtours.tests;

import java.net.MalformedURLException;

import org.boyalla.setng.demo.newtours.data.Address;
import org.boyalla.setng.demo.newtours.data.CrediCardDetails;
import org.boyalla.setng.demo.newtours.data.Passengers;
import org.boyalla.setng.demo.newtours.pages.BookFlight;
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

public class EnterCreditCardAndBookFlightTest extends BaseTest {

	@Test(dataProvider = DATA_PROVIDER)
	public void enterCardDetails(Passengers pd, Address ad, CrediCardDetails cd)
			throws MalformedURLException {

		page(BookFlight.class).enterCardDetails(pd,ad,cd);

	}

	@DataProvider(name = DATA_PROVIDER)
	public Object[][] getData() {
		
		Passengers pd=new Passengers();
		pd.firstNmae="Raveendra";
		pd.middleName="Reddy";
		pd.lastName="Boyalla";
		
		Address ad=new Address();
		ad.billAddress1="1111-2222 Finch Avenue";
		ad.billCity= "Scarborough";
		ad.billState="ON";
		ad.billZip="435343";
		ad.billCountry="CANADA";
		CrediCardDetails cd=new CrediCardDetails();
		cd.cardNumber="123456789";
		cd.expirationDate="05";
		cd.expirationYear="2007";
		cd.cc_frst_name="raveendra";
		cd.cc_mid_name="reddy";
		cd.cc_last_name="Boyalla";
		cd.creditCardType="AX";
		
		
		
		return new Object[][] { { pd,ad,cd } };
	}

	 
	
}
