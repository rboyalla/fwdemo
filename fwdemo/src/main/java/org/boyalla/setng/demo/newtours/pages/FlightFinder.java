package org.boyalla.setng.demo.newtours.pages;

import org.boyalla.setng.fw.api.pom.htmelements.Button;
import org.boyalla.setng.fw.api.pom.htmelements.DropdownList;
import org.boyalla.setng.fw.api.pom.htmelements.Font;
import org.boyalla.setng.fw.api.pom.htmelements.RadioGroup;
import org.boyalla.setng.fw.api.pom.page.BasePage;

/**
 * 
 * 
 * @author Raveendra Boyalla
 * 
 * 
 */

public class FlightFinder extends BasePage {

	String flightDetailsHeadingText = "Flight Details";

	Font flightDetailsHeading = Font.byXpath("//form[@name=\"findflight\"]//font[@color=\"#000000\"]");
	RadioGroup tripType = RadioGroup.byName("tripType");
	DropdownList passCount = DropdownList.byName("passCount");
	DropdownList departing = DropdownList.byName("fromPort");
	DropdownList fromMonth = DropdownList.byName("fromMonth");
	DropdownList fromDay = DropdownList.byName("fromDay");
	DropdownList toMonthF = DropdownList.byName("toMonth");
	DropdownList toDayF = DropdownList.byName("toDay");
	DropdownList toPort = DropdownList.byName("toPort");
	RadioGroup servClass = RadioGroup.byName("servClass");
	Button findFlightsF = Button.byName("findFlights");

	public void assertPageDisplay() {
		assertEquals(flightDetailsHeading.getText(), flightDetailsHeadingText);
	}

	public void enterPassangerDetails(String oneWay, String noOfPassangers, String fromPort, String startMonth,
			String strtDay, String toMonth, String toDay, String toCityPort, String klass) {
		tripType.selectByValue(oneWay);
		passCount.selectByValue(noOfPassangers);
		departing.selectByValue(fromPort);
		fromMonth.selectByValue(startMonth);
		fromDay.selectByValue(strtDay);
		toMonthF.selectByValue(toMonth);
		toDayF.selectByValue(toDay);
		toPort.selectByValue(toCityPort);
		servClass.selectByValue(klass);
		findFlightsF.click();
	}
}
