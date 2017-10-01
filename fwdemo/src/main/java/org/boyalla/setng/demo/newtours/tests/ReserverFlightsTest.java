package org.boyalla.setng.demo.newtours.tests;

import org.boyalla.setng.demo.newtours.pages.SelectFlight;
import org.boyalla.setng.fw.api.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * 
 * 
 * @author Raveendra Boyalla
 *  
 *
 */

public class ReserverFlightsTest extends BaseTest {

	@Test
	public void reserverFlights() {
		page(SelectFlight.class).reserveFlights();

	}
}
