package org.boyalla.setng.demo.newtours.tests;

import java.net.MalformedURLException;

import org.boyalla.setng.demo.newtours.pages.FlightFinder;
import org.boyalla.setng.fw.api.tests.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EnterBookFlightDetailsTest extends BaseTest {

	@Test(dataProvider = DATA_PROVIDER)
	public void enterPassangerDetails(String oneWay, String noOfPassangers, String fromPort, String startMonth,
			String strtDay, String toMonth, String toDay, String toCityPort, String klass)
			throws MalformedURLException {

		page(FlightFinder.class).enterPassangerDetails(oneWay, noOfPassangers, fromPort, startMonth, strtDay, toMonth,
				toDay, toCityPort, klass);

	}

	@DataProvider(name = DATA_PROVIDER)
	public Object[][] getData() {
		return new Object[][] { { "oneway", "2", "London", "4", "11", "5", "17", "New York", "Business" } };
	}

}
