package org.boyalla.setng.demo.newtours.sets;

import org.boyalla.setng.demo.newtours.tests.EnterCreditCardAndBookFlightTest;
import org.boyalla.setng.demo.newtours.tests.EnterPassangerDetailsTest;
import org.boyalla.setng.demo.newtours.tests.HomePageTest;
import org.boyalla.setng.demo.newtours.tests.LoginTest;
import org.boyalla.setng.demo.newtours.tests.LogoutTest;
import org.boyalla.setng.demo.newtours.tests.ReserverFlightsTest;
import org.boyalla.setng.fw.api.suites.BaseFactorySet;
import org.boyalla.setng.fw.api.suites.TestSet;
import org.boyalla.setng.fw.api.tests.QuitBrowserTest;

/**
 * 
 * 
 * @author Raveendra Boyalla
 * 
 *
 */

public class RegSet extends BaseFactorySet {

	@Override
	protected TestSet testsToRun() {

		TestSet set = new TestSet();
		set.startDependency();
		set.add(HomePageTest.class);
		set.add(LoginTest.class);
		set.add(EnterPassangerDetailsTest.class);
		set.add(ReserverFlightsTest.class);
		set.add(EnterCreditCardAndBookFlightTest.class);
		set.add(LogoutTest.class);
		set.endDependency();

		set.add(QuitBrowserTest.class);

		return set;
	}
}
